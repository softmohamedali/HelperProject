package com.moali.basehelper.prices.presentation.user.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.jetbrains.compose.resources.ExperimentalResourceApi

class SplashScreen: Screen {
    @OptIn(ExperimentalResourceApi::class)
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Box(
            modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center,
        ){
            Image(
//                painter = painterResource(Resources.images.mahlyImg),
                imageVector = Icons.Default.Home,
                contentDescription = null

            )
        }
    }


}