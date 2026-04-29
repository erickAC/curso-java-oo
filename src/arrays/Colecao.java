package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
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

    // LinkedHashSet - Set que contem ordenacao de items
    Set<String> namesLinkedSet = new LinkedHashSet<>();
    namesLinkedSet.add("Erick");
    namesLinkedSet.add("Erick");
    namesLinkedSet.add("Maria");
    namesLinkedSet.add("Fernando");
    System.out.println(namesLinkedSet);

    // LinkedHashMap - Map que contem ordenacao de items
    Map<String, Integer> namesLinkedMap = new LinkedHashMap<>();
    namesLinkedMap.put("Erick", 23);
    namesLinkedMap.put("Maria", 20);
    namesLinkedMap.put("Fernando", 23);
    namesLinkedMap.put("Fernando", 25);
    System.out.println(namesLinkedMap);

    // Criacao de uma lista personalizada
    MeuListDeNomes nomes = new MeuListDeNomes();
    nomes.add("Erick");
    nomes.buscarNome("Maria").ifPresentOrElse(System.out::println, () -> System.out.println("Não encontrado"));
    nomes.buscarNome("Erick").ifPresent(System.out::println);
  }

}
