package exercicios.collections;

import java.util.ArrayList;
import java.util.List;

public class organizandoListas {

	public static void main(String[] args) {
		
		
		/* Dados os seguintes informações sobre os gatos crie uma lista e ordene a exibição dela abaixo:
		 * 
		 * NOME | IDADE | COR
		 * 
		 * Gato1 = Nome: Jan, idade: 18, cor: preto
		 * Gato2 = Nome:Simba,idade: 6, cor trigado
		 * Gato3 = Nome: Jon, idade: 12, cor: amarelo
		 * 
		 */
		
	
		
		List<Gato> meusGatos = new ArrayList<Gato>(){{
			add.(new nome:"Jan", idade: 18, cor:"preto");
			add.(new nome:"Simba", idade: 6, cor:"trigado");
			add.(new nome:"Jon", idade: 12, cor:"amarelo");
		}};
		System.out.println(meusGatos.toString());
		
		
		
	}
}


 class Gato {
	
private	String nome;
private	int idade;
private	String cor;
	
	public Gato () {
		
	}
	
	public Gato (String nome, int idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
	@Override
	public String toString() {
	return "Gato{" +
		"nome:" + nome + '\'' + 
		", idade:" + idade + 
		", cor:" + cor + '\'' + 
		'}';
	}
	
}
 
 
 
 
 
 
 
 
 
 