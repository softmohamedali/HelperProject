package com.moali.basehelper.prices.presentation.home

import androidx.lifecycle.ViewModel
import basehelper.composeapp.generated.resources.Res
import basehelper.composeapp.generated.resources.coin1
import basehelper.composeapp.generated.resources.goldBar
import basehelper.composeapp.generated.resources.moneyExchangesolid
import basehelper.composeapp.generated.resources.notification
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import org.jetbrains.compose.resources.DrawableResource

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: DrawableResource,
    val hasNews: Boolean,
    val badgeCount: Int? = null
)


val items = listOf(
    BottomNavigationItem(
        title = "Currency",
        selectedIcon = Res.drawable.coin1,
        hasNews = false,
    ),
    BottomNavigationItem(
        title = "Gold & Silver",
        selectedIcon = Res.drawable.goldBar,
        hasNews = false,
    ),
    BottomNavigationItem(
        title = "Exchange",
        selectedIcon = Res.drawable.moneyExchangesolid,
        hasNews = false,
    ),
    BottomNavigationItem(
        title = "Notification",
        selectedIcon = Res.drawable.notification,
        hasNews = true,
    ),
)

class HomeViewModel: ViewModel(){

    private val _state = MutableStateFlow(HomeState())
    val state = _state.asStateFlow()


        fun onAction(action: HomeActions) {
        when (action) {
            is HomeActions.OnTabSelected -> {
                _state.update {
                    it.copy(selectedTabIndex = action.index)
                }
            }

        }
    }

}