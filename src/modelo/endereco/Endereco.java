package modelo.endereco;

public class Endereco {
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private int numero;
	
	public Endereco(String estado, String cidade, String bairro, String rua, int numero) {
		super();
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}
	
	public String getCidade() {
		return cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public String getRua() {
		return rua;
	}

	public int getNumero() {
		return numero;
	}

	
	
	
}
