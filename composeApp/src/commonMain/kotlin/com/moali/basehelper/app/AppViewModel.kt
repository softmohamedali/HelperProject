package com.moali.basehelper.app

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.moali.basehelper.core.util.LanguageCode
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class AppViewModel (
//    private val manageUser: IManageSettingUseCase
):ViewModel() {
    private val _language: MutableStateFlow<LanguageCode> = MutableStateFlow(LanguageCode.EN)
    val language: StateFlow<LanguageCode> = _language.asStateFlow()

    private val _isFirstTimeOpenApp: MutableStateFlow<Boolean> = MutableStateFlow(false)
    val isFirstTimeOpenApp: StateFlow<Boolean> = _isFirstTimeOpenApp.asStateFlow()

    init {
        getUserLanguageCode()
        getInitScreen()
    }

    @OptIn(ExperimentalStdlibApi::class)
    private fun getUserLanguageCode() {
        viewModelScope.launch(Dispatchers.IO) {
//            manageUser.getUserLanguageCode().distinctUntilChanged().collectLatest { lang ->
//                _language.update {
//                    LanguageCode.entries.find { languageCode -> languageCode.value == lang }
//                        ?: LanguageCode.EN
//                }
//            }
        }
    }

    private fun getInitScreen() {
//        viewModelScope.launch(Dispatchers.IO) {
//            _isFirstTimeOpenApp.update { manageUser.getIsFirstTimeUseApp() }
//        }
    }
}