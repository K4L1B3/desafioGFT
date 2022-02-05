package exercicios.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class hashMapConceitos {

	public static void main(String[] args) {
		
		Map<String, Double> carrosPopulares = new HashMap<>(){{
			
			put("SUV", 15.4);
			put("Kwid", 20.0);
			put("Celta", 8.0);
			put("gol", 14.4);
			put("hb20", 14.4);
			put("Ferrari", 30.0);
		
	}};

	System.out.println(carrosPopulares);
	
	//Substitua o consumo do gol por 15,2 km/l:
	carrosPopulares.put("gol", 15.2);
	System.out.println(carrosPopulares);
	
	//Confira se modelo Ferrari está nos modelos adicionados
	System.out.println("modelo está adicionado? " + carrosPopulares.containsKey("Ferrari"));
	
	//Exiba o consumo do  kwid
	System.out.println("Consumo do kwid: " + carrosPopulares.get("Kwid"));
	
	//Exiba os modelos
	Set<String> modelos = carrosPopulares.keySet();
	System.out.println(modelos);
	
	//Exiba os consumos dos carros
	Collection<Double> consumos = carrosPopulares.values();
	System.out.println(consumos);

	//Exiba o consumo mais eficiênte
	Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
	Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
	String modeloMaisEficiente = "";
	for (Map.Entry<String, Double> entry : entries) {
		if (entry.getValue().equals(consumoMaisEficiente)) modeloMaisEficiente = entry.getKey();		
	}
	System.out.println("Consumo mais eficiênte: " + modeloMaisEficiente + " - " + consumoMaisEficiente + " Km/L");
	
	//Exiba o consumo menos eficiênte
	Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
	carrosPopulares.entrySet();
	String modeloMenosEficiente = "";
	for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
		modeloMenosEficiente = entry.getKey();
	}
	
	System.out.println("Modelo menos eficênte " + modeloMenosEficiente + " - " + consumoMenosEficiente);
	
	//Exiba a soma dos consumos
	Iterator <Double> iterator = carrosPopulares.values().iterator();
	Double soma = 0d;
	while (iterator.hasNext()) {
		soma += iterator.next();
	}
	System.out.println("A soma dos consumos é: " + soma);
	
	//Exiba a soma média dos consumos deste dicionário
	System.out.println("Média do consumos " + soma/carrosPopulares.size());

	//Remova modelos do consumo = 15.2 km/L
	System.out.println(carrosPopulares);
	Iterator <Double> iterator1 = carrosPopulares.values().iterator();
	while (iterator1.hasNext()) {	
		if(iterator1.next().equals(15.2)) iterator1.remove();
	}
	
	System.out.println(carrosPopulares);
	
	//Exiba o dicionário ordenado pelo modelo
	Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares);
	System.out.println(carrosPopulares2.toString());
	
	//APAGUE O DICIONARIO CARROS
	carrosPopulares.clear();
	
	//Confira se o dicionário está vazio
	System.out.println(carrosPopulares.isEmpty());
	
	
	
	
	
	
	
	
	
	}
}