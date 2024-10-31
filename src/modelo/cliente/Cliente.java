package modelo.cliente;

import modelo.endereco.Endereco;

public class Cliente {
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	
	public Cliente(String nome, String cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}


	public Endereco getEndereco() {
		return endereco;
	}
	
	
	
	
	
}
