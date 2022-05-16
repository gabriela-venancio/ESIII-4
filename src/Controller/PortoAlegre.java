package Controller;

import javax.swing.JOptionPane;

public class PortoAlegre implements ICalcularImposto {
	public void calculaImposto() {
		float imposto;
		float area = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a area"));
		float areaGaragem = Float
				.parseFloat(JOptionPane.showInputDialog(null, "Digite a areada garagem, digite 0 caso nao tenha"));
		if (areaGaragem == 0) {
			imposto = area * 8;
		} else {
			imposto = (float) (area * 7.5 + areaGaragem * 2.5);
		}

		System.out.println("O imposto para o morador de PA sera:" + imposto);
	}
}