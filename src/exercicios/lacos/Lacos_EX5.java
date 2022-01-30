package exercicios.lacos;

import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuário
 * EX: 5! = 120 (5 x 4 x 3 x 2 x 1)
 * 
 * n! = n . (n – 1). (n – 2)
 * */


public class Lacos_EX5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insra um numero para saber o seu fatorial:  ");
		int fatNumber = sc.nextInt();
		
		int multiplicacao = 1;
		
		System.out.print(fatNumber+"! = ");
		
		for (int i = fatNumber; i >=1; i--) { 
			multiplicacao = multiplicacao*1;
		}
		
		System.out.print(multiplicacao);
		
		
	
		
	}	
	
}
