package modelo.conta;

import modelo.cliente.Cliente;

public abstract class Conta {
	private Cliente cliente;
	protected double saldo;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public Conta(Cliente cliente) {
		super();
		this.cliente = cliente;
		this.saldo = 0;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
			System.out.println("Depósito realizado com sucesso");
		} else {
			System.out.println("O valor do depósito deve ser maior que zero");
		}
	}
	
	public void sacar(double valor) {
		if(valor > 0 && valor <= saldo) {
			saldo = saldo - valor;
			System.out.println("Saque realizado com sucesso");
		} else {
			System.out.println("Saldo insuficiante");
		}
	}
	
	public void transferir(double valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public abstract void imprimirExtrato();


}
