package com.moali.basehelper.di

import com.moali.basehelper.shared.di.platformModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(platformModule,networkModule,viewModels,repositoryModule,useCases)
    }
}