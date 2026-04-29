package arrays;

import java.util.ArrayList;
import java.util.Optional;

public class MeuListDeNomes extends ArrayList<String> {

  public Optional<String> buscarNome(String nome) {
    return super.stream().filter(n -> n.equals(nome)).findFirst();
  }


}
