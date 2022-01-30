package desafiosGFT;

import java.io.IOException;
import java.util.Scanner;

/*
	Desafio
		Crie um programa que leia 6 valores, os quais poderão ser negativos 
		e/ou positivos. Em seguida, apresente a quantidade de valores positivos digitados.

	Entrada
		Você receberá seis valores, negativos e/ou positivos.

	Saída
		Exiba uma mensagem dizendo quantos valores positivos foram lidos. assim como é exibido abaixo 
		no exemplo de saída. Não se esqueça de incluir na mensagem de saída o sufixo " valores positivos", 
		conforme o exemplo abaixo:
 * */

public class desafio04 {

	public static void main(String[] args) throws IOException {
	    Scanner sc = new Scanner(System.in);
		double[] positivo = new double[6];
	
		System.out.println("Insira os valores que você deseja: ");	
		
		for (int i = 0; i < positivo.length; i++) {
			double valores = sc.nextDouble();
			positivo[i] = valores;
		}
		
		int count = 0;
		
		for (int i = 0; i < positivo.length; i++) {
			
			if (positivo[i] > 0) {
				count = count +1;
			}
		}
		System.out.println("" + count + " valores positivos");
		
	    }
}
