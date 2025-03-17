package br.senai.jandira.calculo.poligonos.model;

public class Trapezio {
	
	private double altura;
	private double baseMaior;
	private double baseMenor;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura () {
		return altura;
	}
	
	public void setBaseMaior (double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public double getBaseMaior(){
		return baseMaior;
	}
	
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public double setBaseMenor() {
		return baseMenor;
	}
	
	public double calcularArea() {
		double area = (baseMaior + baseMenor) * altura / 2;
		return area;
	}
	
	public void exibirDados() {
		System.out.println("====================");
		System.out.println("TRAPÉZIO");
		System.out.println("--------------------");
		System.out.printf("Área: %s\n", calcularArea());
		System.out.println("---------------------");
		System.out.println("====================");
	}
	
}
