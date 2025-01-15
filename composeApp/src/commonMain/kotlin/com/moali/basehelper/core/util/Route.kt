package com.moali.basehelper.core.util
import kotlinx.serialization.Serializable

sealed interface Route {

    @Serializable
    data object CurrencyGraph: Route

    @Serializable
    data object Splash: Route
    @Serializable
    data object CurrencyList: Route
    @Serializable
    data object Home: Route

//    @Serializable
//    data class BookDetail(val id: String): Route
}