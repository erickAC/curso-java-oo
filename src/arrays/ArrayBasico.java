package arrays;

public class ArrayBasico {

  public static void main(String[] args) {
    // para definir um array utilizamos a mesma de declaracao de variaveis, pois array tambem é um tipo
    // temos que definir um tamanho fixo para o Array
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 1;
    }

    System.out.println(numbers);

    // Para acessar um elemento do array utilizamos o indice
    // Ou seja o indice 6 do meu array -> 7
    int selectedNumber = numbers[6];
    System.out.println("Numero selecionado: " + selectedNumber);

    for (int i = 0; i < numbers.length; i++) {
      int value = i + 1;
      System.out.println("[" + i + "] = " + value);
    }

    String[] estados = new String[10];
    float[] x = new float[10];
    estados[0] = "SP";
    estados[1] = "RJ";
    // estados[2] = 10;

    String sp = estados[0];
    System.out.println("Estado selecionado " + sp);
    String rj = estados[1];
    System.out.println("Estado selecionado " + rj);
    estados[2] = null;
    System.out.println("Estado selecionado " + estados[2]);
    System.out.println("Estado selecionado " + estados[11]);

    int i = 0;
    while(i < estados.length) {
      if (estados[i] != null) {
        System.out.println("Estados do brasil " + estados[i]);
      }
      i++;
    }

    // SP - 0
    // RJ - 1

  }

}
