package desafiosGFT;

import java.util.Scanner;

/*
 * 
 * Com base na tabela abaixo, escreva um programa que leia o código de um
 * item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * 
 * Código | Especificação 	| Preço
 * 1 		cachorro quente		R$4.00
 * 2		X-salada			R$4.50
 * 3		X-Bancon			R$5.00
 * 4		Torrada simples		R$2.00
 * 5		Refrigerante		R$1.50
 * 
 * Entrada
 * 	O arquivo de entrada contém dois valores inteiros 
 * 	correspondentes ao código e à quantidade de um item 
 * 	conforme tabela acima.
 * 
 * Saída
 *  O arquivo de saída deve conter a mensagem "Total: 
 *  R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
 * 
 * */



// ENTRADA --> Código & Quantidade

public class desafio06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtd;
		float preco = 4;
		
		System.out.println("Digite o código do produto: ");
		
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade do produto: ");
		qtd = sc.nextInt();
	
		
		if (codigo == 1) {
			preco  = (float) (4.00 * qtd);
			
		}else if (codigo == 2) {
			preco  = (float) (4.50 * qtd);  
			
		}else if (codigo == 3) {
			preco  = (float) (5.00 * qtd);  
			
		}else if (codigo == 4) {
			preco  = (float) (2.00 * qtd); 
			
		}else if(codigo == 5) {
			preco  = (float) (1.50 * qtd); 
		}
		
		System.out.printf("Total: R$ %.2f\n",preco);
	

	}
	

}
