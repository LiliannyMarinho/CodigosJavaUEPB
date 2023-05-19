package aula1705Q5;

public class Computador {
	public String marca;
	public Teclado tec;
	public Monitor monit;
	public PlacaMae p_m;
	
	public Computador() {
		
	}
	public Computador(String marca,Teclado tec,Monitor monit,PlacaMae p_m) {
		this.marca = marca;
		this.tec = tec;
		this.monit = monit;
		this.p_m = p_m;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Teclado getTec() {
		return tec;
	}
	public void setTec(Teclado tec) {
		this.tec = tec;
	}
	public Monitor getMonit() {
		return monit;
	}
	public void setMonit(Monitor monit) {
		this.monit = monit;
	}
	public PlacaMae getP_m() {
		return p_m;
	}
	public void setP_m(PlacaMae p_m) {
		this.p_m = p_m;
	}
	
	public String toString() {
		return "Computador: "+marca+tec.toString()+monit.toString()+p_m.toString();
	}
	
}
