package treinamento_aula2;

import java.util.Scanner;

public class Programa000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a m�dia: ");
		double media = sc.nextDouble();

		if (media >= 7)
			System.out.println("Aprovado");
		else if (media >= 5)
			System.out.println("Exame");
		else if (media >= 0)
			System.out.println("Reprovado");
		else
			System.out.println("Lix�o");
		
		sc.close();
	}

}
