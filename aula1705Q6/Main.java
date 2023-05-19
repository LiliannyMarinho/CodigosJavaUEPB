package aula1705Q6;

public class Main {

	public static void main(String[] args) {
		Titulo t = new Titulo();
		t.setNome("XXXXXX");
		Autor a = new Autor();
		a.setNome("XXXXXX");
		Capitulo c = new Capitulo();
		c.setQuant(19);
		Editora e = new Editora();
		e.setNome("XXXXXX");
		Livro genero = new Livro("XXXXXX",t,a,c,e);
		genero.setT(t);
		genero.setA(a);
		genero.setC(c);
		genero.setE(e);
		
		System.out.println(genero.toString());

	}

}
