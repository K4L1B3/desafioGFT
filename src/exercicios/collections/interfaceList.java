package exercicios.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class interfaceList {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> notas = new ArrayList<Double>();
		
		//notas.add(sc.nextDouble());
		notas.add(2.0);
		notas.add(6.0);
		notas.add(6.8);
		notas.add(7.0);
		notas.add(7.0);
		notas.add(10.0);
		notas.add(0.03);
		
		System.out.println(notas.toString());
		
		
		// Exiba a posição da nota cinco dentro do array
		System.out.println(notas.indexOf(10d));
		
		// Adicione na lista a nota 8 na posição 4 (Posição, valor)
		notas.add(4, 0.0);
		System.out.println(notas);
		
		 // Subistituia a nota 6 na lista pela nota 5
		notas.set(1, 5.0);
		System.out.println(notas);
		
		//Confira se o número 5 está na lista
	
		System.out.println("Na sua list possui o número 5? " + notas.contains(5d));
		
		// Imprima os itens da sua lista em ordem
			// Por ser uma lista obrigatoriamente os itens serão organizados pela ordem de colocação
		for (Double notaV : notas) System.out.println(notaV);
		
		// Exiba a terceira nota adicionada
		System.out.println("Terceira nota adicionada: " + notas.get(2));
		
		//Exiba o menor valor da sua lista
		System.out.println("Menor valor da lista " + Collections.min(notas));
		
		//Exiba a maior nota da sua lista
		System.out.println("Maior valor da sua lista " + Collections.max(notas));
		
		//Exiba a soma dos valores
		Iterator<Double> iterator = notas.iterator();
		Double sum = 0d;
		while(iterator.hasNext()) {
			Double number = iterator.next();
			sum += number;
		}
		
		System.out.println("Soma de valores é: " + sum);
		
		//Exiba a média das notas
		System.out.println("A média das suas notas é: " + (sum/notas.size()));
		
		//Remova a nota 0 da sua lista
		notas.remove(0); //pode passar tanto a posição como o objeto
		notas.remove(6d);
		
		System.out.println(notas);
		
		// Remova as notas que são menor que 7
		
		Iterator<Double> menor7 = notas.iterator();
		
		while(menor7.hasNext()) {
			
			Double px = menor7.next();
			if (px < 7) menor7.remove();
		}
		
		System.out.println(notas);
		
		//Apague toda a lista
		System.out.println("Lista apagada com sucesso! ");
		notas.clear();
		System.out.println(notas);
		
		//Verifique se a lista está vazia
		System.out.println("A lista está vazia? " + notas.isEmpty());
		
		
	}
}
