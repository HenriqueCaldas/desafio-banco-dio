package modelo.conta;

import modelo.cliente.Cliente;

public class ContaCorrente extends Conta {

	private double limiteChequeEspecial;

	public ContaCorrente(Cliente cliente, double limiteChequeEspecial) {
		super(cliente);
		this.limiteChequeEspecial = limiteChequeEspecial;

	}

	@Override
	public void transferir(double valor, Conta destino) {
	  sacar(valor);
	  destino.depositar(valor);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato da Conta Corrente ===");
		System.out.println("Cliente: " + getCliente().getNome());
		System.out.println("Saldo atual: " + getSaldo());
		System.out.println("Limite: " + limiteChequeEspecial);

	}

	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	@Override
	public void sacar(double valor) {
	    if (valor > 0 && valor <= (getSaldo() + limiteChequeEspecial)) {
	        if (valor <= getSaldo()) { 
	          setSaldo(getSaldo() - valor);
	        } else {	            
	        	double diferenca = valor - getSaldo();
	            setSaldo(0); 
	            limiteChequeEspecial -= diferenca;
	        }
	        System.out.println("Saque realizado com sucesso");
	    } else {
	    	System.out.println("Saldo insuficiente");
	    }
		
	}

}
