package aula1705;

public class Contato {
	public String telef_R;
	public String celular;
	public String email;
	
	//métodos
	public String getTelef_R() {
		return telef_R;
	}
	public void setTelef_R(String telef_R) {
		this.telef_R = telef_R;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "\n\nContato\nTelefone Residencial: " + telef_R +"\nCelular: " + celular +"\nEmail: " +email+"";
	}
	
}
