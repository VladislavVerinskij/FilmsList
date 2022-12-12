package com.bignerdranch.android.filmslist.data.room.repository

import androidx.lifecycle.LiveData
import com.bignerdranch.android.filmslist.models.MoviesItemModel

interface MoviesRepository {


    val allMovies: LiveData<List<MoviesItemModel>>
    suspend fun insertMovie(moviesItemModel: MoviesItemModel, onSuccess:() -> Unit)
    suspend fun deleteMovie(moviesItemModel: MoviesItemModel, onSuccess:() -> Unit)

}