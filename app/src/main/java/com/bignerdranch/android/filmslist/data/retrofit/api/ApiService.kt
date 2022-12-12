package com.bignerdranch.android.filmslist.data.retrofit.api

import com.bignerdranch.android.filmslist.models.*
import retrofit2.http.GET



interface ApiService {
    @GET("3/movie/popular?api_key=a5ba47a7ca3e23a9d83875a1a28d5448&language=en-US&page=1")
    suspend fun getPopularMovie(): retrofit2.Response<MoviesModel>
}