package com.moali.basehelper

import android.app.Application
import com.moali.basehelper.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MyApp)
        }
    }
}