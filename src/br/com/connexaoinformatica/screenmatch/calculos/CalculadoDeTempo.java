package br.com.connexaoinformatica.screenmatch.calculos;

import br.com.connexaoinformatica.screenmatch.modelos.Titulo;

public class CalculadoDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {

        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal += f.getDuracaEmMinutos();
//    }
    public void inclui(Titulo titulo){

        this.tempoTotal += titulo.getDuracaEmMinutos();
    }
}
