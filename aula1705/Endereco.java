package aula1705;

public class Endereco {
	public String logra;
	public int numero;
	public String bairro;
	public String cidade;
	public String estado;
	public String cep;

	//métodos
	
	public String getLogra() {
		return logra;
	}
	public void setLogra(String logra) {
		this.logra = logra;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String toString() {
		return "\n\nEndereçoo\nLogradouro: "+ logra +"\nNúmero:"+ numero+ "\nBairro: "+bairro+"\nCidade: "+cidade+"\nEstado: "+estado+"\nCEP: "+cep+"";
	}
}
