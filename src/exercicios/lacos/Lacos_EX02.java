package exercicios.lacos;

import java.util.Scanner;

/*
 * Faça um programa que leia conjunto de dois valores,
 * o primeiro representando o nome do aluno e o segundo
 * representando a idade (pare inserindo o valor 0 no campo nome)
 * */


public class Lacos_EX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
		
		System.out.println("Digite o seu nome: ");
		
		String aluno = sc.next();
		
		if(aluno.equals("0")) break;
		
		
		System.out.println("Digite a sua idade: ");
		
		int idade = sc.nextInt();
		
		}
	}
	
	
}
