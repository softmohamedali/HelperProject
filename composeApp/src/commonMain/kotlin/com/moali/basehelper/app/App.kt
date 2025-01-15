package com.moali.basehelper.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.*
import com.moali.basehelper.ui.resources.CryptoResources
import org.koin.compose.viewmodel.koinViewModel



@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean,
) {
    val appScreenModel: AppViewModel = koinViewModel()
    val userLanguage by appScreenModel.language.collectAsState()
    val firstTime by appScreenModel.isFirstTimeOpenApp.collectAsState()

    CryptoResources(
        languageCode = userLanguage,
        darkTheme = isSystemInDarkTheme(),
        dynamicColor =true
    )
//    {
//        if (firstTime) {
//            Navigator(PickLanguageScreen) { SlideTransition(it) }
//        } else {
//            Navigator(MainContainer) { SlideTransition(it) }
//        }
//    }
}

