package br.senai.jandira.calculo.poligonos.model;

public class Circunferencia {

	private double raio;

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public double calcularRaio() {
		double area = Math.PI * (raio * raio);
		return area;
	}
	
	public void exibirDados() {
		System.out.println("====================");
		System.out.println("CIRCUNFERÊNCIA");
		System.out.println("--------------------");
		System.out.printf("Área: %s\n", calcularRaio());
		System.out.println("====================");
	}

}
