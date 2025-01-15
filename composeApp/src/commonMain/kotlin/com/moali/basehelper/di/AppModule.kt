package com.moali.basehelper.di



import com.moali.basehelper.app.AppViewModel
import com.moali.basehelper.prices.data.repository.DefaultCurrencysRepository
import com.moali.basehelper.prices.domain.repository.CurrencysRepository
import com.moali.basehelper.prices.presentation.curreencys_list.CurrencyListViewModel
import com.moali.basehelper.prices.presentation.home.HomeViewModel
import org.koin.dsl.bind
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import org.koin.core.module.dsl.singleOf



val useCases = module {
//    factory <LoginUseCase> { LoginUseCase(get()) }

}

val repositoryModule = module {
    singleOf(::DefaultCurrencysRepository).bind<CurrencysRepository>()
}


val viewModels = module {
    viewModel<CurrencyListViewModel> { CurrencyListViewModel(get()) }
    viewModel<HomeViewModel> { HomeViewModel() }
    viewModel<AppViewModel> { AppViewModel() }
}
