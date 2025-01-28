package com.moali.basehelper

import android.app.PendingIntent
import android.content.Intent
import android.nfc.NdefMessage
import android.nfc.NfcAdapter
import android.nfc.Tag
import android.nfc.tech.Ndef
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import com.moali.basehelper.app.App

class MainActivity : ComponentActivity() {

    private lateinit var nfcAdapter: NfcAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App(
                darkTheme = isSystemInDarkTheme(),
                dynamicColor =true
            )
        }

        nfcAdapter = NfcAdapter.getDefaultAdapter(this)
        if (nfcAdapter == null) {
            Toast.makeText(this, "NFC not supported on this device.", Toast.LENGTH_SHORT).show()
            finish()
        }
    }


    override fun onResume() {
        super.onResume()
        if (nfcAdapter != null) {
            // Enable foreground dispatch to handle NFC intents
            val intent = Intent(this, javaClass).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_MUTABLE)
            nfcAdapter.enableForegroundDispatch(this, pendingIntent, null, null)
        }
    }

    override fun onPause() {
        super.onPause()
        if (nfcAdapter != null) {
            // Disable foreground dispatch when the app is paused
            nfcAdapter.disableForegroundDispatch(this)
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        // Handle the NFC tag
        if (NfcAdapter.ACTION_TAG_DISCOVERED == intent.action) {
            val tag: Tag? = intent.getParcelableExtra(NfcAdapter.EXTRA_TAG)
            if (tag != null) {
                // Process the NFC tag
                processTag(tag)
            }
        }
    }


    private fun processTag(tag: Tag) {
        val ndef = Ndef.get(tag)
        if (ndef != null) {
            try {
                ndef.connect()
                val ndefMessage: NdefMessage? = ndef.ndefMessage
                if (ndefMessage != null) {
                    val payload = String(ndefMessage.records[0].payload)
                    Log.d("NFC", "Payload: $payload")
                    Toast.makeText(this, "Payload: $payload", Toast.LENGTH_SHORT).show()
                }
                ndef.close()
            } catch (e: Exception) {
                Log.e("NFC", "Error reading NFC tag", e)
            }
        }
    }
}



