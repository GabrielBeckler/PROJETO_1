package Utils.API;

//importa a classe para criar uma URL
import jdk.jshell.spi.ExecutionControlProvider;

import java.net.URI;
//importa o cliente http do java (crud)
import java.net.http.HttpClient;
//importa a classe que cria a requisição http
import java.net.http.HttpRequest;
//importa a classe que recebe a resposta do api
import java.net.http.HttpResponse;

public class PersonGenerator {
    public String personGenerate() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
             .uri(URI.create("https://randomuser.me/api/?nat=br" ))
            .GET()
            .build();

            HttpResponse<String> response =
                    client.send(
                            request,
                            HttpResponse.BodyHandlers.ofString()
                    );
            return response.body();

        }  catch (Exception e) {
            e.printStackTrace();
            return "Erro ao buscar pessoa";
        }

}
}
