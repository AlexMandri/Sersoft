package treinamento_aula2;

import java.util.Scanner;

public class Programa7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um nome: ");
		String nome = sc.nextLine().toLowerCase(); 

		switch (nome.toLowerCase()) {
		/*default:
			System.out.println(nome);
			System.out.println("Nome inválido");
			break;*/
		case "roberto":
			System.out.println("Professor");
			break;
			default:
			System.out.println(nome);
			System.out.println("Nome inválido");
			break;
		case "lucas": case "francisco": case "christian":
			System.out.println("Aluno");
			break;
		
		}

		sc.close();

	}

}
