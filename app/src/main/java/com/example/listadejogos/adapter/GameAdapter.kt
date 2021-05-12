package com.example.listadejogos.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.listadejogos.R
import com.example.listadejogos.model.Game
import com.squareup.picasso.Picasso

class GameAdapter(private val list: ArrayList<Game>) : Adapter<GameAdapter.GameViewHolder>() {

    class GameAdapter(itemView: View) : RecyclerView.ViewHolder(itemView){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_game,parent,false)
        return GameViewHolder(view)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val games = list[position]
        holder.set(games)

        Picasso.get().load(games.imagem).into(holder.imageviewgod)

    }

    override fun getItemCount() = list.size

    class GameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val imageviewgod = itemView.findViewById<AppCompatImageView>(R.id.imagemGOD)
        val textViewTitulo = itemView.findViewById<AppCompatTextView>(R.id.textTitulo)
        val textViewLancamento = itemView.findViewById<AppCompatTextView>(R.id.textLancamento)
        val textViewNota = itemView.findViewById<AppCompatTextView>(R.id.textNota)

        fun set(games: Game) {
            textViewLancamento.text = games.imagem
            textViewTitulo.text = games.titulo
            textViewLancamento.text = games.lancamento
            textViewNota.text = games.nota
        }


    }

}