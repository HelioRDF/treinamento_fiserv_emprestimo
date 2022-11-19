package modelo;

public class Cliente {
	String nome;
	int idade, valor;

	public Cliente(String nome, int idade, int valor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.valor = valor;
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", valor=" + valor + "]";
	}
	
	

}
