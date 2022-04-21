package controller;

import model.Func;
import model.FuncIntegral;

public class FuncTempoIntegral extends FuncController {

	@Override
	public Func contratacao(Func f) {
		if (f.getTipo() == 1) {
			FuncIntegral fI = new FuncIntegral();
			int id = (int) ((Math.random() * 1001) + 1000);
			fI.setId(id);
			fI.setNome("Aldo");
			fI.setSalario(2000);
			fI.setBancoHoras(120);

			return fI;
		}
		return null;
	}
}
