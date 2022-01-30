package exercicios.arrays;

import java.util.Scanner;

/*
 * Faça um programa que leia todos os caracteres 
 * e diga quantas consoantes foram lidas
 * imprima as consoantes
 * 
 * */


public class arrays_EX2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] meuArray = new String[6];
		
		int qtdConsoantes = 0;
		int contador = 0; //se refere ao index do array
		
		do {
			
			System.out.println("Digite uma letra: ");
			String letra = sc.next();
			if (!(
					letra.equalsIgnoreCase("a") ||
					letra.equalsIgnoreCase("e") ||
					letra.equalsIgnoreCase("i") ||
					letra.equalsIgnoreCase("o") ||
					letra.equalsIgnoreCase("u")
					)) {
				
				meuArray[contador] = letra;
				qtdConsoantes++;
			}
			
			contador++;
			
			
		}while(contador < meuArray.length);
		
		System.out.println("Consoantes: ");
		for (String consoante : meuArray) {
			if (consoante != null) System.out.print(consoante + ", ");
			
		}
		
		System.out.println("Quantidade de consoantes: " + qtdConsoantes); 
		
		
		
		
	}
}
