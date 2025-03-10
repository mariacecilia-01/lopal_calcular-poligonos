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

}
