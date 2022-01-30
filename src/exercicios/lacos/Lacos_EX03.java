package exercicios.lacos;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 numeros e informe
 * o maior numero e a média desses numeros
 * */


public class Lacos_EX03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		float maior = 0;
		float soma = 0;
		float numero = 0;
		int contador = 0;
		
		
	do {
		System.out.println("Digite um numero: ");
		numero = sc.nextFloat();
		contador++;
		
		if(numero > maior) maior = numero;
		soma = soma + numero;
		
		
	}while (contador < 5);
	
	float media = soma / 5;
	System.out.println("O maior número é: " + maior);
	System.out.println("A média entre os valores é: " + media);
		
	}
	
	
}
