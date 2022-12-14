package com.bignerdranch.android.filmslist

import com.bignerdranch.android.filmslist.data.room.repository.MoviesRepositoryRealization

lateinit var MAIN: MainActivity
const val BASE_URL = "https://api.themoviedb.org/"
lateinit var REALISATION : MoviesRepositoryRealization
//services/rest/?method=flickr.interestingness.getList&api_key=0c4ea72ad7005c6f05d5b39c633d0e20&format=json&nojsoncallback=1&extras=url_s