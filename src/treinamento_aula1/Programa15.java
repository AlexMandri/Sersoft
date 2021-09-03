package treinamento_aula1;

import javax.swing.JOptionPane;

public class Programa15 {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		int n1 = Integer.parseInt(num1);

		String num2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		int n2 = Integer.parseInt(num2);

		String opcao = JOptionPane.showInputDialog(
				"Escolha: \n" + "Adição + \n" + "Subtração - \n" + "Multiplicação * \n" + "Divisão / ");

		switch (opcao) {
		case "Adição":
			JOptionPane.showMessageDialog(null, "Soma: " + (n1 + n2));
			break;
		case "Subtração":
			JOptionPane.showMessageDialog(null, "Subtração: " + (n1 - n2));
			break;
		case "Multiplicação":
			JOptionPane.showMessageDialog(null, "Multiplicação: " + (n1 * n2));
			break;
		case "Divisão":
			JOptionPane.showMessageDialog(null, "Divisão: " + (n1 / n2));
			break;
		default:
			JOptionPane.showMessageDialog(null, "inválido");

		}
	}

}
