package model;

public class FuncParcial extends Func {

	private int hrEntrada;
	private int hrSaida;

	public int getHrEntrada() {
		return hrEntrada;
	}

	public void setHrEntrada(int hrEntrada) {
		this.hrEntrada = hrEntrada;
	}

	public int getHrSaida() {
		return hrSaida;
	}

	public void setHrSaida(int hrSaida) {
		this.hrSaida = hrSaida;
	}

	@Override
	public String toString() {
		return "FuncParcial [hrEntrada=" + hrEntrada + ", hrSaida=" + hrSaida + "]";
	}
}
