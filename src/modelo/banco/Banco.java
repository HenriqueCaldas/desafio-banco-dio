package modelo.banco;

import java.util.ArrayList;
import java.util.List;

import modelo.cliente.Cliente;
import modelo.conta.ContaCorrente;
import modelo.conta.ContaPoupanca;

/**
 * Classe que representa o sistema bancário. Implementa o padrão Singleton para garantir que
 * apenas uma instância do banco exista durante a execução da aplicação. Esta classe gerencia
 * listas de clientes e contas correntes e poupanças.
 */
public class Banco {

    private static Banco instancia; // Instância única do banco
    private List<Cliente> clientes = new ArrayList<>(); // Lista de clientes do banco
    private List<ContaCorrente> contasCorrente = new ArrayList<>(); // Lista de contas correntes
    private List<ContaPoupanca> contasPoupanca = new ArrayList<>(); // Lista de contas poupanças

    /**
     * Retorna a instância única do Banco. Se a instância não existir, uma nova é criada.
     *
     * @return A instância única do Banco.
     */
    public static Banco getInstance() {
        if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }

    /**
     * Adiciona um cliente à lista de clientes do banco.
     *
     * @param cliente O cliente a ser adicionado.
     */
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    /**
     * Retorna a lista de clientes do banco.
     *
     * @return Lista de clientes.
     */
    public List<Cliente> listarClientes() {
        return clientes;
    }

    /**
     * Adiciona uma conta corrente à lista de contas correntes do banco.
     *
     * @param contaCorrente A conta corrente a ser adicionada.
     */
    public void adicionarContaCorrente(ContaCorrente contaCorrente) {
        contasCorrente.add(contaCorrente);
    }

    /**
     * Retorna a lista de contas correntes do banco.
     *
     * @return Lista de contas correntes.
     */
    public List<ContaCorrente> listarContasCorrentes() {
        return contasCorrente;
    }

    /**
     * Adiciona uma conta poupança à lista de contas poupanças do banco.
     *
     * @param contaPoupanca A conta poupança a ser adicionada.
     */
    public void adicionarContaPoupanca(ContaPoupanca contaPoupanca) {
        contasPoupanca.add(contaPoupanca);
    }

    /**
     * Retorna a lista de contas poupanças do banco.
     *
     * @return Lista de contas poupanças.
     */
    public List<ContaPoupanca> listarContasPoupancas() {
        return contasPoupanca;
    }
}
