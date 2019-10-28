package com.example.listofmovies.view

import com.arellomobile.mvp.MvpView
import com.example.domain.models.Film

interface FilmListView:MvpView {
    fun presentFilms(data: List<Film>)
    fun presentLoading()
}