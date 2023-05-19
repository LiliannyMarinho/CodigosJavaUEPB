package aula1705Q6;

public class Livro {
	public String genero;
	public Titulo t;
	public Autor a;
	public Capitulo c;
	public Editora e;
	
	public Livro() {
		
	}
	public Livro(String genero, Titulo t, Autor a, Capitulo c, Editora e) {
		this.genero = genero;
		this.t  = t;
		this.a = a;
		this.c = c;
		this.e = e;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Titulo getT() {
		return t;
	}
	public void setT(Titulo t) {
		this.t = t;
	}
	public Autor getA() {
		return a;
	}
	public void setA(Autor a) {
		this.a = a;
	}
	public Capitulo getC() {
		return c;
	}
	public void setC(Capitulo c) {
		this.c = c;
	}
	public Editora getE() {
		return e;
	}
	public void setE(Editora e) {
		this.e = e;
	}
	
	public String toString() {
		return "Género: "+genero+t.toString()+a.toString()+c.toString()+e.toString();
	}
}
