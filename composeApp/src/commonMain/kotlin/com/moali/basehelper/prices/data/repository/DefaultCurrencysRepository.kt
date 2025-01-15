package com.moali.basehelper.prices.data.repository


import com.moali.basehelper.prices.domain.repository.CurrencysRepository

class DefaultCurrencysRepository(
//    private val remoteBookDataSource: RemoteBookDataSource,
//    private val favoriteBookDao: FavoriteBookDao
): CurrencysRepository {
//    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
//        return remoteBookDataSource
//            .searchBooks(query)
//            .map { dto ->
//                dto.results.map { it.toBook() }
//            }
//    }
//
//    override suspend fun getBookDescription(bookId: String): Result<String?, DataError> {
//        val localResult = favoriteBookDao.getFavoriteBook(bookId)
//
//        return if(localResult == null) {
//            remoteBookDataSource
//                .getBookDetails(bookId)
//                .map { it.description }
//        } else {
//            Result.Success(localResult.description)
//        }
//    }
//
//    override fun getFavoriteBooks(): Flow<List<Book>> {
//        return favoriteBookDao
//            .getFavoriteBooks()
//            .map { bookEntities ->
//                bookEntities.map { it.toBook() }
//            }
//    }
//
//    override fun isBookFavorite(id: String): Flow<Boolean> {
//        return favoriteBookDao
//            .getFavoriteBooks()
//            .map { bookEntities ->
//                bookEntities.any { it.id == id }
//            }
//    }
//
//    override suspend fun markAsFavorite(book: Book): EmptyResult<DataError.Local> {
//        return try {
//            favoriteBookDao.upsert(book.toBookEntity())
//            Result.Success(Unit)
//        } catch(e: SQLiteException) {
//            Result.Error(DataError.Local.DISK_FULL)
//        }
//    }
//
//    override suspend fun deleteFromFavorites(id: String) {
//        favoriteBookDao.deleteFavoriteBook(id)
//    }
}