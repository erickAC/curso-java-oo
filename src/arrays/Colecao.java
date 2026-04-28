package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Colecao {

  public static void main(String[] args) {

    // List - Garante ordenação e permite elementos repetidos
    List<String> names = new LinkedList<>();
    names.add("Erick");
    names.add("Erick");
    names.add("Maria");
    names.add("Fernando");
    System.out.println(names);

    // Set não garante ordenação, mas bloqueia elementos repetidos
    Set<String> namesSet = new HashSet<>();
    namesSet.add("Erick");
    namesSet.add("Erick");
    namesSet.add("Maria");
    namesSet.add("Fernando");
    System.out.println(namesSet);

    // Queue - Ordem de prioridade estilo fila, FIFO
    Queue<String> namesQueue = new PriorityQueue<>();
    namesQueue.add("Erick");
    namesQueue.add("Maria");
    namesQueue.add("Fernando");
    // remove topo da lista
    namesQueue.poll();
    System.out.println(namesQueue);

    // Map - Chave e valor, valores repetidos, mas chaves não
    Map<String, Integer> namesMap = new HashMap<>();
    namesMap.put("Erick", 23);
    namesMap.put("Maria", 20);
    namesMap.put("Fernando", 23);
    namesMap.put("Fernando", 25);
    System.out.println(namesMap);

  }

}
