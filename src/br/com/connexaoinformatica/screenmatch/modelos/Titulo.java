package br.com.connexaoinformatica.screenmatch.modelos;

import java.lang.RuntimeException.*;
import br.com.connexaoinformatica.screenmatch.excecao.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable{

    private String nome;
    private int anoDelançamento;
    private boolean incluidoNoPlano;
    private double somaDaAvaliacao;
    private int totalDeAvaliacao;
    private int duracaEmMinutos;

    public Titulo(String nome, int anoDelancamento){

        this.nome = nome;
        this.anoDelançamento = anoDelancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb){
        this.nome = menuTituloOmdb.title();
        if(meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não foi possível a conversão, quantidade de caracter excedido!");
        }
        this.anoDelançamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));

    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getAnoDelançamento() {

        return anoDelançamento;
    }

    public void setAnoDelançamento(int anoDelançamento) {

        this.anoDelançamento = anoDelançamento;
    }

    public boolean isIncluidoNoPlano() {

        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {

        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getAvaliacao() {

        return somaDaAvaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.somaDaAvaliacao += avaliacao;
        this.totalDeAvaliacao++;
        //this.somaDaAvaliacao += avaliacao;
    }

    public int getTotalDeAvaliacao() {

        return totalDeAvaliacao;
    }

    public void setTotalDeAvaliacao(int totalDeAvaliacao) {

        this.totalDeAvaliacao += totalDeAvaliacao;
    }

    public int getDuracaEmMinutos() {

        return duracaEmMinutos;
    }

    public void setDuracaEmMinutos(int duracaEmMinutos) {

        this.duracaEmMinutos = duracaEmMinutos;
    }

    /*
    void avalia(double nota){
        this.somaDaAvaliacao += nota;
        this.totalDeAvaliacao++;
    }
    */
    public double pegaMedia(){
        if(getAvaliacao() > 0) {
            return this.somaDaAvaliacao / this.totalDeAvaliacao;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", anoDelançamento=" + anoDelançamento +
                ", duracaEmMinutos=" + duracaEmMinutos
                ;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        if(this.getNome().compareTo(outroTitulo.getNome())) {
            return 1;
        }else{
            return 0;
        }
    }
}
