package com.moali.basehelper.prices.presentation.curreencys_list

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.moali.basehelper.prices.presentation.curreencys_list.components.CurrencyListView
import org.koin.compose.viewmodel.koinViewModel


@Composable
fun CurrencyListScreen(
    viewModel: CurrencyListViewModel = koinViewModel(),
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    CurrencyListView(
        state = state,
    )
}