package com.bignerdranch.android.filmslist.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "movie_table")
data class MoviesItemModel(

    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val poster_path: String,

    val title: String,

    val overview: String,

    val release_date: String,

) : Serializable