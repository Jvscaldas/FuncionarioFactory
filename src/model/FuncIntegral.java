package model;

public class FuncIntegral extends Func {

	private int bancoHoras;

	public int getBancoHoras() {
		return bancoHoras;
	}

	public void setBancoHoras(int bancoHoras) {
		this.bancoHoras = bancoHoras;
	}

	@Override
	public String toString() {
		return "FuncIntegral [bancoHoras=" + bancoHoras + "]";
	}
}
