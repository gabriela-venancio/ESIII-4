package Controller;

import javax.swing.JOptionPane;

public class BeloHorizonte implements ICalcularImposto {
	public void calculaImposto() {
		float imposto;
		float area = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a area"));
		int nQuartos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de quartos"));

		imposto = area * 7 + nQuartos * 4;

		System.out.println("O imposto para o morador de BH sera:" + imposto);

	}
}