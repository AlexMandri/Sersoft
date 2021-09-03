package treinamento_aula2;

import java.util.Scanner;

public class Programa6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um nome: ");
		String nome = sc.nextLine();//.toUpperCase(); transnforma em maiúscula

		switch (nome.toUpperCase()) {
		case "ROBERTO":
			System.out.println("Professor");
			break;
		case "LUCAS": case "FRANCISCO": case "CHRISTIAN":
			System.out.println("Aluno");
			break;
		default:
			System.out.println("Nome inválido");
		}

		sc.close();

	}

}
