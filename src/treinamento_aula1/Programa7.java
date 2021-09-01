package treinamento_aula1;

import javax.swing.JOptionPane;

public class Programa7 {

	public static void main(String[] args) {
		String numero1= JOptionPane.showInputDialog("Digite o primeiro número: ");
		int num1 = Integer.parseInt(numero1);
		
		String numero2 = JOptionPane.showInputDialog("Digite o segunto número: ");
		int num2 = Integer.parseInt(numero2);
		
		JOptionPane.showMessageDialog(null,"Você digitou: "+numero1 + " e "+ numero2);
		
		JOptionPane.showMessageDialog(null, (num1+num2));

	}

}
