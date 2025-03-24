package br.senai.jandira.calculo.poligonos.model;

import java.util.Scanner;

public class CalculoDePoligonos {

	public static void calcularRetangulo () {
		Retangulo retangulo = new Retangulo();
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Altura do retângulo: ");
		double altura = leitor.nextDouble();
		
		System.out.print("Base do retângulo: ");
		double base = leitor.nextDouble();
		
		retangulo.setAltura(altura);
		retangulo.setBase(base);
		retangulo.exibirDados();
		
		leitor.close();
	}



}
