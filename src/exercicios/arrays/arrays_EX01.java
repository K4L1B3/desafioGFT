package exercicios.arrays;

/*
 * Crie um vetor de 6 números inteiros e mostre-o em ordem inversa
 * */


public class arrays_EX01 {
	
	public static void main(String[] args) {
		
		int[] meuArray = {0, -5, 15, 50};
		
		
		
		for (int i = (meuArray.length -1); i >= 0; i--) {
			System.out.println(meuArray[i] + "");
		}
		
		
		for (int i = 0; i < meuArray.length; i++) {
			System.out.println(meuArray[i]);
		}
		
//		int count = 0;
//		while(count <=(meuArray.length-1)) {
//			System.out.println(meuArray[count]);
//			count++;
//		}
//		
//		for (int i : meuArray) {
//			System.out.println(i);
//		}
		
		
		
	}

}
