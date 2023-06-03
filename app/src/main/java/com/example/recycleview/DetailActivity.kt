package br.com.cotemig.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.recycleview.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        val Titulo = intent.getStringExtra("titulo")
        val Descricao = intent.getStringExtra("descricao")
        val Data_publicacao = intent.getStringExtra("data_publicacao")
        val Imagem = intent.getStringExtra("imagem")

        findViewById<TextView>(R.id.tvTituloDetail).text = Titulo
        findViewById<TextView>(R.id.tvDescricaoDetail).text = Descricao
        findViewById<TextView>(R.id.tvDataPublicacaoDetail).text = Data_publicacao

        Glide
            .with(this)
            .load(Imagem)
            .into(findViewById(R.id.ivImagemDetail))

        findViewById<Button>(R.id.btnVoltar).setOnClickListener {
            finish()
        }
    }
}