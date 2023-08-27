package br.com.connexaoinformatica.screenmatch.modelos;

import br.com.connexaoinformatica.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(String nome, int anoDelancamento) {
        super(nome, anoDelancamento);
    }

    public String getDiretor() {

        return diretor;
    }

    public void setDiretor(String diretor) {

        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme :"
                 + getNome() +": \n"+
                "- Ano de Lançamento : " + getAnoDelançamento() +"\n"+
                "- Incluso no Plano : " + isIncluidoNoPlano() +"\n"+
                "- Duraca do filme em Minutos = " + getDuracaEmMinutos() +"\n"+
                "- Total de Avaliacões = " + getTotalDeAvaliacao() +"\n"+
                "- Avaliações Média : "+ pegaMedia() +"\n"+
                "- Filme dirigido por : " + getDiretor()
                ;
    }

    @Override
    public int getClassificacao() {

        return (int)pegaMedia() /2;

    }

    @Override
    public int compareTo(Filme outroFilme) {

        return this.getNome().compareTo(outroFilme.getNome());

    }
}
