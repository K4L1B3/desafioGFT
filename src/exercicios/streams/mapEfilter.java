package exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class mapEfilter {

	public static void main(String[] args) {
		
		List<String> randomNumbers = Arrays.asList("1", "2", "3", "10", "23", "4", "2", "5", "8", "12");
		
		//Pegue os números pares maiores do que 2
		
		//CODIGO SEM LAMBDA APLICADO
//		List<Integer> numberHighTo = randomNumbers.stream()
//			.map(Integer::parseInt)
//			.filter(new Predicate<Integer>() {
//				@Override
//				public boolean test(Integer i) {
//					if (i % 2 == 0 && i > 2) return true;
//					return false;
//				}
//			}).collect(Collectors.toList());
//			
//		System.out.println(numberHighTo);

		
		//CODIGO COM LAMBDA APLICADO
		List<Integer> numberHighTo = randomNumbers.stream()
				.map(Integer::parseInt)
				.filter((i -> i % 2 == 0 && i > 2)).collect(Collectors.toList());
		
			System.out.println(numberHighTo);
			
			
			
			
			
		//Mostre a média dos seus números
			
			//CODIGO SEM LAMBDA APLICADO
//			randomNumbers.stream().mapToInt(Integer::parseInt)
//			.average()
//			.ifPresent(new DoubleConsumer() {
//				
//				@Override
//				public void accept(double value) {
//					System.out.println(value);
//					
//				}
//			});;
			
			//CODIGO COM LAMBDA APLICADO
			randomNumbers.stream().mapToInt(Integer::parseInt)
			.average()
			.ifPresent(value -> System.out.println(value));
//			.ifPresent(System.out::println);
			
			
			
			//Remova os valores impares
			
//			randomNumbers.removeIf(new Predicate<Integer>(){
//
//				@Override
//				public boolean test(Integer i) {
//					if (i % 2 != 0) return true;
//					return false;
//				}
//	
//			});
//			
//			System.out.println(randomNumbers);
			
			
//			randomNumbers.removeIf(i -> i % 2 != 0);
//			System.out.println(randomNumbers);
//			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}
}
