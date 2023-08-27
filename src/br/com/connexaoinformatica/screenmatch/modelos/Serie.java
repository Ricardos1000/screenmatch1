package br.com.connexaoinformatica.screenmatch.modelos;

public class Serie extends Titulo {

        private int temporadas;

        private int espisodiosPorTemporada;
        private boolean ativa;
        private int minutosPorEpisisodio;

        public Serie(String nome, int anoDelancamento) {
                super(nome, anoDelancamento);
        }

        public int getTemporadas() {

                return temporadas;
        }

        public void setTemporadas(int temporadas) {

                this.temporadas = temporadas;
        }

        public int getEspisodiosPorTemporada() {

                return espisodiosPorTemporada;
        }

        public void setEspisodiosPorTemporada(int espisodiosPorTemporada) {

                this.espisodiosPorTemporada = espisodiosPorTemporada;
        }

        public boolean isAtiva() {

                return ativa;
        }

        public void setAtiva(boolean ativa) {

                this.ativa = ativa;
        }

        public int getMinutosPorEpisisodio() {

                return minutosPorEpisisodio;
        }

        public void setMinutosPorEpisisodio(int minutosPorEpisisodio) {

                this.minutosPorEpisisodio = minutosPorEpisisodio;
        }
        @Override
        public int getDuracaEmMinutos() {
                return getMinutosPorEpisisodio() * getTemporadas() * getEspisodiosPorTemporada();
        }

        @Override
        public String toString() {
                return "Série :"
                        + getNome() +" : \n"+
                        "- Ano de Lançamento : " + getAnoDelançamento() +"\n"+
                        "- Incluiso no Plano : " + isIncluidoNoPlano() +"\n"+
                        "- Total de Avaliacao : " + getAvaliacao() +"\n"+
                        "- Duracão em Minutos : " + getMinutosPorEpisisodio() +"\n"+
                        "- Temporadas : " + getTemporadas() +"\n"+
                        "- Episódios por Temporada  : " + getEspisodiosPorTemporada() +"\n"+
                        "-, Quantidade de minutos para assistir toda Série : "+getDuracaEmMinutos() +"\n"+
                        "- Avaliações Média : "+ pegaMedia()
                        ;
        }
}
