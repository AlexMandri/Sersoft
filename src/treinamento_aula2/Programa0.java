package treinamento_aula2;

import java.util.Scanner;

public class Programa0 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Ângulo: ");
		int angulo = sc.nextInt();

		if (angulo >= 270)
			System.out.println("Quarto quadrante");
		else if (angulo >= 180)
			System.out.println("Terceiro quadrante");
		else if (angulo >= 90)
			System.out.println("Segundo quadrante");
		else if (angulo >= 0)
			System.out.println("Primeiro quadrante");
		else
			System.out.println("Ângulo inválido");

	}

}
