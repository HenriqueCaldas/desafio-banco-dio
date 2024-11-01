package modelo.conta;

import modelo.banco.Agencia;
import modelo.banco.Banco;
import modelo.cliente.Cliente;

/**
 * Representa uma conta poupança
 * Esta classe herda da classe {@link Conta} e inclui métodos específicos
 * para exibir extratos e realizar transferências.
 */
public class ContaPoupanca extends Conta {
	
	 /**
     * Construtor para criar uma nova conta poupança associada a um cliente e a uma agência.
     * A conta é automaticamente adicionada ao banco.
     *
     * @param cliente o cliente proprietário da conta
     * @param agencia a agência associada à conta
     */
	public ContaPoupanca(Cliente cliente, Agencia agencia) {
		super(cliente);
		Banco.getInstance().adicionarContaPoupanca(this);
		
	}

    /**
     * Exibe o extrato da conta poupança, incluindo o nome do cliente e o saldo atual.
     */
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato da Conta Corrente ===");
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Saldo atual: " + getSaldo());
		
	}
	
    /**
     * Realiza uma transferência para uma outra conta.
     * O valor é sacado desta conta e depositado na conta de destino.
     *
     * @param valor        o valor a ser transferido
     * @param contaDestino a conta de destino que receberá o valor transferido
     */
	@Override
	public void transferir(double valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	/**
     * Retorna informações detalhadas de todas as contas poupancas do banco, incluindo dados dos clientes e números das contas criadas.
     * 
     * @return string com os clientes e números das contas
     */
	@Override
	public String toString() {
		return "Contas Poupancas{" +
				super.getCliente() + "\n" +
				"Conta=" + super.getNumeroConta() + '}';
	}

}
