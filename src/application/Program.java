package application;

import java.util.Scanner;

import entities.Calculadora;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao = 0;

		Scanner scanner = new Scanner(System.in);

		Calculadora calculadora = new Calculadora();

		System.out.println("Digite um número:");
		double num = scanner.nextInt();
		System.out.println("Digite o segundo número:");
		double num2 = scanner.nextInt();

		System.out.println("MENU DE ESCOLHAS");
		System.out.println("1 - SOMA");
		System.out.println("2 - SUBTRAÇÃO");
		System.out.println("3 - DIVISÃO");
		System.out.println("4 - MULTIPLICAÇÃO");

		opcao = scanner.nextInt();

		switch (opcao) {

		case 1:

			System.out.println(calculadora.soma(num, num2));

			break;

		case 2:

			System.out.println(calculadora.sub(num, num2));

			break;

		case 3:

			System.out.println(calculadora.div(num, num2));

			break;
		case 4:

			System.out.println(calculadora.multi(num, num2));
			break;

		default:

			System.out.println("Número invalido!");
			break;
		}
		scanner.close();
	}

}
