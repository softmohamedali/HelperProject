package com.moali.basehelper.core.util

import androidx.compose.ui.unit.LayoutDirection
import com.moali.basehelper.ui.resources.strings.IStringResources
import com.moali.basehelper.ui.resources.strings.ar.Arabic
import com.moali.basehelper.ui.resources.strings.en.English

object LocalizationManager {

    fun getStringResources(languageCode: LanguageCode): IStringResources {
        return when (languageCode) {
            LanguageCode.EN -> English()
            LanguageCode.AR -> Arabic()

        }
    }

    fun getLayoutDirection(languageCode: LanguageCode): LayoutDirection {
        return when (languageCode) {
            LanguageCode.EN -> LayoutDirection.Ltr
            else -> LayoutDirection.Rtl
        }
    }
}
