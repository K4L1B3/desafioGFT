/*
Desafio
Ao voltar de um intenso jogo de RPG na casa de um amigo, 
o padre do balão desapareceu misteriosamente! Todos estão 
loucos a procura do padre pelos céus. Enquanto isso, 
coisas estranhas estão acontecendo em sua casa, como ele 
conseguir se comunicar com um menino!

Existem exatamente 26 lâmpadas penduradas na parede sa sala do padre, 
numeradas de 1 a 26 da esquerda para a direita. Além disso, há uma letra 
do alfabeto pintada na parede embaixo de cada lâmpada. Quando o padre 
do balão quer enviar uma mensagem, as luzes de alguma forma piscam, 
uma a uma, as lâmpadas correspondentes a cada letra de sua mensagem. Por 
exemplo, se ele quer enviar a mensagem HELP, ele irá piscar, nesta ordem, 
as lâmpadas acima das letras H, E, L e P.

Dada a letra associada a cada lâmpada e a ordem das lâmpadas que foram 
piscadas por Will, decifre a mensagem 

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso contém 
uma string de exatamente 26 letras maiúsculas contendo todas as letras do 
alfabeto inglês. A primeira letra da string está associada à lâmpada 1; a 
segunda letra está associada à lâmpada 2; e assim por diante. A próxima 
linha contém um inteiro N (1 ≤ N ≤ 104), o número de lâmpadas que foram piscadas. 
A terceira linha contém N inteiros li (1 ≤ li ≤ 26), indicando as lâmpadas que 
foram piscadas, em ordem.

Saída
Para cada caso de teste, imprima uma única linha contendo a mensagem enviada pelo padre do balão.

 
Exemplo de Entrada	Exemplo de Saída
//INPUT://
ABCDEFGHIJKLMNOPQRSTUVWXYZ
4
8 5 12 16

//OUTPUT://
HELP

//INPUT://
QWERTYUIOPASDFGHJKLZXCVBNM
10
16 3 19 19 9 2 9 4 19 13

//OUTPUT://
HELLOWORLD


[x] - Tratar a string inteira dividindo em caracteres individuais 

[x] - Armazenar cada caracter em uma posição de um array

- Fazer um contador de repetição (while) para receber a quantidade de índices (que seria a quantidade de inputs) e armazena-los em um array

- Percorrer o array de caracteres de acordo com o número passado no array de inputs de números (usando um for para retornar a posição dos arrays)


*/

package desafiosGFT;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class desafio10 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		List<Character> alphabet = new ArrayList<Character>();
		
		List<Integer> repeticoes = new ArrayList<Integer>();
		
		
		// Contador com a quantidade de repitições requisitadas
		int count = 0;

		// Recebe a string = ABCDEFGHIJKLMNOPQRSTUVWXYZ
		
//		String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		String[] letras = word.split("");
//		System.out.println(letras[8-1]+letras[5-1]+letras[12-1]+letras[16-1]);
		
		String word = sc.next();
		int RpNum = sc.nextInt();
		
		while(count < RpNum) {
			int IdNum = sc.nextInt();
			repeticoes.add(IdNum);
			count++;
		}
		
		System.out.println(repeticoes.toString());
		
        for (int i = 0; i < word.length(); i++) {
            alphabet.add(word.charAt(i));
        }
        System.out.println(alphabet.toString());
        
        Iterator<Integer> iterator = repeticoes.iterator();
        
        while(iterator.hasNext()){
        Integer number = iterator.next();
        System.out.print(alphabet.get(number-1));
        }	
	}
}
