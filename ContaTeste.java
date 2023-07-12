package javawork;

public class ContaTeste {
	public static void main (String[] args) throws InterruptedException {

		Conta conta_ = new Conta();
		Conta conta_2 = new Conta();
		
		conta_.Cliente = "CALIL";
		conta_2.Cliente = "EDUARDO";
		
		conta_.Saldo = 1600.50;
		conta_2.Saldo = 1000;
		
		conta_.ExibirSaldo();
		conta_2.ExibirSaldo();
		
		conta_.Sacar(1400);
		conta_.Depositar(10);


		conta_.Tranferir(conta_2, 1500);
		conta_.ExibirSaldo();
		
		conta_2.ExibirSaldo();
		Thread.sleep(5000);
		System.out.println("Interação terminada.");
	}
}
