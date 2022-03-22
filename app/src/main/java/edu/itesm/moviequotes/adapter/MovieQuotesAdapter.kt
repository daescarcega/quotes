package edu.itesm.moviequotes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.itesm.moviequotes.R
import edu.itesm.moviequotes.data.Quote

class MovieQuotesAdapter ( private val lista: List<Quote>) :
                RecyclerView.Adapter< MovieQuotesAdapter.MovieQuoteViewHolder>(){

    class MovieQuoteViewHolder(view: View) : RecyclerView.ViewHolder(view){
                val source : TextView = view.findViewById(R.id.titulo)
                val texto : TextView = view.findViewById(R.id.texto)
                fun bind(quote : Quote){
                    source.text = quote.source
                    texto.text = quote.text
                }
    }

    // Construye el renglon PERO no le da datos a los elmentos gráficos
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieQuoteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.renglon, parent, false)
        return MovieQuoteViewHolder(view)
    }
    override fun onBindViewHolder(holder: MovieQuoteViewHolder, position: Int) {
        val quote = lista[position]
        holder.bind(quote)
    }
    override fun getItemCount() = lista.size

}
