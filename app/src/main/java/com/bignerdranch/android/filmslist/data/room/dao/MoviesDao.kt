package com.bignerdranch.android.filmslist.data.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bignerdranch.android.filmslist.models.MoviesItemModel


@Dao
interface MoviesDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(moviesItemModel: MoviesItemModel)

    @Delete
    suspend fun delete(moviesItemModel: MoviesItemModel)

    @Query("SELECT * from movie_table")
    fun getAllMovies(): LiveData<List<MoviesItemModel>>
}