package treinamento_aula1;

import java.util.Scanner;

public class Programa13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Valor do litro do álcool:");
		double litroAlcool = entrada.nextDouble();

		System.out.println("Valor do litro da gasolina:");
		double litroGasolina = entrada.nextDouble();

		double resultado = litroAlcool / litroGasolina;

		if (resultado <= 0.7)
			System.out.println("Melhor álcool");
		else
			System.out.println("Melhor gasolina");

		entrada.close();

	}

}
