package objeto;

/***
 *
 * Isso é uma classe que tem os moldes para o objeto
 *
 */
public class CartaoCredito {

    // Isso é um atributo
    private String codigo;
    private int cvv;
    private int mesValidade;
    private int anoValidade;
    private boolean ativo;

    public CartaoCredito() {}

    public CartaoCredito(String codigo, int cvv, int mesValidade, int anoValidade, boolean ativo) {
        this.codigo = codigo;
        this.cvv = cvv;
        this.mesValidade = mesValidade;
        this.anoValidade = anoValidade;
        this.ativo = ativo;
    }

    /***
     * Isso é um comportamento
     */
    public void passarMaquininha() {
        System.out.println("Passando cartão na maquininha");
    }

    public void bloquear() {
        ativo = false;
        System.out.println("Bloqueando o cartão de crédito");
    }

    public void ativar() {
        ativo = true;
        System.out.println("Ativando o cartão de crédito");
    }

}