package br.com.connexaoinformatica.screenmatch.principal;

import br.com.connexaoinformatica.screenmatch.modelos.Filme;
import br.com.connexaoinformatica.screenmatch.modelos.Serie;
import br.com.connexaoinformatica.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalLista {
    public static void main(String[] args){
        Filme meuFilme = new Filme("O poderoso Chefão",1970);
        var outroFilme = new Filme("Avatar",2023);
        var filmeDoPaulo = new Filme("DogVille",2003);
        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> listaDeFilmes = new ArrayList<Titulo>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(lost);
        for (Titulo item: listaDeFilmes) {
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação" + filme.getClassificacao());
            }
            System.out.println(item.getNome());
        }
        //listaDeFilmes.forEach(item-> System.out.println(item));
        //listaDeFilmes.forEach(System.out::println);

        Collections.sort(listaDeFilmes);
        System.out.println(listaDeFilmes);

        ArrayList<String> buscaPorArtista  = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Jurandir");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);


    }
}
