package com.moali.basehelper.prices.presentation.curreencys_list


sealed interface CurrencyListActions {
    data class OnTabSelected(val index: Int): CurrencyListActions
}