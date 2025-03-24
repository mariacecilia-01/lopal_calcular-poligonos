package br.senai.jandira.calculo.poligonos.ui;

import java.util.Scanner;

import br.senai.jandira.calculo.poligonos.repository.QuadradoRepository;
import br.senai.jandira.calculo.poligonos.repository.RetanguloRepository;

public class Menu {

	public static void criarMenu() {

		Scanner leitor = new Scanner(System.in);

		System.out.println("-----------------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("-----------------------");
		System.out.println("1- QUADRADO");
		System.out.println("2- RETÂNGULO");
		System.out.println("3- TRAPÉZIO");
		System.out.println("4- TRIÂNGULO");
		System.out.println("5- CIRCUNFERÊNCIA");
		System.out.println("6-SAIR");
		System.out.println("-----------------------");
		System.out.println("Escolha uma opção (1 - 5) ");
		System.out.println("-----------------------");

		int opcao = leitor.nextInt();
		

		if (opcao == 1) {
			QuadradoRepository quadradoRepository = new QuadradoRepository();
			quadradoRepository.criarQuadrado();
		} else if (opcao == 2) {
			RetanguloRepository retanguloRepository = new RetanguloRepository();
			retanguloRepository.criarRetangulo();
		} else if (opcao == 6) {
			System.out.print("Tem certeza que deseja sair? (S/N) ");
			String escolha = leitor.next();

			if (escolha.equalsIgnoreCase("s")) {
				System.out.println();
				System.out.println("Encerrando o sistema. Bye!");
				System.out.println();
				System.exit(0);
			} else if(escolha.equalsIgnoreCase("n")) {
				criarMenu();
			}else {
				System.out.println();
				System.out.println("Você deve escolher somente \"s\" ou \"n\"!");
				criarMenu();
			}

		} else {
			System.out.println("A opção selecionada ainda não foi implementada!");
		}

		leitor.close();

	}
}
