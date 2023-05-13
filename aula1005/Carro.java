package aula1005;
import java.util.Scanner;
public class Carro {

	public static void main(String[] args) {
		String tipo_G,combu,retorno;
		Scanner scan = new Scanner(System.in);
		System.out.printf("Tipo de combustível: [1] - Álcool  [2] - Gasolina  [3] - Flex\n\n---> ");
		tipo_G = scan.nextLine();
		Carro1 car = new Carro1("Fiat","UNO",2011,tipo_G);
		Pessoa pe = new Pessoa("Lilianny",118,car);
		Carro1 carropessoa = pe.getCarro();
		
		//print sem a relação de classes
		System.out.printf("\nMarca: %s\nModelo: %s\nAno de fabricação: %d\nCombustível: Tipo %s\n",car.getMarca(),car.getModelo(),car.getAno(),car.getCombust());

		retorno = car.ligar();
		if(retorno == "0") {
			System.out.printf("\nLigando carro...");
		}
		retorno = car.acelerar();
		if(retorno == "0") {
			System.out.printf("\nAcelerando carro...");
		}
		retorno = car.frear();
		if(retorno == "1") {
			System.out.printf("\nFreando carro...");
		}
		retorno = car.desligar();
		if(retorno == "1") {
			System.out.printf("\nDesligando carro...");
		}
		//print com a relação entre classe pessoa e carro
		System.out.printf("\n\nPessoa: %s\nIdentidade: %d\n\nCarro",pe.getNome(),pe.getIdentidade());
		System.out.println("\nMarca: "+carropessoa.getMarca());
		System.out.println("Modelo: "+carropessoa.getModelo());
		System.out.println("Ano de fabricação: "+carropessoa.getAno());
		System.out.println("Tipo de comvustível: "+carropessoa.getCombust());
		System.out.println("");
	}

}
