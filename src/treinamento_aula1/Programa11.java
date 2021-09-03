package treinamento_aula1;

public class Programa11 {

	public static void main(String[] args) {
		int num =-11;
		if(num>0)
			System.out.println((num%2==0)?"par":"impar");
		
		String resultado = (num>=0)?(num%2==0)?"Par":"Impar":"não se aplica!!";
		System.out.println(resultado);

	}

}
