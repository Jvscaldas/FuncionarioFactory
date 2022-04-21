package controller;

import model.Func;
import model.FuncTemp;

public class FuncTemporario extends FuncController {
	@Override
	public Func contratacao(Func f) {
		if (f.getTipo() == 3) {
			FuncTemp fT = new FuncTemp();
			int id = (int) ((Math.random() * 1001) + 1000);
			fT.setId(id);
			fT.setNome("Armando");
			fT.setSalario(1000);
			fT.setDia(21);
			fT.setMes(12);
			fT.setAno(2022);

			return fT;
		}
		return null;

	}
}
