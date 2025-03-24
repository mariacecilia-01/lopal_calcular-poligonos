package br.senai.jandira.calculo.poligonos.repository;

import java.util.Scanner;

import br.senai.jandira.calculo.poligonos.model.Retangulo;

public class RetanguloRepository {

	public void criarRetangulo (){
		Scanner leitor = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println();
		System.out.println("Criando um retângulo...");
		
		System.out.println("Qual o valor da base do retângulo? ");		
		retangulo.setBase(leitor.nextDouble());
		
		System.out.println("Qual o valor da altura do retângulo? ");
		retangulo.setAltura(leitor.nextDouble());
		
		
		retangulo.exibirDados();
		
		leitor.close();
		
	}

}
