package aula1705Q5;

public class PlacaMae {
	public String marca;
	
	
	public PlacaMae() {
		
	}
	public PlacaMae(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String toString() {
		return "\nPlaca mãe: "+marca;
	}
}
