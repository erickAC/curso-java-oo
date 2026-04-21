package objeto;

public class Mastercard extends CartaoCredito implements Taxable {

    @Override
    public float getTax() {
        return 0;
    }

}
