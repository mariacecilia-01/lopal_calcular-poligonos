package br.senai.jandira.calculo.poligonos.model;

public class Triangulo {
	
	private double ladoA;
	private double ladoB;
	private double base;
	
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	
	public double getLadoA() {
		return ladoA;
	}
	
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	
	public double getLadoB() {
		return ladoB;
	}
	
	public void setBase (double base) {
		this.base = base;
	}
	
	public double getBase() {
		return base;
	}
	
	public double calcularArea() {
		double area = base * (ladoA + ladoB) / 2;
		return area;
	}
	
	public void exibirDados() {
		System.out.println("====================");
		System.out.println("TRIÂNGULO");
		System.out.println("--------------------");
		System.out.printf("Área: %s\n", calcularArea());
		System.out.println("---------------------");
		System.out.println("====================");
	}

}
