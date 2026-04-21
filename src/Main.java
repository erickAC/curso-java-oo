import objeto.*;

import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Isso é objeto que utiliza o cartão de crédito como molde
        CartaoCredito cartaoCredito = new CartaoCredito();
        Visa visa = new Visa();
        visa.passarMaquininha();
        visa.bloquear();

        Mastercard mastercard = new Mastercard();
        mastercard.passarMaquininha();
        visa.bloquear();

        float valorPedido = 1000;
        float valorFinal = CalculoTaxaCartao.calcular(valorPedido, visa);
        System.out.println("O valor total do pedido realizando com o cartão Visa é: " + valorFinal);

        ProcessadorCartaoCredito processadorCartaoCredito = new ProcessadorCartaoCredito(Set.of(visa, mastercard));
        processadorCartaoCredito.processar();
    }
}