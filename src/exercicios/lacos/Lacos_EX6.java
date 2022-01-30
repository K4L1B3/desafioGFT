package exercicios.lacos;

import java.util.Scanner;

/*
 * Desenvolva um gerador de Tabuada, capaz de gerar tabuada de qualquer numero inteiro entre 1 a 10 
 * o usúario deve informar de qual numero ele deseja ver a tabuada a saida deve ser conforme o exemplo abaixo:
 * 
 * Tabuada de 2
 * 1 x 2 = 2...
 * */


public class Lacos_EX6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a tabuada que você deseja? ");
		int tbNumber = sc.nextInt();
		int tb = 0;
		
		for (int i = 1; i < 11; i++) { 
			//int res = tbNumber * i; 
			System.out.println(tbNumber + " X " + i + " = " + tbNumber*i);
			
		}
		
		
	}	
	
}
