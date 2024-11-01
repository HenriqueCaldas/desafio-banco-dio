package modelo.cliente;

import modelo.banco.Banco;
import modelo.endereco.Endereco;

/**
 * Representa um cliente do banco
 * Cada cliente possui um nome, CPF e endereço, e é automaticamente adicionado a lista de clientes do banco.
 */
public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;

    /**
     * Construtor para criar uma nova instância de Cliente
     * O cliente é automaticamente adicionado à lista de clientes do banco.
     *
     * @param nome     o nome do cliente
     * @param cpf      o CPF do cliente
     * @param endereco o endereço do cliente
     */
    public Cliente(String nome, String cpf, Endereco endereco) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        Banco.getInstance().adicionarCliente(this);
    }

    /**
     * Retorna o nome do cliente.
     *
     * @return o nome do cliente
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o CPF do cliente.
     *
     * @return o CPF do cliente
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Retorna o endereço do cliente.
     *
     * @return o endereço do cliente
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Retorna informações detalhadas de todos os clientes, incluindo nome, CPF e endereço.
     *
     * @return uma string com o nome, CPF e endereço do cliente
     */
    @Override
    public String toString() {
        return "Cliente{" +
               "nome='" + nome + '\'' +
               ", cpf='" + cpf + '\'' +
               ", endereco=" + endereco +
               '}';
    }
}
