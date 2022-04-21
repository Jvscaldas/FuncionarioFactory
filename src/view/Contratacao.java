package view;

import controller.FuncController;
import controller.FuncTempoIntegral;
import controller.FuncTempoParcial;
import controller.FuncTemporario;
import model.Func;

public class Contratacao {

	public static void main(String[] args) {

		Func f = new Func();

		f.setTipo(3);

		Func funcionario = null;
		FuncController f1 = new FuncTempoIntegral();
		FuncController f2 = new FuncTempoParcial();
		FuncController f3 = new FuncTemporario();

		if (f1.contratacao(f) != null) {
			f1.iniciaFuncionario(f);
			funcionario = f1.contratacao(f);
		}

		if (f2.contratacao(f) != null) {
			f2.iniciaFuncionario(f);
			funcionario = f2.contratacao(f);
		}

		if (f3.contratacao(f) != null) {
			f3.iniciaFuncionario(f);
			funcionario = f3.contratacao(f);
		}

		System.out.println(funcionario.toString());

	}

}
