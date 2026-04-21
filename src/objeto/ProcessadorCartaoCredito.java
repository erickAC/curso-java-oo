package objeto;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ProcessadorCartaoCredito {

    private Set<CartaoCredito> cartoes = Collections.emptySet();

    public ProcessadorCartaoCredito(Set<CartaoCredito> cartoes) {
        this.cartoes = cartoes;
    }

    public void processar() {
        int totalCartoes = cartoes.size();
        System.out.println("Foram processados um total de " +  totalCartoes + " cartao(es)");
    }

}
