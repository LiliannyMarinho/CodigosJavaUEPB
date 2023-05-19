package aula1705;

public class Pessoa {
	public String nome;
	public Data dt;
	public Contato cont;
	public Endereco end;
	//métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//
	public Data getDt() {
		return dt;
	}
	public void setDt(Data dt) {
		this.dt = dt;
	}
	public Contato getCont() {
		return cont;
	}
	public void setCont(Contato cont) {
		this.cont = cont;
	}
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	
	public String toString() {
		return "Nome: " + nome + ""+dt.toString()+cont.toString()+end.toString()+"";
	
	}
}
