package br.senai.jandira.calculo.poligonos;

import java.util.Scanner;

import br.senai.jandira.calculo.poligonos.model.Circunferencia;
import br.senai.jandira.calculo.poligonos.model.Menu;
import br.senai.jandira.calculo.poligonos.model.Quadrado;
import br.senai.jandira.calculo.poligonos.model.Retangulo;
import br.senai.jandira.calculo.poligonos.model.Trapezio;
import br.senai.jandira.calculo.poligonos.model.Triangulo;

public class CalcularApp {

	public static void main(String[] args) {
		
		Menu.criarMenu();
		
		Scanner leitor = new Scanner(System.in);

		System.out.print("Qual a altura do retângulo? ");
		double valorAlturaR = leitor.nextDouble();

		System.out.print("Qual a base do retângulo? ");
		double valorBaseR = leitor.nextDouble();
//
//		Circunferencia c1 = new Circunferencia();
//		System.out.println(c1);
//
//		Quadrado q1 = new Quadrado();
//		System.out.println(q1);
//
//		Retangulo r1 = new Retangulo();
//		System.out.println(r1);
//
//		Trapezio tr1 = new Trapezio();
//		System.out.println(tr1);
//
//		Triangulo t1 = new Triangulo();
//		System.out.println(t1);
//
//		c1.setRaio(3);
//
//		q1.setAltura(2);
//		q1.setBase(10);
//		q1.setPerimetro(15);
//
//		r1.setAltura(valorAlturaR);
//		r1.setBase(valorBaseR);
//		r1.setPerimetro(12);
//
//		tr1.setAltura(7);
//		tr1.setBaseMaior(4);
//		tr1.setBaseMenor(4);
//
//		t1.setLadoA(12);
//		t1.setLadoB(12);
//		t1.setBase(5);
//
//		c1.exibirDados();
//		q1.exibirDados();
//		r1.exibirDados();
//		tr1.exibirDados();
//		t1.exibirDados();
//
	}

}
