package Controller;

import javax.swing.JOptionPane;

public class SaoPaulo implements ICalcularImposto {
	public void calculaImposto() {
		float imposto;
		float area = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a area"));
		int nComodos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de comodos"));

		imposto = area * 10 + nComodos * 2;
		System.out.println("O imposto para o morador de SP sera:" + imposto);
	}

}
