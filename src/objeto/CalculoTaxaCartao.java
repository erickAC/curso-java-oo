package objeto;

public class CalculoTaxaCartao {

    /**
     * Aqui aplicamos o polimorfismo
     * Podemos utilizar tanto Visa ou Mastercard aqui
     * @param valor
     * @param taxable
     * @return
     */
    public static float calcular(float valor, Taxable taxable) {
        return valor * taxable.getTax();
    }

}
