package application;

import java.util.Scanner;

import entities.Calculadora;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("--- MENU DE ESCOLHAS ---");
		System.out.println("1 - SOMA");
		System.out.println("2 - SUBTRA��O");
		System.out.println("3 - DIVIS�O");
		System.out.println("4 - MULTIPLICA��O");
		System.out.println("5 - POTENCIA�AO");
		System.out.println("6 - RAIZ DO NUMERO 1");
		System.out.println("7 - RAIZ DO NUMERO 2");
		System.out.println("8 - LOG DO N�MERO 1");
		System.out.println("9 - LOG DO N�MERO 2");
		System.out.println("10 - ENCERRAR");

		opcao = scanner.nextInt();

		System.out.println("Digite um n�mero:");
		double num = scanner.nextDouble();
		System.out.println("Digite o segundo n�mero:");
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

		default:

			System.out.println("Programa encerrado");
			break;
		}
		scanner.close();
	}

}
