package br.senai.jandira.calculo.poligonos.model;

public class Quadrado {

	private double lado;
	private double perimetro;

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public double calcularArea() {
		double area = lado * lado;
		return area;
	}

	public double calcularPerimetro() {
		double perimetro = 4 * lado;
		return perimetro;
	}
	
	public void exibirDados() {
		System.out.println("====================");
		System.out.println("QUADRADO");
		System.out.println("--------------------");
		System.out.printf("Área: %s\n", calcularArea());
		System.out.println("---------------------");
		System.out.printf("Perimetro: %s\n", calcularPerimetro());
		System.out.println("====================");
	}

}