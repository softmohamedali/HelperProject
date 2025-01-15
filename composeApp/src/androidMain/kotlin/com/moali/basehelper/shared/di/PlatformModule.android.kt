package com.moali.basehelper.shared.di

import org.koin.core.module.Module
//import com.moali.crypto..data.database.DatabaseFactory
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.okhttp.OkHttp
import org.koin.dsl.module

actual val platformModule: Module
    get() = module {
        single<HttpClientEngine> { OkHttp.create() }
//        single { DatabaseFactory(androidApplication()) }
    }