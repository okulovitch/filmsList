package com.example.data.remote.models

import kotlinx.serialization.Serializable


@Serializable
data class FilmResult(val  result: List<FilmApi>)

@Serializable
data class FilmApi(val image: String, val name: String,val name_eng: String,
                   val premiere: String,val description: String)