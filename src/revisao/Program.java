package revisao;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int num2;

		int opcao = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero:");
		num = scanner.nextInt();
		System.out.println("Digite o segundo n�mero:");
		num2 = scanner.nextInt();

		System.out.println("MENU DE ESCOLHAS");
		System.out.println("1 - SOMA");
		System.out.println("2 - SUBTRA��O");
		System.out.println("3 - DIVIS�O");
		System.out.println("4 - MULTIPLICA��O");

		opcao = scanner.nextInt();

		switch (opcao) {

		case 1:

			int soma = num + num2;
			System.out.println(soma);

			break;

		case 2:

			int sub = num - num2;

			System.out.println(sub);
			break;

		case 3:

			int div = num / num2;
			System.out.println(div);
			break;
		case 4:

			int multi = num * num2;
			System.out.println(multi);
			break;

		default:

			System.out.println("N�mero invalido");
			break;
		}

	}

}
