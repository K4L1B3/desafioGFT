package exercicios.httpTest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Path;
import java.time.Duration;

public class postRequest {

	public static final String URL_POST = "https:// DIGITE AQUI A URL";
	public static final String FILE_JSON = "/PATH - IMPORTE AQUI O ARQUIVO";

	public static void main(String[] args) throws IOException, InterruptedException {
	
		//CLiente HTTP
		
		HttpClient client = HttpClient.newHttpClient();
		
		// Criar requisição
		HttpRequest request = HttpRequest.newBuilder()
				.POST(HttpResponse.BodyHandlers.ofFile(Path.of(FILE_JSON)))
				.timeout(Duration.ofSeconds(10))
				.uri(URI.create(URL_POST))
				.build();
					
		
		// Enviando uma solicitação
		
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
		.thenApply(HttpResponse::body)
		.thenAccept(System.out::println)
		.join();
	}

}
