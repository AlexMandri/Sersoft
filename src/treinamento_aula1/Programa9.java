package treinamento_aula1;

import java.util.Scanner;

public class Programa9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome:");
		String nome1 = entrada.next();

		System.out.print("Digite o sobrenome:");
		String nome2 = entrada.next();

		System.out.println("Nome completo: " + nome1 + " " + nome2);
		
		entrada.close();
	}

}
