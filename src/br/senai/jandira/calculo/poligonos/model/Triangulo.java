package br.senai.jandira.calculo.poligonos.model;

public class Triangulo {
	
	private double altura;
	private double base;
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double getAltura () {
		return altura;
	}
	
	public void setBase (double base) {
		this.base = base;
	}
	
	public double getBase() {
		return base;
	}
	
	public double calcularArea() {
		double area = base * altura / 2;
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
