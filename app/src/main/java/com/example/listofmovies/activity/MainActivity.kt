package com.example.listofmovies.activity

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.domain.models.Film
import com.example.listofmovies.R
import com.example.listofmovies.adapters.FilmAdapter
import com.example.listofmovies.presenter.FilmListPresenter
import com.example.listofmovies.view.FilmListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : MvpAppCompatActivity(), FilmListView {

    @InjectPresenter
    lateinit var filmsListPresenter: FilmListPresenter
    private val mAdapter = FilmAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupAdapter()

        filmsListPresenter.fetchFilms()

    }

    private fun setupAdapter() {
        val layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,false)
        recyclerViewFilmsList.layoutManager = layoutManager
        recyclerViewFilmsList.adapter = mAdapter
    }

    override fun presentFilms(data: List<Film>) {
        recyclerViewFilmsList.visibility = View.VISIBLE

        mAdapter.setData(newFilms = data)
    }
    override fun onDestroy() {
        super.onDestroy()
       // myCompositeDisposable?.clear()
    }

    override fun presentLoading() {
      recyclerViewFilmsList.visibility = View.GONE
    }


}
