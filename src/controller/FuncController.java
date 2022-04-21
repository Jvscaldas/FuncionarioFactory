package controller;

import model.Func;

public abstract class FuncController {

	public void iniciaFuncionario(Func f) {
		System.out.println("Processo de contrata��o " + f.getTipo());
	}
	
	public abstract Func contratacao(Func f);

}
