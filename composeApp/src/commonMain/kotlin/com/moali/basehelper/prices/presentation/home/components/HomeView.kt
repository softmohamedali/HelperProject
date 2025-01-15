package com.moali.basehelper.prices.presentation.home.components

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Badge
import androidx.compose.material.BadgedBox
import androidx.compose.material.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.moali.basehelper.prices.presentation.home.HomeActions
import com.moali.basehelper.prices.presentation.home.HomeState
import com.moali.basehelper.prices.presentation.home.items
import org.jetbrains.compose.resources.painterResource


@Composable
fun HomeView(
    state:HomeState,
    onAction:(HomeActions)->Unit,
    content:@Composable (Int)->Unit
) {

    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = state.selectedTabIndex == index,
                        onClick = {
                            onAction(HomeActions.OnTabSelected(index))
                        },
                        label = {
                            Text(
                                text = item.title,
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp,
                                color = if (index == state.selectedTabIndex)
                                    MaterialTheme.colorScheme.primary
                                else
                                    Color.Black
                                ,
                            )
                        },
                        icon = {
                            BadgedBox(
                                badge = {
                                    if(item.badgeCount != null) {
                                        Badge {
                                            Text(text = item.badgeCount.toString())
                                        }
                                    } else if(item.hasNews) {
                                        Badge()
                                    }
                                }
                            ) {
                                Icon(
                                    modifier = Modifier.size(30.dp),
                                    painter = painterResource(item.selectedIcon),
                                    contentDescription = item.title,
                                    tint = if (index == state.selectedTabIndex)
                                        MaterialTheme.colorScheme.primary
                                    else
                                       Color.Black
                                    ,
                                )
                            }
                        }
                    )
                }
            }
        },
    ) {
        Crossfade(
            state.selectedTabIndex,
            modifier = Modifier.padding(it)
        ) { destination ->
            content(destination)
        }
    }


}
