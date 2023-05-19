package aula1705Q5;

public class Monitor {
	public String marca;
	
	public Monitor() {
		
	}
	public Monitor(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String toString() {
		return "\nMonitor: "+marca;
	}
}
