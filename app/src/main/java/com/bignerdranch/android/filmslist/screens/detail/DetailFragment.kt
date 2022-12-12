package com.bignerdranch.android.filmslist.screens.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.filmslist.MAIN
import com.bignerdranch.android.filmslist.R
import com.bignerdranch.android.filmslist.databinding.FragmentDetailBinding
import com.bignerdranch.android.filmslist.databinding.FragmentMainBinding
import com.bignerdranch.android.filmslist.models.MoviesItemModel
import com.bignerdranch.android.filmslist.models.MoviesModel
import com.bignerdranch.android.filmslist.screens.favorit.FavoriteAdapter
import com.bignerdranch.android.filmslist.screens.favorit.FavoriteFragmentViewModel
import com.bignerdranch.android.filmslist.screens.main.MainAdapter
import com.bumptech.glide.Glide


class DetailFragment : Fragment() {

    private var mBinding: FragmentDetailBinding?= null
    private val binding get() = mBinding!!
    lateinit var currentMovie: MoviesItemModel
    private var isFavorite = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        currentMovie = arguments?.getSerializable(/* key = */ "movie") as MoviesItemModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        val viewModel = ViewModelProvider(this).get(DetailFragmentViewModel ::class.java)
        Glide.with(MAIN)
            .load("https://www.themoviedb.org/t/p/w600_and_h900_bestv2${currentMovie.poster_path}")
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_favorite_border_24)
            .into(binding.imgDetail)
        binding.tvTitle.text = currentMovie.title
        binding.tvDate2.text = currentMovie.release_date

        binding.imageDetailFavorite.setOnClickListener {
            if(!isFavorite) {
                binding.imageDetailFavorite.setImageResource(R.drawable.ic_baseline_favorite_24)
                isFavorite = true
            }
            else {
                binding.imageDetailFavorite.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                isFavorite = false
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mBinding = null
    }

}