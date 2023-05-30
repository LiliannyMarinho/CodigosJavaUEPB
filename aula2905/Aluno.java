package aula2905;

public class Aluno extends Pessoa{
	protected String aMatric;
	
	//recebemos os atributos da classe mãe no construtor
	public Aluno(String nome, String cpf, String dataNasc, String aMatric) {
		super(nome, cpf, dataNasc);
		this.aMatric = aMatric;
		
	}
	public Aluno() {
		
	}
	
	public void setAMatric(String aMatric) {
		this.aMatric = aMatric;
	}
	
	public String toString() {
		return "***Aluno***\n\nNome: "+nome+"\nCPF: "+cpf+"\nData de Nascimento: "+dataNasc+"\nMatrícula: "+aMatric;
	}
}
