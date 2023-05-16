package sacardepositar;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Conta corrente = new Conta();
		Conta poupanca = new Conta();
		int v,op;
		double valor;
		
	do{
		System.out.printf("\nDeseja visualizar o valor atual de sua conta?\n[1] - Sim  [2] - Não\n--> ");
		
		v = scan.nextInt();
		if(v == 1) {
			System.out.printf("\n[1] - CONTA CORRENTE  [2] - CONTA POUPANÇA\n--> ");
			op = scan.nextInt();
			if(op == 1) {
				System.out.printf("Conta corrente\nValor atual: %.2f\n", corrente.getSaldo());
			}
			else if (op == 2) {
				System.out.printf("\nConta poupança\nValor atual: %.2f\n", poupanca.getSaldo());
			}
			else {
				System.out.printf("Inválido!");
			}
		}
		}while(v == 1);
	System.out.printf("\n\n\n---------------------\n        MENU\n---------------------\n[1] - CONTA CORRENTE [2] - CONTA POUPANÇA\n--> ");
	v = scan.nextInt();
		do {
			
			if (v == 1) {
				
				System.out.printf("---------------------\n[1] - SACAR [2] - DEPOSITAR\n--> ");
				op = scan.nextInt();
				
				if (op == 1) {
					
					System.out.printf("SAQUE\nVALOR: R$");
					corrente.sacar(scan.nextDouble());

				} 
				else {
					
					System.out.printf("DEPOSITAR\nVALOR: R$");				
					corrente.depositar(scan.nextDouble());
;
				}
			}
			else {
				
				System.out.printf("---------------------\n[1] - SACAR [2] - DEPOSITAR\n--> ");
				op = scan.nextInt();
				
				if (op == 1) {
					
					System.out.printf("SAQUE\nVALOR: R$");
					poupanca.sacar(scan.nextDouble());
					
				} else {
					
					System.out.printf("DEPOSITAR\nVALOR: R$");
					poupanca.depositar(scan.nextDouble());
					
				}
			}
			System.out.printf("\n\n\n---------------------\n        MENU\n---------------------\n[1] - CONTA CORRENTE [2] - CONTA POUPANÇA\n--> ");
			v = scan.nextInt();
		}while(v == 1 | v == 2);
		System.out.printf("\nPrograma encerrado!");
	}

}
