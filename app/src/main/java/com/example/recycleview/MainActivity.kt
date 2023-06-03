package com.example.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.cotemig.recyclerview.DetailActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // lista de filmes
        val arrayFilmes = ListaFilmes();

        // cria uma instancia da classe RecycleViewAdapter passando os parametros contexto, lista e o evento de click
        val adapter = RecycleViewAdapter(this, arrayFilmes) {
            val i = Intent(this, DetailActivity::class.java)
            i.putExtra("titulo", arrayFilmes[it].titulo)
            i.putExtra("descricao", arrayFilmes[it].descricao)
            i.putExtra("data_publicacao", arrayFilmes[it].data_publicacao)
            i.putExtra("imagem", arrayFilmes[it].imagem)
            startActivity(i)
        }

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = adapter
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


    }
    fun ListaFilmes(): ArrayList<FilmeModel> {
        val array = ArrayList<FilmeModel>()

        array.add(
            FilmeModel(
                "Carros",
                "Filme de animação sobre carros de corrida",
                "09/06/2006",
                "https://www.cafecomfilme.com.br/media/k2/items/cache/e13ee4b62d3db96de4569a439ec6257c_XL.jpg"
            )
        )
        array.add(
            FilmeModel(
                "Toy Story",
                "Filme de animação sobre brinquedos que ganham vida",
                "22/11/1995",
                "https://media.fstatic.com/lIOkPj_SHOZrjraFh4LRKmpTc28=/322x478/smart/filters:format(webp)/media/movies/covers/2010/12/1976bb35b69a00c294eb5decf0047db4.jpg"
            )
        )
        array.add(
            FilmeModel(
                "O Rei Leão",
                "Filme de animação sobre um leão que se torna rei da savana",
                "15/06/1994",
                "https://labdicasjornalismo.com/images/noticias/9353/26102021234656_rei.jpg"
            )
        )
        array.add(
            FilmeModel(
                "A Pequena Sereia",
                "Filme de animação sobre uma sereia que sonha em se tornar humana",
                "14/11/1989",
                "https://static.wikia.nocookie.net/disney/images/a/ab/Poster_A_Pequena_Sereia.png/revision/latest?cb=20150513033506&path-prefix=pt-br"
            )
        )
        array.add(
            FilmeModel(
                "Frozen",
                "Filme de animação sobre duas irmãs com poderes mágicos em um reino congelado",
                "27/11/2013",
                "https://upload.wikimedia.org/wikipedia/pt/e/e5/Frozen_2013.png"
            )
        )
        array.add(
            FilmeModel(
                "Aladdin",
                "Filme de animação sobre um jovem que encontra uma lâmpada mágica",
                "11/11/1992",
                "https://br.web.img3.acsta.net/pictures/210/506/21050616_20131017211827208.jpg"
            )
        )
        array.add(
            FilmeModel(
                "Moana",
                "Filme de animação sobre uma jovem aventureira que parte em uma jornada no oceano",
                "23/11/2016",
                "https://br.web.img3.acsta.net/pictures/16/09/12/22/13/415370.jpg"
            )
        )
        array.add(
            FilmeModel(
                "Enrolados",
                "Filme de animação baseado no conto de Rapunzel",
                "24/11/2010",
                "https://d3alv7ekdacjys.cloudfront.net/Custom/Content/Products/10/97/1097804_enrolados-filme-ms_m1_637382980813396097.jpg"
            )
        )
        array.add(
            FilmeModel(
                "Procurando Nemo",
                "Filme de animação sobre um peixe-palhaço em busca de seu filho",
                "30/05/2003",
                "https://fontmeme.com/images/Finding-Nemo-Poster.jpg"
            )
        )
        array.add(
            FilmeModel(
                "Zootopia",
                "Filme de animação sobre uma coelha policial que se junta a uma raposa vigarista para desvendar um caso",
                "04/03/2016",
                "https://br.web.img2.acsta.net/pictures/15/12/10/21/01/335612.jpg"
            )
        )
        array.add(
            FilmeModel(
                "Mulan",
                "Filme de animação sobre uma jovem que se disfarça de homem para lutar na guerra",
                "19/06/1998",
                "https://cinema10.com.br/upload/filmes/filmes_3399_Mulan.jpg"
            )
        )
        array.add(
            FilmeModel(
                "A Bela e a Fera",
                "Filme de animação sobre uma jovem que se apaixona por uma fera amaldiçoada",
                "29/09/1991",
                "https://www.infoescola.com/wp-content/uploads/2010/10/bela-e-a-fera.jpg"
            )
        )
        array.add(
            FilmeModel(
                "Operação Big Hero",
                "Filme de animação sobre um grupo de heróis que protege a cidade de San Fransokyo",
                "25/12/2014",
                "https://upload.wikimedia.org/wikipedia/pt/b/b0/Big-Hero-6-movie-poster.jpg"
            )
        )
        array.add(
            FilmeModel(
                "Pocahontas",
                "Filme de animação sobre a história de uma jovem indígena e um explorador inglês",
                "16/06/1995",
                "https://static.wikia.nocookie.net/disney/images/9/9d/Pocahontas_poster.png/revision/latest?cb=20150916222413&path-prefix=pt-br"
            )
        )
        array.add(
            FilmeModel(
                "Ratatouille",
                "Filme de animação sobre um rato que sonha em se tornar um chef de cozinha",
                "29/06/2007",
                "https://upload.wikimedia.org/wikipedia/pt/archive/8/82/20230429181018%21Ratatouille_p%C3%B4ster.jpg"
            )
        )
        array.add(
            FilmeModel(
                "A Princesa e o Sapo",
                "Filme de animação ambientado em Nova Orleans e baseado no conto do sapo-príncipe",
                "11/12/2009",
                "https://d3alv7ekdacjys.cloudfront.net/Custom/Content/Products/11/00/1100585_a-princesa-e-o-sapo-filme-ms_m1_637382972112497387.jpg"
            )
        )

        return array
    }
}


