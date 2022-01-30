package exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * Faça um programa que leia todos os caracteres 
 * e diga quantas consoantes foram lidas
 * imprima as consoantes
 * 
 * */


public class arrays_EX3 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[][] M = new int[4][4];
		
		for (int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[i].length; j++) {
				M[i][j] = random.nextInt(9);			}
		}
		
		System.out.println("Matriz: ");
		for (int[] linha : M) {
			for (int coluna : linha) {
				System.out.println(coluna + " ");
				
			}
			
		}
		
	}
}
