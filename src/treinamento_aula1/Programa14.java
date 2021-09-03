package treinamento_aula1;

public class Programa14 {

	public static void main(String[] args) {
		int num = 10;
		switch (num % 2) {
		case 0:
			System.out.println("Par");
		case 1:
			System.out.println("Ímpar");// cuidadado, sem o break continua lendo o código
		}

	}

}
