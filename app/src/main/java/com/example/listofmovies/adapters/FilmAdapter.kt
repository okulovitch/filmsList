package com.example.listofmovies.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.domain.models.Film
import com.example.listofmovies.R
import java.util.*







class FilmAdapter : RecyclerView.Adapter<FilmAdapter.ViewHolder>() {

    private val  mFilmList: MutableList<Film> = LinkedList()
    fun setData(newFilms: List<Film>){
        mFilmList.clear()
        mFilmList.addAll(newFilms)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(itemView =  LayoutInflater.from(viewGroup.context).inflate(R.layout.cell_film,viewGroup,false))
    }

    override fun getItemCount(): Int {
    return mFilmList.count()
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(model =mFilmList[position] )
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        private val txtTitle: TextView = itemView.findViewById(R.id.titleEng)
        private val txtDate: TextView = itemView.findViewById(R.id.datePremiere)
        private val imageFilm: ImageView = itemView.findViewById(R.id.ivPoster)

        fun  bind(model : Film){
            val filmPhotoUrl = model.image
            txtDate.text = model.name_eng
            txtDate.text = model.premiere


        }
    }
}