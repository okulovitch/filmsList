package com.example.domain.repository.implementation

import com.example.domain.models.Film


class FilmRepositoryImpl {
       fun fetchFilms(): List<Film> {
           
        val mockData = ArrayList<Film>()
        mockData.add(
            Film(
                name = "fsafasfafs", premiere = "sadasdasd", image = "http://media.kino-govno.com/movies/i/inception/posters/inception_24s.jpg",
                description = "sadasd", name_eng = "asdasd"
            )
        )
           mockData.add(
               Film(
                   name = "fsafasfafs", premiere = "sadasdasd", image = "",
                   description = "sadasd", name_eng = "asdasd"
               )
           )
           mockData.add(
               Film(
                   name = "fsafasfafs", premiere = "sadasdasd", image = "",
                   description = "sadasd", name_eng = "asdasd"
               )
           )
          //add async after moc
        return mockData
    }
}