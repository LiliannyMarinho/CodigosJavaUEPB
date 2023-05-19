package aula1705Q5;

public class Main {

	public static void main(String[] args) {
		
		Teclado tec = new Teclado("XXXXXX");
		Monitor monit = new Monitor("XXXXXX");
		PlacaMae p_m = new PlacaMae("XXXXXX");
		Computador comp = new Computador("XXXXXX",tec,monit,p_m);
		comp.setTec(tec);
		comp.setMonit(monit);
		comp.setP_m(p_m);
		
		System.out.println(comp.toString());
	}

}
