package com.bignerdranch.android.filmslist.data.retrofit.api

import com.bignerdranch.android.filmslist.models.Photos
import retrofit2.Response

class RetrofitRepository {

    suspend fun getMovies(): Response<Photos>{
        return RetrofitInstance.api.getPopularMovie()
    }

}