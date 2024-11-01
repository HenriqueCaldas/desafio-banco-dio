package modelo.conta;

import modelo.banco.Agencia;
import modelo.banco.Banco;
import modelo.cliente.Cliente;

/**
 * Representa uma conta corrente
 * Esta classe herda da classe {@link Conta} e inclui métodos específicos e funcionalidades adicionais,
 * como o uso de limite de cheque especial que é atribuido ao instanciar a classe
 */
public class ContaCorrente extends Conta {

	private double limiteChequeEspecial;

	
    /**
     * Construtor que cria uma nova instância de ContaCorrente com um limite de cheque especial.
     *
     * @param cliente       		o cliente proprietário da conta
     * @param limiteChequeEspecial 	o valor do limite de cheque especial disponível
     * @param agencia       		a agência associada à conta
     * 
     */
	public ContaCorrente(Cliente cliente, double limiteChequeEspecial, Agencia agencia) {
		super(cliente);
		this.limiteChequeEspecial = limiteChequeEspecial;
		Banco.getInstance().adicionarContaCorrente(this);

	}
	
	/**
	 * Realiza uma tranferencia para uma outra conta, 
	 * utilizando o limite de cheque especial se necessário.
	 * 
	 * @param valor o valor a ser transferido
	 * @param destino a conta destino da transferência
	 */
	@Override
	public void transferir(double valor, Conta destino) {
	  sacar(valor);
	  destino.depositar(valor);
	}
	
	 /**
     * Exibe informações de Extrato da conta de um cliente, incluindo Nome do Cliente, Saldo e valor do cheque especial 
     */
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato da Conta Corrente ===");
		System.out.println("Cliente: " + getCliente().getNome());
		System.out.println("Saldo atual: " + getSaldo());
		System.out.println("Limite: " + limiteChequeEspecial);

	}
	
    /**
     * Retorna o limite de cheque especial da conta.
     *
     * @return o limite de cheque especial
     */
	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}
	
	/**
	 * Saca um valor da conta, utilizando o limite de cheque especial se necessário.
	 *
	 * @param valor o valor a ser sacado
	 */
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
	    } else {
	    	System.out.println("Saldo insuficiente");
	    }
		
	}
	
    /**
     * Exibe informações detalhadas de todas as contas correntes do banco, incluindo dados dos clientes e números das contas criadas.
     * 
     * @return string com os clientes e números das contas
     */
	@Override
	public String toString() {
		return "Contas Correntes{" +
				super.getCliente() + "\n" +
				"Conta=" + super.getNumeroConta() + 
			 '}';
		
	}
	
}
