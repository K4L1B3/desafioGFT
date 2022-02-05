package exercicios.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		
	
		
		List<Gato> meusGatos = new ArrayList<>();
		
		
		meusGatos.add(new Gato("Jan",  18, "preto"));
		meusGatos.add(new Gato("Simba", 6, "trigado"));
		meusGatos.add(new Gato("Jon",  12,"amarelo"));
		meusGatos.add(new Gato("Jon",  12,"amarelo"));
		
		System.out.println(meusGatos.toString());
		
		

		//Mostre a lista em ordem aleatoria
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		//Mostre a lista em ordem de compara��o natural "nome"
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		
		// Ordem por idade
		Collections.sort(meusGatos, new ComparatorIdade());
		System.out.println(meusGatos);
		
		// Ordem por cor
		Collections.sort(meusGatos, new ComparatorCor());
		System.out.println(meusGatos);
	}
}


 class Gato implements Comparable<Gato>{
	
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

	@Override
	public int compareTo(Gato gato) {
		 
		return this.getNome().compareToIgnoreCase(gato.getNome());
		
		// Se retornar 0 � igual
		// se retornar 1 � maior que o comparado e est� depois
		// se retornar -1 � menor que o comparado e est� antes		
		
	}
	
}
 
 
 
 class ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	 
 }
 
 class ComparatorCor implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
	 
 }
 
 class ComparatorNomeCorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
			
		
			int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
			if (nome != 0) return nome;   
			
			int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
			if (cor != 0) return cor;
			//Else
			return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	 
 }
 
 
 
 
 
 