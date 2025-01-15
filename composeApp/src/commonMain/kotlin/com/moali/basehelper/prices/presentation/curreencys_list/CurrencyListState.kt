package com.moali.basehelper.prices.presentation.curreencys_list

import com.moali.basehelper.core.presentation.UiText
import com.moali.basehelper.prices.presentation.curreencys_list.components.CurrencyUI



data class CurrencyListState(
    val currencys: List<CurrencyUI> = emptyList(),
    val isLoading: Boolean = true,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)