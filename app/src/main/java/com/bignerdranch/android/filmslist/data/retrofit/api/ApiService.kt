package com.bignerdranch.android.filmslist.data.retrofit.api

import com.bignerdranch.android.filmslist.models.Extra
import com.bignerdranch.android.filmslist.models.ImageModelList
import com.bignerdranch.android.filmslist.models.Photo
import com.bignerdranch.android.filmslist.models.Photos
import retrofit2.http.GET



interface ApiService {
    @GET("services/rest/?method=flickr.interestingness.getList&api_key=0c4ea72ad7005c6f05d5b39c633d0e20&format=json&nojsoncallback=1&extras=url_s")
    suspend fun getPopularMovie(): retrofit2.Response<Photos>
}