package com.moali.basehelper.prices.presentation.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.moali.basehelper.prices.presentation.home.components.HomeView
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = koinViewModel(),
    content:@Composable (Int)->Unit
){

    val state by viewModel.state.collectAsStateWithLifecycle()

    HomeView(
        state=state,
        onAction = { action ->
            viewModel.onAction(action)
        },
        content = content
    )


}




