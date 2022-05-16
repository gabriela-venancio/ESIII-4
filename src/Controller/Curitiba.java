package Controller;

import javax.swing.JOptionPane;

public class Curitiba implements ICalcularImposto {
	public void calculaImposto() {
		float imposto;
		float area = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a area"));
		int idadeImovel = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do imovel"));

		if (idadeImovel > 50) {
			imposto = area * 5 + idadeImovel * 3;
		} else if (idadeImovel < 20) {
			imposto = area * 5 + idadeImovel * 2;
		} else {
			imposto = (float) (area * 5 + idadeImovel * 2.5);
		}
		System.out.println("O imposto para o morador de Curitiba sera:" + imposto);

	}
}