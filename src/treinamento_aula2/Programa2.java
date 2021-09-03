package treinamento_aula2;

import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um nome: ");
		String nome=sc.nextLine();

		if (nome.equals("Roberto")|| nome.equals("Daniel") )
			System.out.println("Professor");
		else if (nome.equals("Lucas"))
			System.out.println("Aluno");
		else if (nome.equals("Francisco"))
			System.out.println("Aluno");
		else if (nome.equals("Cristian"))
			System.out.println("Aluno");
		else
			System.out.println("Nome inválido");

		sc.close();

	}

}
