package com.bignerdranch.android.filmslist.models

data class MoviesModel(
    val page: Int,
    val results: List<MoviesItemModel>,
    val total_pages: Int,
    val total_results: Int
)