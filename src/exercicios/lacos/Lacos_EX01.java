package exercicios.lacos;

import java.util.Scanner;

/*
 * Faça um programa que peça a note entre 0 e 10 e mostre uma mensagem de erro caso o valor seja invalido
 * */


public class Lacos_EX01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite uma nota");
		
		double nota = sc.nextDouble();
		
		while (nota < 0 || nota > 10) {
			System.out.println("NOTA INVALIDA!!! Por favor digite novamente ");
			nota = sc.nextDouble();
		}
		
	}
	
	
}
