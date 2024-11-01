package modelo.conta;

import modelo.cliente.Cliente;

/**
 * Classe abstrata que representa uma conta bancária.
 * Inclui funcionalidades básicas de uma conta, como depósito, saque e transferência.
 * Cada conta possui um cliente associado, um saldo e um número de conta gerado automaticamente.
 */
public abstract class Conta {

    private static int contador = 10101;
    private int numeroConta; 
    private Cliente cliente;
    protected double saldo;

    /**
     * Construtor para inicializar uma nova conta com um cliente associado.
     * O saldo inicial é zero, e um número de conta é gerado automaticamente.
     *
     * @param cliente o cliente proprietário da conta
     */
    public Conta(Cliente cliente) {
        super();
        this.cliente = cliente;
        this.saldo = 0;
        this.numeroConta = gerarNumeroConta();
    }

    /**
     * Gera um número de conta único para cada nova instância de conta.
     *
     * @return um número de conta único
     */
    private int gerarNumeroConta() {
        return contador++;
    }

    /**
     * Retorna o número da conta.
     *
     * @return o número da conta
     */
    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     * Define o saldo da conta.
     *
     * @param saldo o novo saldo da conta
     */
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Retorna o saldo atual da conta.
     *
     * @return o saldo da conta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Retorna o cliente associado à conta.
     *
     * @return o cliente proprietário da conta
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Realiza um depósito na conta.
     * O valor deve ser maior que zero para que o depósito seja efetuado.
     *
     * @param valor o valor a ser depositado
     */
    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        } else {
            System.out.println("O valor do depósito deve ser maior que zero");
        }
    }

    /**
     * Realiza um saque da conta, se o saldo for suficiente.
     * O valor do saque deve ser maior que zero e menor ou igual ao saldo disponível.
     *
     * @param valor o valor a ser sacado
     */
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    /**
     * Realiza uma transferência para outra conta.
     * O valor é sacado desta conta e depositado na conta de destino.
     *
     * @param valor        o valor a ser transferido
     * @param contaDestino a conta de destino que receberá o valor transferido
     */
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    /**
     * Método abstrato para impressão do extrato da conta.
     * Foi implementado pelas classes filhas para exibir informações específicas de cada tipo conta.
     */
    public abstract void imprimirExtrato();
}

