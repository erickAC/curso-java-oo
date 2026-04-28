package arrays;

public class DesafioArraySolucao {

  public static void main(String[] args) {

    int numero = 2;
    int[] tabuada = new int[10];

    for (int i = 0; i < tabuada.length; i++) {
      tabuada[i] = numero * (i + 1);
    }

    for (int valor : tabuada) {
      System.out.println(valor);
    }

    System.out.println("____________");

    for (int i = 9; i > 0; i--) {
      System.out.println(tabuada[i]);
    }

  }

}
