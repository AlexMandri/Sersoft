package treinamento_aula2;

import java.util.Scanner;

public class Programa4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um nome: ");
		String nome = sc.nextLine();

		switch (nome) {
		case "Roberto":
			System.out.println("Professor");
			break;
		case "Lucas":
			System.out.println("Aluno");
			break;
		case "Francisco":
			System.out.println("Aluno");
			break;
		case "Christian":
			System.out.println("Aluno");
			break;
		default:
			System.out.println("Nome inválido");
		}

		sc.close();
	}
}
