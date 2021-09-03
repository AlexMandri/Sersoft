package treinamento_aula2;

import java.util.Scanner;

public class Programa3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um nome: ");
		String nome = sc.nextLine();

		if (nome.equals("Roberto"))
			System.out.println("Professor");
		else if (nome.equals("Lucas") || 
					nome.equals("Francisco") || 
					nome.equals("Cristian"))
			System.out.println("Aluno");
		else
			System.out.println("Nome inválido");

		sc.close();
	}
}
