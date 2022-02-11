package desafiosGFT;

// Desafio
// Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

// Entrada
// Você receberá 1 valor inteiro N, onde N > 0.

// Saída
// Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 


// Exemplo de Entrada	Exemplo de Saída
// 6	
// 2
// 4
// 6


// ​	
// ​    
// ​    
// ​    

    import java.io.IOException;
    import java.util.Scanner;
    import java.util.*;

public class desafio13 {
    

    public static void main(String[] args) throws IOException {
    	
    	// leia um numero 
    	// mostre os numeros pares
    	// leia ele mesmo
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int count = 0;

    	 for (int i = 0; i < N; i++){
    	  
    	  count++;
    	 
    	 if (count % 2 == 0){
    	    System.out.println(count);
    	 }

    	 }

    }

}