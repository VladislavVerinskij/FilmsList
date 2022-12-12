package com.bignerdranch.android.filmslist.data.retrofit.api

import com.bignerdranch.android.filmslist.models.MoviesModel
import com.bignerdranch.android.filmslist.models.Photos
import retrofit2.Response

class RetrofitRepository {

    suspend fun getMovies(): Response<MoviesModel>{
        return RetrofitInstance.api.getPopularMovie()
    }

}