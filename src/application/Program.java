package application;

import java.util.Scanner;

import entities.Calculadora;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String resposta = null;

		int opcao = -1;

		do {

			System.out.println("--- MENU DE ESCOLHAS ---");
			System.out.println("1 - SOMA");
			System.out.println("2 - SUBTRAÇÃO");
			System.out.println("3 - DIVISÃO");
			System.out.println("4 - MULTIPLICAÇÃO");
			System.out.println("5 - POTENCIAÇAO");
			System.out.println("6 - RAIZ DO NUMERO 1");
			System.out.println("7 - RAIZ DO NUMERO 2");
			System.out.println("8 - LOG DO NÚMERO 1");
			System.out.println("9 - LOG DO NÚMERO 2");
			System.out.println("10 - ENCERRAR");

			opcao = scanner.nextInt();

			if (opcao < 10 && opcao > 0) {
				System.out.println("Digite dois números:");
				double num = scanner.nextDouble();
				double num2 = scanner.nextDouble();

				Calculadora calculadora = new Calculadora(num, num2);

				switch (opcao) {

				case 1:
					System.out.println(calculadora.soma());

					break;

				case 2:

					System.out.println(calculadora.sub());

					break;

				case 3:

					System.out.println(calculadora.div());

					break;
				case 4:

					System.out.println(calculadora.multi());
					break;

				case 5:

					System.out.println(calculadora.potencia());
					break;

				case 6:

					System.out.println(calculadora.raiz1());
					break;

				case 7:

					System.out.println(calculadora.raiz2());
					break;

				case 8:

					System.out.println(calculadora.log1());
					break;

				case 9:

					System.out.println(calculadora.log2());
					break;

				}

				System.out.println("Deseja continuar? (S/N)");
				resposta = scanner.next();

			} else {
				System.out.println("Programa encerrado!");
			}

		} while (resposta.equalsIgnoreCase("S"));

		System.out.println("Programa encerrado!");

		scanner.close();

	}

}
