package modelo.conta;

import modelo.cliente.Cliente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato da Conta Corrente ===");
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Saldo atual: " + getSaldo());
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
		System.out.println("Transferência realizada com sucesso");
		
	}

}
