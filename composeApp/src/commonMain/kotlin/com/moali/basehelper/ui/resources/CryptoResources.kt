package com.moali.basehelper.ui.resources

import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.lifecycle.ViewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.moali.basehelper.core.util.Route
import com.moali.basehelper.core.util.LanguageCode
import com.moali.basehelper.core.util.LocalizationManager
import com.moali.basehelper.prices.presentation.curreencys_list.CurrencyListScreen
import com.moali.basehelper.prices.presentation.curreencys_list.CurrencyListViewModel
import com.moali.basehelper.prices.presentation.home.HomeScreen
import com.moali.basehelper.prices.presentation.home.HomeViewModel
import com.moali.basehelper.prices.presentation.user.splash.SplashScreen
import com.moali.basehelper.shared.utils.MyAppTheme
import com.moali.basehelper.ui.resources.strings.IStringResources
import com.moali.basehelper.ui.theme.lightScheme
import kotlinx.coroutines.delay
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel


private val localDrawableResources = staticCompositionLocalOf { DrawableResources() }
private val localStringResources = staticCompositionLocalOf<IStringResources> {
    error("CompositionLocal IStringResources not present")
}


object Resources {
    val images: DrawableResources
        @Composable
        @ReadOnlyComposable
        get() = localDrawableResources.current

    val strings: IStringResources
        @Composable
        @ReadOnlyComposable
        get() = localStringResources.current
}


@Composable
@Preview
fun CryptoResources(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    languageCode: LanguageCode,
) {
    androidx.compose.material3.MaterialTheme(
        colorScheme = lightScheme,
    ) {
        val drawableResources = if (darkTheme) DrawableResources() else DrawableResources()
        CompositionLocalProvider(
            localDrawableResources provides drawableResources,
            localStringResources provides LocalizationManager.getStringResources(languageCode),
        ) {
            MyAppTheme(
                darkTheme = darkTheme,
                dynamicColor = dynamicColor
            ) {

                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Route.CurrencyGraph
                ) {
                    navigation<Route.CurrencyGraph>(
                        startDestination = Route.Splash
                    ) {
                        composable<Route.Splash>(
                            exitTransition = { slideOutHorizontally() },
                            popEnterTransition = { slideInHorizontally() }
                        ) {
                            LaunchedEffect(true){
                                delay(2000)
                                navController.navigate(
                                    Route.Home
                                )
                            }
                            SplashScreen()
                        }

                        composable<Route.Home>(
                            exitTransition = { slideOutHorizontally() },
                            popEnterTransition = { slideInHorizontally() }
                        ) {
                            val viewModel = koinViewModel<HomeViewModel>()
                            HomeScreen(
                                viewModel=viewModel,
                                content = {destination->
                                    when (destination) {
                                        0 ->{
                                            val currencyListViewModel = koinViewModel<CurrencyListViewModel>()

                                            CurrencyListScreen(
                                                viewModel = currencyListViewModel,
                                            )
                                        }
                                        1 -> {
                                            Box { Text("sdfsdf") }
                                        }
                                        2 -> {
                                            Box { Text("sdfsddsdsdsf") }
                                        }
                                        3 -> {
                                            Box { Text("cxcxc") }
                                        }
                                    }
                                }
                            )
                        }

//                        composable<Route.BookDetail>(
//                            enterTransition = { slideInHorizontally { initialOffset ->
//                                initialOffset
//                            } },
//                            exitTransition = { slideOutHorizontally { initialOffset ->
//                                initialOffset
//                            } }
//                        ) {
//                            val selectedBookViewModel =
//                                it.sharedKoinViewModel<SelectedBookViewModel>(navController)
//                            val viewModel = koinViewModel<BookDetailViewModel>()
//                            val selectedBook by selectedBookViewModel.selectedBook.collectAsStateWithLifecycle()
//
//                            LaunchedEffect(selectedBook) {
//                                selectedBook?.let {
//                                    viewModel.onAction(BookDetailAction.OnSelectedBookChange(it))
//                                }
//                            }
//
//                            BookDetailScreenRoot(
//                                viewModel = viewModel,
//                                onBackClick = {
//                                    navController.navigateUp()
//                                }
//                            )
//                        }
                    }
                }

            }
        }
    }

}

@Composable
private inline fun <reified T: ViewModel> NavBackStackEntry.sharedKoinViewModel(
    navController: NavController
): T {
    val navGraphRoute = destination.parent?.route ?: return koinViewModel<T>()
    val parentEntry = remember(this) {
        navController.getBackStackEntry(navGraphRoute)
    }
    return koinViewModel(
        viewModelStoreOwner = parentEntry
    )
}