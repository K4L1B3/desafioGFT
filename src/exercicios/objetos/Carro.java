package exercicios.objetos;

import java.util.Scanner;

public class Carro {
	
	private String cor;
	private String marca;
	private int valor;
	private double tanque;
	
	public Carro (String cor, String marca, int valor, double tanque) {
		
		this.cor = cor;
		this.marca = marca;
		this.valor = valor;
		this.tanque = tanque;

	}
	
	public Carro() {
		
	}

	public double setAbastecer(double capacidade) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a capacidade do seu" + "\n" + "tanque de combustivel: ");
		capacidade = sc.nextDouble();
		this.tanque = capacidade;
		double valor = this.tanque * 6;
		System.out.print("O valor para encher o tanque é de: ");
		return valor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public double getTanque() {
		return tanque;
	}

	public void setTanque(double tanque) {
		this.tanque = tanque;
	}
	
	

}
