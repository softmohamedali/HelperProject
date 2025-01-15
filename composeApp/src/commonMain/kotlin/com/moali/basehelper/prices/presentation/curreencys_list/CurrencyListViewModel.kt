package com.moali.basehelper.prices.presentation.curreencys_list

import androidx.lifecycle.ViewModel
import com.moali.basehelper.prices.domain.repository.CurrencysRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow


class CurrencyListViewModel(
    private val bookRepository: CurrencysRepository
) : ViewModel() {

//    private var cachedBooks = emptyList<Book>()
//    private var searchJob: Job? = null
//    private var observeFavoriteJob: Job? = null
//
    private val _state = MutableStateFlow(CurrencyListState())
    val state = _state.asStateFlow()
//    val state = _state
//        .onStart {
//            if(cachedBooks.isEmpty()) {
//                observeSearchQuery()
//            }
//            observeFavoriteBooks()
//        }
//        .stateIn(
//            viewModelScope,
//            SharingStarted.WhileSubscribed(5000L),
//            _state.value
//        )
//
//    fun onAction(action: BookListAction) {
//        when (action) {
//            is BookListAction.OnBookClick -> {
//
//            }
//
//            is BookListAction.OnSearchQueryChange -> {
//                _state.update {
//                    it.copy(searchQuery = action.query)
//                }
//            }
//
//            is BookListAction.OnTabSelected -> {
//                _state.update {
//                    it.copy(selectedTabIndex = action.index)
//                }
//            }
//        }
//    }
//
//    private fun observeFavoriteBooks() {
//        observeFavoriteJob?.cancel()
//        observeFavoriteJob = bookRepository
//            .getFavoriteBooks()
//            .onEach { favoriteBooks ->
//                _state.update { it.copy(
//                    favoriteBooks = favoriteBooks
//                ) }
//            }
//            .launchIn(viewModelScope)
//    }
//
//    private fun observeSearchQuery() {
//        state
//            .map { it.searchQuery }
//            .distinctUntilChanged()
//            .debounce(500L)
//            .onEach { query ->
//                when {
//                    query.isBlank() -> {
//                        _state.update {
//                            it.copy(
//                                errorMessage = null,
//                                searchResults = cachedBooks
//                            )
//                        }
//                    }
//
//                    query.length >= 2 -> {
//                        searchJob?.cancel()
//                        searchJob = searchBooks(query)
//                    }
//                }
//            }
//            .launchIn(viewModelScope)
//    }
//
//    private fun searchBooks(query: String) = viewModelScope.launch {
//        _state.update {
//            it.copy(
//                isLoading = true
//            )
//        }
//        bookRepository
//            .searchBooks(query)
//            .onSuccess { searchResults ->
//                _state.update {
//                    it.copy(
//                        isLoading = false,
//                        errorMessage = null,
//                        searchResults = searchResults
//                    )
//                }
//            }
//            .onError { error ->
//                _state.update {
//                    it.copy(
//                        searchResults = emptyList(),
//                        isLoading = false,
//                        errorMessage = error.toUiText()
//                    )
//                }
//            }
//    }

}