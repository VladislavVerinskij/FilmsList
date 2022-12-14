package com.bignerdranch.android.filmslist.screens.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bignerdranch.android.filmslist.REALISATION
import com.bignerdranch.android.filmslist.data.room.repository.MoviesRepositoryRealization
import com.bignerdranch.android.filmslist.models.MoviesItemModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailFragmentViewModel : ViewModel(){


    fun insert(moviesItemModel: MoviesItemModel, onSuccess:() -> Unit) =
        viewModelScope.launch (Dispatchers.IO) {
            REALISATION.insertMovie(moviesItemModel) {
                onSuccess
            }

        }
    fun delete(moviesItemModel: MoviesItemModel, onSuccess:() -> Unit) =
        viewModelScope.launch (Dispatchers.IO) {
            REALISATION.deleteMovie(moviesItemModel) {
                onSuccess
            }

        }

}