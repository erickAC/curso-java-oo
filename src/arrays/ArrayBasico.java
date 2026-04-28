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

  }

}
