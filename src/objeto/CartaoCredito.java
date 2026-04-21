package objeto;

/***
 *
 * Isso é uma classe que tem os moldes para o objeto
 *
 */
public class CartaoCredito {

    private String codigo;
    private int cvv;
    private int mesValidade;
    private int anoValidade;
    private boolean ativo;

    public void passarMaquininha() {
        System.out.println("Passando cartão na maquininha");
    }

    public void bloquear() {
        ativo = false;
        System.out.println("Bloqueando o cartão de crédito");
    }

}