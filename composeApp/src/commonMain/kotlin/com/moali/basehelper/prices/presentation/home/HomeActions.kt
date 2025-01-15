package com.moali.basehelper.prices.presentation.home


sealed interface HomeActions {
    data class OnTabSelected(val index: Int): HomeActions
}