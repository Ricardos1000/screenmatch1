package br.com.connexaoinformatica.screenmatch.principal;

import br.com.connexaoinformatica.screenmatch.calculos.CalculadoDeTempo;
import br.com.connexaoinformatica.screenmatch.calculos.FiltroRecomendacao;
import br.com.connexaoinformatica.screenmatch.modelos.Episodio;
import br.com.connexaoinformatica.screenmatch.modelos.Filme;
import br.com.connexaoinformatica.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Filme meuFilme = new Filme("O poderoso Chefão",1970);
        meuFilme.setDiretor("Francis for Copolla");
        meuFilme.setAvaliacao(5);
        meuFilme.setDuracaEmMinutos(152);

        /** Avalição do filme */
        System.out.println("Que nota você da para o filme : "+ meuFilme.getNome());
        meuFilme.setAvaliacao(sc.nextDouble());

        /** Ficha Técnica do Filme */
        System.out.println("********************** Ficha Técnica do Filme ************************ \n" +  meuFilme.toString());
        System.out.println("Total de Avaliações do filme : " + meuFilme.getTotalDeAvaliacao());
        System.out.println("Media geral do meu : "+ meuFilme.pegaMedia());
        System.out.println();
        System.out.println("**********************--***************--************************");

        var outroFilme = new Filme("Avatar",2023);
        outroFilme.setDiretor("Spielberg");
        outroFilme.setAvaliacao(8);
        outroFilme.setDuracaEmMinutos(180);


        /** Avalição do filme */
        System.out.println("Que nota você da para o filme : "+ outroFilme.getNome());
        meuFilme.setAvaliacao(sc.nextDouble());

        /** Ficha Técnica do Filme */
        System.out.println("********************** Ficha Técnica do Filme ************************ \n" +  outroFilme.toString());
        System.out.println("Total de Avaliações do filme : " + outroFilme.getTotalDeAvaliacao());
        System.out.println("Media geral do meu : "+ outroFilme.pegaMedia());
        System.out.println();
        System.out.println("**********************--***************--************************");

        var filmeDoPaulo = new Filme("DogVille",2003);
        filmeDoPaulo.setDiretor("Spilberg");
        filmeDoPaulo.setAnoDelançamento(2003);
        filmeDoPaulo.setAvaliacao(10);

        /** Ficha Técnica do Filme */
        System.out.println("********************** Ficha Técnica do Filme ************************ \n" +  filmeDoPaulo.toString());
        System.out.println("Total de Avaliações do filme : " + filmeDoPaulo.getTotalDeAvaliacao());
        System.out.println("Media geral do meu : "+ filmeDoPaulo.pegaMedia());
        System.out.println();
        System.out.println("**********************--***************--************************");

        Serie lost = new Serie("Lost",2000);
        lost.setTemporadas(10);
        lost.setEspisodiosPorTemporada(10);
        lost.setMinutosPorEpisisodio(40);

        /** Avalição do Série */
        System.out.println("Que nota você da para a série : "+ lost.getNome());
        lost.setAvaliacao(sc.nextDouble());


        /** Ficha Técnica da Série  */
        System.out.println("************************ Ficha Técnica da Série ************************\n" +lost.toString());
        System.out.println("Total de Avaliações da Série : " + lost.getTotalDeAvaliacao());
        System.out.println("Media geral da Série : "+ lost.pegaMedia());

        CalculadoDeTempo calculadora = new CalculadoDeTempo();
        calculadora.inclui(lost);
        calculadora.inclui(meuFilme);

        System.out.println("Tempo total para assistir minha play list : " +calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
        System.out.println();
        System.out.println("**********************--***************--************************");

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Lista de Filmes " + listaDeFilmes+"\n");
        System.out.println("Tamanho da lista "+ listaDeFilmes.size());
        System.out.println("Exibir o filme na primeira posição "+ listaDeFilmes.get(0).toString());
        System.out.println();
        System.out.println("**********************--***************--************************");



    }
}