package com.example.listofmovies.presenter

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.domain.repository.implementation.FilmRepositoryImpl
import com.example.listofmovies.view.FilmListView

@InjectViewState
class FilmListPresenter: MvpPresenter<FilmListView>() {

    private val filmsRepositoryImpl = FilmRepositoryImpl()
    fun fetchFilms(){
        try{
            //add rx
            val films = filmsRepositoryImpl.fetchFilms()
            viewState.presentFilms(data = films)
        }catch (e: Exception){
            e.printStackTrace()
        }
//        val mockData = ArrayList<Film>()
//        viewState.presentFilms(data = mockData)
    }
}