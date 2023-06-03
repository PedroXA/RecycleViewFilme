package com.example.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

class RecycleViewAdapter(private val context: Context, private val list: ArrayList<FilmeModel>, val click: (position: Int) -> Unit) :
    RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val ivImagem: ImageView = view.findViewById(R.id.ivImagem)
        val tvTitulo: TextView = view.findViewById(R.id.tvTitulo)
        val tvDescricao: TextView = view.findViewById(R.id.tvDescricao)
        val tvData_publicacao: TextView = view.findViewById(R.id.tvDataPublicacao)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_recycleview,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTitulo.text = this.list[position].titulo
        holder.tvDescricao.text = this.list[position].descricao
        holder.tvData_publicacao.text = this.list[position].data_publicacao

        Glide
            .with(context)
            .load(list[position].imagem)
            .into(holder.ivImagem)

        holder.itemView.setOnClickListener {
            click(position)
        }
    }
}