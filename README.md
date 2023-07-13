# Java-Programming
**Pequeno sistema de interação cliente-banco usando linguagem Java**

Abaixo, está escrito a nossa classe, chamada Conta, criada com as variáveis e métodos respectivamente do sistema.
~~~~java
package javawork;

public class Conta {
	String  Cliente;
	double Saldo;
	
	
	public void Sacar(double value) {
		
		if (value <= Saldo && value > 0) {
		   Saldo -= value;
		   System.out.println("Cliente: "+ Cliente +"| "+"Saque no valor de R$ " + value + " realizado com sucesso!\nAgora seu saldo é de R$ " + Saldo);
		}
		else {
			System.out.println("Cliente: "+ Cliente +"| "+"O valor indicado não está disponível no seu saldo ou foi passado um valor incorreto.\nTente outro valor.");
		}
	}
	
	public void Depositar(double value) {
		if (value > 0) {
			Saldo += value;
		}
		else {
			System.out.println("Insira um valor válido.");
		}
	}
	
	public void Tranferir(Conta destino,double value) {
		 
		if (value > Saldo || value <= 0) {
			System.out.println("Cliente: "+ Cliente +"| "+"Você não possui saldo suficiente para tranferir ou o número digitado está errado.");
		}
		else {
			
			/*this.Sacar(value);*/
			Saldo -= value;
			destino.Depositar(value);
			System.out.println("Foram depositados R$ "+ value+ " para a conta do Cliente " + destino.Cliente);
			/*Saldo -= value;
			destino.Saldo += value;*/
		}	
	}
	
	public void ExibirSaldo() {
		String text = "Olá Prezado(a) " + Cliente + ", você possui um saldo de R$ " + Saldo;
		System.out.println(text);
	}
}

~~~~

Após isso, usamos um método main para criar os nossos objetos e utilizar os métodos.
~~~~java
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


~~~~
