package br.senai.jandira.calculo.poligonos.model;

public class Quadrado {

	private double base;
	private double altura;
	private double perimetro;

	public void setBase(double base) {
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public double calcularArea() {
		double area = base * altura;
		return area;
	}

	public double calcularPerimetro() {
		double perimetro = 2 * (base + altura);
		return perimetro;
	}

}