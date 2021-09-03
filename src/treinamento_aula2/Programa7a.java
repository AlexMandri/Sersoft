package treinamento_aula2;

import java.util.Scanner;

public class Programa7a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um nome:\n\n" + "1 - FreeMont\n" + "2 - F500\n" + "3 - Punto\n" + "4 - Uno");
		int escolha = sc.nextInt();

		switch (escolha) {
		case 1:
			System.out.println("Mais espaço");
			System.out.println("Ar condicionado direcionado");
		case 2:
			System.out.println("Design arrojado");
			System.out.println("Banco de couro");
		case 3:
			System.out.println("Direção elétrica");
		case 4:
			System.out.println("Carroceeria");
			System.out.println("Porta copos");
		default:
			System.out.println("Motor");
			System.out.println("Pneu");
			System.out.println("Retrovisor");
		}

		sc.close();

	}

}
