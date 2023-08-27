package br.com.connexaoinformatica.screenmatch.principal;

import br.com.connexaoinformatica.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.connexaoinformatica.screenmatch.modelos.Titulo;
import br.com.connexaoinformatica.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main (String [] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o filme que está buscando : ");
        String busca =  sc.nextLine();
        String endereco = "https://www.omdbapi.com/?t="+ busca.replace(" ", "+") +"&apikey=939141de";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gs = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            //Titulo meuTitulo = gs.fromJson();
            TituloOmdb meuTituloOmdb = gs.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo já convertido ");
            System.out.println(meuTitulo);

        }catch(ErroDeConversaoDeAnoException e ){
            System.out.println(e.getMessage(json, TituloOmdb.class));
        }


    }
}
