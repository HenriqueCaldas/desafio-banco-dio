package main;

import modelo.banco.Agencia;
import modelo.banco.Banco;
import modelo.cliente.Cliente;
import modelo.conta.Conta;
import modelo.conta.ContaCorrente;
import modelo.conta.ContaPoupanca;
import modelo.endereco.Endereco;

public class Main {

	public static void main(String[] args) {
		
		//Criacao do sistema bancário, padrão singleton 
		Banco banco = Banco.getInstance();

		// Criação das agências
		Agencia agenciaCentro = new Agencia(
				new Endereco("Rio de Janeiro", "Rio de Janeiro", "Lapa", "Rua Riachuelo", 100));
		Agencia agenciaSantoCristo = new Agencia(
				new Endereco("Rio de Janeiro", "Rio de Janeiro", "Santo Cristo", "Rua Geógrafo", 200));

		// Criação do cliente e conta corrente
		Endereco endereroClienteCC = new Endereco("Pernambuco", "Recife", "Boa Vista", "Rua Barao de Sao Borja", 385);
		Cliente clienteCC = new Cliente("Luis", "07677436447", endereroClienteCC);
		Conta LuisCC = new ContaCorrente(clienteCC, 100, agenciaCentro);

		// Operações na conta corrente
		LuisCC.depositar(150);
		LuisCC.sacar(140);
		LuisCC.imprimirExtrato();

		System.out.println("===================================");

		// Criação do cliente e conta poupança
		Endereco endereroClienteCP = new Endereco("Pernambuco", "Olinda", "Peixinhos",
				"Rua Jorge Albquerque de Carvalho", 86);
		Cliente clienteCP = new Cliente("Marcos", "05188994461", endereroClienteCP);
		Conta MarcosCP = new ContaPoupanca(clienteCP, agenciaSantoCristo);

		// Operações na conta poupança e transferência entre contas
		MarcosCP.depositar(80);
		MarcosCP.sacar(50);
		LuisCC.transferir(100, MarcosCP);
		MarcosCP.imprimirExtrato();
		LuisCC.imprimirExtrato();

		System.out.println("===================================");

		// Exibição da lista de clientes do banco
		System.out.println("Lista de clientes: ");
		System.out.println(banco.listarClientes());

		System.out.println("===================================");

		// Exibição da lista de contas do banco
		System.out.println("Lista de Contas: ");
		System.out.println(banco.listarContasCorrentes());
		System.out.println(banco.listarContasPoupancas());
	}
}