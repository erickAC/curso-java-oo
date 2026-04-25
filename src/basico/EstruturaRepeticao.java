package basico;

public class EstruturaRepeticao {

  public static void main(String[] args) {

    int i = 0;
    System.out.println("Usando WHILE");
    while(i <= 10) {
      System.out.println(i);
      i++;
    }

    System.out.println("-----------");
    i = 10;
    while (i >= 0) {
      System.out.println(i);
      i--;
    }

    System.out.println("-----------");
    System.out.println("Usando FOR");
    for (int j = 0; j <= 10; j++) {
      System.out.println(j);
    }

    System.out.println("-----------");
    System.out.println("USANDO FOREACH");
    int[] array = new int[10];
    for (int k = 0; k < array.length; k++) {
      array[k] = k;
    }

    /*
      ARRAY 10 INDICES
      int valor  = 0 = 0 - ponteiro
      1 = 1
      ...
     */
    for (int valor : array) {
      System.out.println(valor);
    }

    for (int valor : array) {
      if (valor == 5) {
        System.out.println("Valor igual a 5");
        // break funciona para parar a execucao do loop
        break;
      }
      System.out.println(valor);
    }


  }

}
