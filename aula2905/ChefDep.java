package aula2905;

public class ChefDep extends Funcionario{
	protected String dep;
	protected String dataPromo;
	protected double gratif;
	
	public ChefDep(String dep, String dataPromo, double gratif) {
		this.dep = dep;
		this.dataPromo = dataPromo;
		this.gratif = gratif;
	}
	public ChefDep(String nome,String cpf, String dataNasc,String fMatric, String dataAdm, double salario, String dep, String dataPromo, double gratif) {
		super(nome,cpf,dataNasc,fMatric, dataAdm, salario);
		this.dep = dep;
		this.dataPromo = dataPromo;
		this.gratif = gratif;
		
	}
	public ChefDep() {
		
	}
	
	public void setDep(String dep) {
		this.dep = dep;
	}
	public void setDataPromo(String dataPromo) {
		this.dataPromo = dataPromo;
	}
	public void setGratif(double gratif) {
		this.gratif = gratif;
	}
	
	public String toString() {
		return "\n\n***Funcionário***\n\nNome: "+nome+"\nCPF: "+cpf+"\nData de Nascimento: "+dataNasc+"\nMatrícula: "+fMatric+"\nData de Admissão: "+dataAdm+"\nSalário: "+salario+"\n\nDepartamento: "+dep+"\nData de Promoção: "+dataPromo+"\nGratificação: "+gratif;
	}
}
