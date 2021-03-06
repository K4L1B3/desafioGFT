package desafiosGFT;

import java.util.Scanner;

/*
Jade ganhou de presente de aniversário um telescópio e ficou muito feliz, 
pois adora olhar a lua à noite. Ela sempre foi uma estudante muito boa, e 
só analizando a lua por duas noites seguidas, já consegue identificar as 
mudanças que ocorreram na iluminação e o percentual aproximado da lua que 
está iluminada.



Você, que é amigo da Jade e estuda Computação, resolveu fazer um pequeno programa que, 
baseado nesta avaliação que ela fez nas duas últimas noites, informa a fase na qual a 
lua se encontra. Se a porção visível da lua no momento estiver entre:

- Se for entre 0 e 2%, é lua nova
- se for entre 3 e 96% é lua crescente
- se for entre 97 e 100% é lua cheia e 
- se for entre 96 e 3% (diminuindo) é lua minguante.

Entrada
A entrada é composta por uma única linha contendo dois valores inteiros. O primeiro valor 
corresponde ao percentual observado por Jade na noite de dois dias atrás. O segundo valor 
corresponde ao percentual observado por jade na noite anterior.

Saída
Baseado nos dois percentuais observados por Jade, imprima na tela a fase na qual a lua se 
encontrava na noite anterior, conforme o exemplo abaixo. Não esqueça de imprimir o caractere 
de fim de linha após a saída :).

Teste #1
Dado de entrada:
93 0
Saída esperada:
nova

Teste #2
Dado de entrada:
95 97
Saída esperada:
cheia

Teste #3
Dado de entrada:
4 3
Saída esperada:
minguante

*/


public class desafio07 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        
        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();
        
        
        if (inicio >= 0 && fim <= 2)System.out.println("nova"); // entre 0 e 2%, é lua nova
        else if (fim >= 3 && inicio >= 96) System.out.println("crescente"); // entre 3 e 96% é lua crescente
        else if (inicio >= 95 && fim <= 100) System.out.println("cheia"); // entre 97 e 100% é lua cheia
        else if (inicio > fim && fim <= 95) System.out.println("minguante"); // entre 96 e 3% (diminuindo) é lua minguante

	}

}
