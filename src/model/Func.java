package model;

public class Func {

	private int id;
	private String nome;
	private float salario;
	private int tipo;

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Func [id=" + id + ", nome=" + nome + ", salario=" + salario + ", tipo=" + tipo + "]";
	}
}
