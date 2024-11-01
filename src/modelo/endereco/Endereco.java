package modelo.endereco;

/**
 * Representa o endereço de um cliente ou de uma agência.
 * Inclui informações sobre o estado, cidade, bairro, rua e número do local.
 */
public class Endereco {
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;

    /**
     * Construtor para criar um novo endereço com os dados fornecidos.
     *
     * @param estado o estado do endereço
     * @param cidade a cidade do endereço
     * @param bairro o bairro do endereço
     * @param rua    a rua do endereço
     * @param numero o número do endereço
     */
    public Endereco(String estado, String cidade, String bairro, String rua, int numero) {
        super();
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    /**
     * Retorna o estado do endereço.
     *
     * @return o estado do endereço
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Retorna a cidade do endereço.
     *
     * @return a cidade do endereço
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Retorna o bairro do endereço.
     *
     * @return o bairro do endereço
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Retorna a rua do endereço.
     *
     * @return a rua do endereço
     */
    public String getRua() {
        return rua;
    }

    /**
     * Retorna o número do endereço.
     *
     * @return o número do endereço
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Retorna apresentação amigável dos dados do endereço, incluindo rua, cidade e estado.
     *
     * @return uma string com a rua, cidade e estado do endereço
     */
    @Override
    public String toString() {
        return "Endereco{" +
               "rua='" + rua + '\'' +
               ", cidade='" + cidade + '\'' +
               ", estado='" + estado + '\'' +
               '}';
    }
}
