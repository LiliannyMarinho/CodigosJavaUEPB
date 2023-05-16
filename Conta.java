package sacardepositar;

public class Conta {
	private double saldo = 500;
	
	public double getSaldo() {
		return saldo;
	}
	

	//métodos
	public void depositar(double v) {
		saldo = saldo + v;
		System.out.printf("Saldo atual: %.2f",saldo);
		System.out.printf("\nValor depositado com Sucesso!");
	}
	public void sacar(double v) {
		if(saldo < v) {
			System.out.printf("Saldo insuficiente!\n");
		}
		else {
			saldo = saldo - v;
			System.out.printf("Saldo atual: %.2f",saldo);
			System.out.printf("\nValor sacado com sucesso!");
		}
	}

}
