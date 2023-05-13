package aula1005;

public class Pessoa {
	String nome;
	int identidade;
	private Carro1 carro;
	
	public Pessoa(String nome, int identidade, Carro1 carro) {
		this.nome = nome;
		this.identidade = identidade;
		this.carro = carro;
	}
	
	//atributos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdentidade() {
		return identidade;
	}
	public void setIdentidade(int identidade) {
		this.identidade = identidade;
	}
	public Carro1 getCarro() {
		return carro;
	}
	public void setCarro(Carro1 carro) {
		this.carro = carro;
	}
}
