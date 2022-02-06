package desafiosGFT;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Seu Júlio é proprietário de um grande apiário situado no interior da Paraíba. Todo ano, semestralmente, 
seu Júlio coleta o mel produzido pelas abelhas da sua propriedade e armazena-o em um recipiente de formato 
CILÍNDRICO para que facilite o transporte do mel para os estabelecimentos que encomendam esse produto 
natural para a comercialização.

Certa vez seu Júlio percebeu que devido a um crescimento na produção do mel, em relação ao semestre anterior, 
o recipiente que possuia não suportaria o volume de mel produzido por suas abelhas. Seu Júlio precisa agora 
que você faça um programa que informado o volume de mel em cm³e o diâmetro da parte interna do recipiente em 
cm, calcule e mostre:

- Qual deve ser a altura(em cm) da parte interna do recipiente;

- A área(em cm²) da boca(entrada) do recipiente.

Obs.: Considere π = 3.14

Entrada
A entrada contém vários casos de teste e termina com EOF. Cada caso de teste consiste de duas linhas contendo 
em cada uma um valor de ponto flutuante de dupla precisão com duas casas decimais após a vírgula, sendo um V 
(1.00 ≤ V ≤ 10000.00) e outro D (1.00 ≤ D ≤ 100.00), representando respectivamente o volume e o diâmetro do 
recipiente.

Saída
Para cada teste, a saída contém na primeira linha a mensagem "ALTURA = ", com um espaço depois de ALTURA e 
outro depois do símbolo de igualdade, seguido do valor da altura do recipiente com duas casas decimais após 
a vírgula e na segunda linha a mensagem "AREA = ", também com um espaço depois de AREA e outro depois do 
símbolo de igualdade, seguido do valor da area da boca(entrada) do recipiente com duas casas decimais após 
a vírgula.

- Não esqueça da quebra de linha ao final da saída,caso contrário você receberá "Presentation Error".

 
Exemplo de Entrada	Exemplo de Saída
1450.00 	ALTURA = 2.96
25.00		AREA = 490.62
760.00		ALTURA = 0.61
40.00		AREA = 1256.00
7500.00		ALTURA = 42.46
15.00		AREA = 176.62

*/


// um recipiente de formato CILÍNDRICO

// INPUTS
// volume de mel em cm³
// diâmetro da parte interna do recipiente em cm

//OUTPUTS
//- Qual deve ser a altura(em cm) da parte interna do recipiente;
//- A área(em cm²) da boca(entrada) do recipiente.

//Obs.: Considere π = 3.14


		// AREA DA BASE -> Ab = Pi x r²
		// VOLUME -> V = Ab.h ou V = p.r².h
		// ALTURA -> h = V / ab

public class desafio08 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.00");
    	double V, D, R, areaBase, altura;
    	while (leitor.hasNext()) {
    		V = leitor.nextDouble(); // volume
    		D = leitor.nextDouble(); // Diâmetro
    		R = D / 2;
    		areaBase = 3.14 * Math.pow(R, 2);
    		altura = V / areaBase;
    		System.out.println("ALTURA = " + df.format(altura));
    		System.out.println("AREA = " + df.format(areaBase));
    	}
		

		
		
		
		
		
	}

}
