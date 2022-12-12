package com.bignerdranch.android.filmslist.screens.main

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bignerdranch.android.filmslist.data.retrofit.api.RetrofitRepository
import com.bignerdranch.android.filmslist.data.room.MoviesRoomDatabase
import com.bignerdranch.android.filmslist.data.room.repository.MoviesRepositoryRealization
import com.bignerdranch.android.filmslist.models.MoviesModel
import kotlinx.coroutines.launch
import retrofit2.Response

class MainFragmentViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = RetrofitRepository()
    lateinit var realisation : MoviesRepositoryRealization
    val myMovies: MutableLiveData<Response<MoviesModel>> = MutableLiveData()
    val context = application


    fun getMoviesRetrofit() {
        viewModelScope.launch {
            try {
                myMovies.value = repository.getMovies()

            }catch (e:Exception){
                Log.e("ERROR", e.message.toString())
            }

        }
    }
    fun initDatabase() {
        val daoMovie = MoviesRoomDatabase.getInstance(context).getMovieDao()
        realisation = MoviesRepositoryRealization(daoMovie)

    }


}