package aula2905;

public class Funcionario extends Pessoa{
	protected String fMatric;
	protected String dataAdm;
	protected double salario;
	
	//cria o construtor para receber os atributos da classe mãe
	public Funcionario(String fMatric, String dataAdm, double salario) {
		this.fMatric = fMatric;
		this.dataAdm = dataAdm;
		this.salario = salario;
	}
	public Funcionario(String nome, String cpf, String dataNasc, String fMatric, String dataAdm, double salario) {
		super(nome, cpf, dataNasc);
		this.fMatric = fMatric;
		this.dataAdm = dataAdm;
		this.salario = salario;
	}
	public Funcionario() {
		
	}
	
	public void setFMatric(String fMatric) {
		this.fMatric = fMatric;
	}
	public void setDataAdm(String dataAdm) {
		this.dataAdm = dataAdm;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
