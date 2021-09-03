package treinamento_aula1;

import java.util.Scanner;

public class Programa14a {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um nome: ");
		String nome = sc.next();
		
		switch(nome) {
		case "Roberto":
			System.out.println("Professor");
		default:
			System.out.println("Cuidado com o caixa da letra!!");
		
		}
		

	}

}
