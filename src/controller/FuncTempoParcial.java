package controller;

import model.Func;
import model.FuncParcial;

public class FuncTempoParcial extends FuncController {

	@Override
	public Func contratacao(Func f) {
		if (f.getTipo() == 2) {
			FuncParcial fP = new FuncParcial();
			int id = (int) ((Math.random() * 1001) + 1000);
			fP.setId(id);
			fP.setNome("Ronaldo");
			fP.setSalario(1500);
			fP.setHrEntrada(7);
			fP.setHrSaida(16);

			return fP;
		}
		return null;

	}
}
