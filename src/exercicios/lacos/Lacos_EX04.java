package exercicios.lacos;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros calcule e mostre a quantidade
 * de numeros pares e a quantidade de numeros impares
 * */


public class Lacos_EX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a QUANTIDADE de numeros inteiros: ");
		int quantNumeros = sc.nextInt();
		
		int contador = 0;
		
		int qtdPar = 0;
		int qtdImpar = 0;
		
		
		
		do {
			System.out.println("Digite um número: ");
			int numero = sc.nextInt();
			contador++;
			
			if(numero % 2 == 0) qtdPar++; else qtdImpar++;
			
		}while(contador < quantNumeros);
		
		System.err.println("A quantidade de numeros pares é: " + qtdPar + "\n");
		System.out.println("A quantidade de numeros ímpares é: " + qtdImpar);
	}
	
	
}
