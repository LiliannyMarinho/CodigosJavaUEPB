package aula2905;

public class Pessoa {
	//atributos da superclasse
	protected String nome;
	protected String cpf;
	protected String dataNasc;
	
	
	public Pessoa (String nome, String cpf, String dataNasc) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
	}
	public Pessoa() {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}


}
