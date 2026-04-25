package basico;

public class EstruturaCondicional {

  public static void main(String[] args) {

    int idade = 16;
    if (idade >= 18) {
      System.out.println("Adulto");
    } else {
      System.out.println("Menor de idade");
    }

    boolean possuiCnh = false;
    if (idade >= 18 && possuiCnh) {
      System.out.println("Pode dirigir");
    } else if (idade >= 18) {
      System.out.println("Adulto");
    } else {
      System.out.println("Nao pode dirigir");
    }

    String valor = "E";
    if (valor == "A" || valor == "B") {
      System.out.println("C");
    } else {
      System.out.println("D");
    }

    valor = "A";
    if (valor == "A" || valor == "B") {
      if (valor == "A") {
        System.out.println("Executando trecho com A");
      }
    } else {
      System.out.println("D");
    }

    if (valor == "A" && idade >= 18) {
      System.out.println("O valor é igual A e o usuário é adulto");
    } else if(valor == "A") {
      System.out.println("O valor é igual A e o usuário não é adulto");
    } else {
      System.out.println("O usuario não é adulto");
    }

    valor = "B";
    if (!(valor == "A")) {
      System.out.println("O valor é diferente de A");
    } else {
      System.out.println("O valor é igual A");
    }

    valor = "C";
    switch (valor) {
      case "A":
        System.out.println("Valor é A");
        break;
      case "B":
        System.out.println("Valor é B");
        break;
      default:
        System.out.println("O valor não é A e nem B");
    }

  }

}
