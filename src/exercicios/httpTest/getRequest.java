package exercicios.httpTest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class getRequest {

	public static final String URL_GET = "https:// DIGITE AQUI A URL";

	public static void main(String[] args) throws IOException, InterruptedException {
	
		//CLiente HTTP
		
		HttpClient client = HttpClient.newHttpClient();
		
		// Criar requisição
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.timeout(Duration.ofSeconds(10))
				.uri(URI.create(URL_GET))
				.build();
					
		
		// Enviando uma solicitação
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		// Imprimindo a response
		System.out.println(response);
		
		
		
	}

}
