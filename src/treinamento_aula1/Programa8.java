package treinamento_aula1;

import java.util.Scanner;

public class Programa8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro número:");
		int num1 = entrada.nextInt();
		
		System.out.print("Digite o segundo número:");
		int num2 = entrada.nextInt();
		
		System.out.println("O valor da soma é: "+ (num1+num2));
		
		entrada.close();
	}

}
