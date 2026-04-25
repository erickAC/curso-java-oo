package basico;

import java.util.Scanner;

public class Exemplo {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    //int valor = 0;
    System.out.println("Qual o valor que deseja: ");
    int valor = scanner.nextInt();

    System.out.println("Valor digitado: " + valor);

    // scanner.close();

    System.out.println("UTILIZANDO WHILE");

    int i = 0;
    while (i <= 10) {
      int resultado = valor * i;
      System.out.println("O valor de " + valor + " x " + i + " = " + resultado);
      i++;
    }

    System.out.println("UTILIZANDO FOR");

    for (int j = 0; j <= 10; j++) {
      int resultado = valor * j;
      System.out.println("O valor de " + valor + " x " + j + " = " + resultado);
    }

    System.out.println("Qual a sua idade?");
    int idade = scanner.nextInt();

    if (idade >= 18) {
      System.out.println("Pode dirigir");
    } else {
      System.out.println("Menor de idade");
    }

    System.out.println("Qual a forma de pagamento: ");
    String formaPagamento = scanner.next();
    formaPagamento = formaPagamento.toUpperCase();

    switch (formaPagamento) {
      case "PIX":
        System.out.println("Pagar utilizando PIX");
        break;
      case "BOLETO":
        System.out.println("Pagar utilizando Boleto");
        break;
      case "CARTAO":
        System.out.println("Pagar utilizando Cartao");
        break;
      default:
        System.out.println("Nao consegui identificar");
    }

  }

}
