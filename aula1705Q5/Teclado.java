package aula1705Q5;

public class Teclado {
	public String marca;
	
	public Teclado() {
		
	}
	public Teclado(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String toString() {
		return "\nTeclado: "+marca;
	}
}
