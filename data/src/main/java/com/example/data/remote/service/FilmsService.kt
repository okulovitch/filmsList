package com.example.data.remote.service

import com.example.data.remote.models.FilmResult
import io.reactivex.Observable
import retrofit2.http.GET


interface FilmsService {

    @GET("57cffac8260000181e650041")
    fun getFilms(): Observable<FilmResult>

}