package treinamento_aula1;

import javax.swing.JOptionPane;

public class Programa15 {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Digite o primeiro n�mero: ");
		int n1 = Integer.parseInt(num1);

		String num2 = JOptionPane.showInputDialog("Digite o segundo n�mero: ");
		int n2 = Integer.parseInt(num2);

		String opcao = JOptionPane.showInputDialog(
				"Escolha: \n" + "Adi��o + \n" + "Subtra��o - \n" + "Multiplica��o * \n" + "Divis�o / ");

		switch (opcao) {
		case "Adi��o":
			JOptionPane.showMessageDialog(null, "Soma: " + (n1 + n2));
			break;
		case "Subtra��o":
			JOptionPane.showMessageDialog(null, "Subtra��o: " + (n1 - n2));
			break;
		case "Multiplica��o":
			JOptionPane.showMessageDialog(null, "Multiplica��o: " + (n1 * n2));
			break;
		case "Divis�o":
			JOptionPane.showMessageDialog(null, "Divis�o: " + (n1 / n2));
			break;
		default:
			JOptionPane.showMessageDialog(null, "inv�lido");

		}
	}

}
