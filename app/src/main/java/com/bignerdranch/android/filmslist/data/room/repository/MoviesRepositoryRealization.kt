package com.bignerdranch.android.filmslist.data.room.repository

import androidx.lifecycle.LiveData
import com.bignerdranch.android.filmslist.data.room.dao.MoviesDao
import com.bignerdranch.android.filmslist.models.MoviesItemModel

class MoviesRepositoryRealization(private val moviesDao: MoviesDao): MoviesRepository {
    override val allMovies: LiveData<List<MoviesItemModel>>
        get() = moviesDao.getAllMovies()

    override suspend fun insertMovie(moviesItemModel: MoviesItemModel, onSuccess: () -> Unit) {
        moviesDao.insert(moviesItemModel)
        onSuccess()
    }

    override suspend fun deleteMovie(moviesItemModel: MoviesItemModel, onSuccess: () -> Unit) {
        moviesDao.delete(moviesItemModel)
        onSuccess()
    }


}