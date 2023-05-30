package aula2905;

public class Main {

	public static void main(String[] args) {
		Aluno a = new Aluno("João","123456","12/05/1998","333333");
		//preenchi tudo pelo objeto ac
		ChefDep ac = new ChefDep("Winter","124355","09/04/1999","999999","29/05/2023",3450,"Principal","20/07/2023",1000);
		
		System.out.printf(a.toString());
		System.out.printf(ac.toString());
		
	}

}
