package main;

import modelo.cliente.Cliente;
import modelo.conta.Conta;
import modelo.conta.ContaCorrente;
import modelo.conta.ContaPoupanca;
import modelo.endereco.Endereco;

public class Main {

	public static void main(String[] args) {
		
		Endereco endereroClienteCC = new Endereco("Pernambuco", "Recife", "Boa Vista", "Rua Barao de Sao Borja",385);
		Cliente clienteCC = new Cliente("Luis","07677436447", endereroClienteCC);
		Conta cc = new ContaCorrente(clienteCC, 100);
		
		cc.depositar(150);
//		cc.sacar(140);
		cc.imprimirExtrato();
		
		System.out.println("===================");
		Endereco endereroClienteCP = new Endereco("Pernambuco", "Olinda", "Peixinhos", "Rua Jorge Albquerque de Carvalho", 86);
		Cliente clienteCP = new Cliente("Marcos","05188994461",endereroClienteCP);
		Conta cp = new ContaPoupanca(clienteCP);
		
//		cp.depositar(80);
//		cp.sacar(50);
		cc.transferir(160, cp);
		cp.imprimirExtrato();
		cc.imprimirExtrato();
	
	}

}
