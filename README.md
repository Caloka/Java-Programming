# Java-Programming
**Pequeno sistema de interação cliente-banco usando linguagem Java**
Abaixo, está escrito a nossa classe criada com as variáveis e métodos respectivamente do sistema.
~~~~java
package javawork;

public class Conta {
	String  Cliente;
	double Saldo;
	
	
	public void Sacar(double value) {
		if (value < Saldo) {
		   Saldo -= value;
		   System.out.println("Saque realizado com sucesso!");
		   System.out.println("Agora seu saque é de R$ " + Saldo);
		}
		else {
			System.out.println("O valor não possui no seu Saldo no momento.\nTente outro valor.");
		}
	}
	
	public void Depositar(double value) {
		Saldo += value;
	}
	
	public void Tranferir(Conta destino,double value) {
		 
		if (value > Saldo) {
			System.out.println("Você não possui saldo suficiente para tranferir.");
		}
		else {
			Saldo -= value;
			destino.Saldo += value;
		}	
	}
	
	public void ExibirSaldo() {
		String text = "Olá Prezado(a) " + Cliente + ", você possui um saldo de R$ " + Saldo;
		System.out.println(text);
	}
}

~~~~
