package aula1705;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		/*instancia pra acessar o objeto pessoa*/
		Pessoa pe = new Pessoa();
		Data dat = new Data();
		Contato cont = new Contato();
		Endereco end = new Endereco();
		pe.setDt(dat);
		pe.setCont(cont);
		pe.setEnd(end);
		
		System.out.printf("Nome: ");
		pe.setNome(scan.nextLine());
		
		System.out.printf("\nData de Nascimento\nDia: ");
		dat.setDia(scan2.nextInt());
		System.out.printf("Mês: ");
		dat.setMes(scan2.nextInt());
		System.out.printf("Ano: ");
		dat.setAno(scan2.nextInt());
		
		System.out.printf("\nContato\nTelefone Residencial: ");
		cont.setTelef_R(scan.nextLine());
		System.out.printf("\nCelular: ");
		cont.setCelular(scan.nextLine());
		System.out.printf("\nEmail: ");
		cont.setEmail(scan.nextLine());
		
		System.out.printf("\nEndereco\nLogradouro: ");
		end.setLogra(scan.nextLine());
		System.out.printf("\nNumero: ");
		end.setNumero(scan2.nextInt());
		System.out.printf("\nBairro: ");
		end.setBairro(scan.nextLine());
		System.out.printf("\nCidade: ");
		end.setCidade(scan.nextLine());
		System.out.printf("\nEstado: ");
		end.setEstado(scan.nextLine());
		System.out.printf("\nCep: ");
		end.setCep(scan.nextLine());
		System.out.println("\n\n\n\n\n");
		System.out.print(pe.toString());
		
		
		
	}


}
