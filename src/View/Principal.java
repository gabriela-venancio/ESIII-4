package View;

import Controller.BeloHorizonte;
import Controller.Curitiba;
import Controller.ICalcularImposto;
import Controller.PortoAlegre;
import Controller.SaoPaulo;

public class Principal {

	public static void main(String[] args) {
		ICalcularImposto calc = new SaoPaulo();
		calc.calculaImposto();

		ICalcularImposto calc2 = new BeloHorizonte();
		calc2.calculaImposto();

		ICalcularImposto calc3 = new PortoAlegre();
		calc3.calculaImposto();

		ICalcularImposto calc4 = new Curitiba();
		calc4.calculaImposto();
	}

}
