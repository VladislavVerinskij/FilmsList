package com.bignerdranch.android.filmslist.screens.favorit

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.bignerdranch.android.filmslist.REALISATION
import com.bignerdranch.android.filmslist.data.room.repository.MoviesRepositoryRealization
import com.bignerdranch.android.filmslist.models.MoviesItemModel

class FavoriteFragmentViewModel : ViewModel() {


    fun getAllMovies(): LiveData<List<MoviesItemModel>> {
        return REALISATION.allMovies
    }
}