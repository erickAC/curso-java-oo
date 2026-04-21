package objeto;

/***
 * Aqui temos um cartão da Visa
 * Ele é um Cartão de crédito
 * E contém taxas
 * @see objeto.CartaoCredito
 */
public class Visa extends CartaoCredito implements Taxable {

    @Override
    public float getTax() {
        return 0.5f;
    }

}
