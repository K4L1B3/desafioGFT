package exercicios.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* Dado as seguintes informações sobre meus livros e seus autores:
 * Crie e ordene o seu dicionário
 * 
// * Autor = Hawking, Stephen - Livro = nome: Uma breve historia sobre o tempo. páginas: 256
// * Autor = Duhiga, Charles - Livro = nome: O poder do hábito. páginas: 408 páginas
// * Autor = Harari, Yuval Noah - Livro = nome: 21 Liçõesp para o sec 21. páginas: 432 páginas
 */


public class hashMapOrganizandoListas {

	public static void main(String[] args) {
		Map<String, Livro> meusLivros = new HashMap<>();
		
	

	}

}


/**
 * @author k4l1b3
 *
 */
class Livro {
	
	private String nome;
	private Integer paginas;
	
	
	public Livro (String nome, Integer paginas) {
		this.nome = nome;
		this.paginas = paginas;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getPaginas() {
		return paginas;
	}


	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}


	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
	}
	
	
	
	
	
	
	
}