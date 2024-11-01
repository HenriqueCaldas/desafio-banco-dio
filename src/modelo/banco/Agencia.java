package modelo.banco;

import modelo.endereco.Endereco;

public class Agencia {
	private static int contador = 1000;
	int numero;
	Endereco endereco;
	
	public Agencia(Endereco endereco) {
		super();
		this.numero = gerarNumeroAgencia();
		this.endereco = endereco;
	}
	
	private synchronized  int gerarNumeroAgencia () {
		return contador++;
	}

	public int getNumero() {
		return numero;
	}
	
	
}
