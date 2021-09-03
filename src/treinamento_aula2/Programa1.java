package treinamento_aula2;

import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int numero = sc.nextInt();

		// uso da estrutura if else
		if (numero % 2 == 0)
			System.out.println("Par");
		else
			System.out.println("�mpar");

		// uso de operador tern�rio
		System.out.println(numero % 2 == 0 ? "Par" : "impar");

		// uso da estrutura switch case
		switch (numero % 2) {
		case 0:
			System.out.println("Par");
			//break;
		case 1:
			System.out.println("�mpar");
		}
		sc.close();
	}

}
