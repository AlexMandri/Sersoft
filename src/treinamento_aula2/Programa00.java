package treinamento_aula2;

import java.util.Scanner;

public class Programa00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o �ngulo: ");
		int angulo = sc.nextInt();

		if (angulo <= 90)
			System.out.println("Primeiro quadrante");
		else if (angulo <= 180)
			System.out.println("Segundo quadrante");
		else if (angulo <= 270)
			System.out.println("Terceiro quadrante");
		else if (angulo <= 360)
			System.out.println("Quarto quadrante");
		else
			System.out.println("�ngulo inv�lido");
		
		sc.close();
	}

}
