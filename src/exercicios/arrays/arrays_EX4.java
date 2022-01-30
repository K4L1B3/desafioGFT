package exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * Faça um programa que leia todos os caracteres 
 * e diga quantas consoantes foram lidas
 * imprima as consoantes
 * 
 * */


public class arrays_EX4 {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
		Random rd = new Random();
		
		int[] rdNum = new int[20];
		
		for(int i = 0; i < rdNum.length; i++) {
			int numeroRandom = rd.nextInt(100);
			rdNum[i] = numeroRandom; 
		}
		
		System.err.print("Numeros aleatorios: \n");
		for (int i : rdNum) {
			
			System.out.println(i);
		}
		
		System.out.println("Sucessores dos números aleatorios: " );
		for (int i : rdNum) {
			System.out.println((i+1) + " ");
		}
		
	}
}
