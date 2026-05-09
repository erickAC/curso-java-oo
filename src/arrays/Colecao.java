package arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
    System.out.println("LIST:");
    System.out.println(names);

    // Set não garante ordenação, mas bloqueia elementos repetidos
    Set<String> namesSet = new HashSet<>();
    namesSet.add("Erick");
    namesSet.add("Erick");
    namesSet.add("Maria");
    namesSet.add("Fernando");
    System.out.println("SET: ");
    System.out.println(namesSet);

    // Queue - Ordem de prioridade estilo fila, FIFO
    Queue<String> namesQueue = new PriorityQueue<>();
    namesQueue.add("Erick");
    namesQueue.add("Maria");
    namesQueue.add("Fernando");
    System.out.println("QUEUE: antes do poll");
    System.out.println(namesQueue);
    // remove topo da lista
    namesQueue.poll();
    System.out.println("QUEUE: depois do poll");
    System.out.println(namesQueue);

    // Map - Chave e valor, valores repetidos, mas chaves não
    Map<String, Integer> namesMap = new HashMap<>();
    namesMap.put("Erick", 23);
    namesMap.put("Thiago", 23);
    namesMap.put("Maria", 20);
    namesMap.put("Fernando", 23);
    namesMap.put("Fernando", 25);
    System.out.println("MAP: ");
    System.out.println(namesMap);

    // LinkedHashSet - Set que contem ordenacao de items
    Set<String> namesLinkedSet = new LinkedHashSet<>();
    namesLinkedSet.add("Erick");
    namesLinkedSet.add("Erick");
    namesLinkedSet.add("Maria");
    namesLinkedSet.add("Fernando");
    System.out.println("LINKEDHASHSET: ");
    System.out.println(namesLinkedSet);

    // LinkedHashMap - Map que contem ordenacao de items
    Map<String, Integer> namesLinkedMap = new LinkedHashMap<>();
    namesLinkedMap.put("Erick", 23);
    namesLinkedMap.put("Maria", 20);
    namesLinkedMap.put("Fernando", 23);
    namesLinkedMap.put("Fernando", 25);
    System.out.println("LINKEDHASHMAP: ");
    System.out.println(namesLinkedMap);

    // Criacao de uma lista personalizada
    MeuListDeNomes nomes = new MeuListDeNomes();
    nomes.add("Erick");
    nomes.buscarNome("Maria")
        .ifPresentOrElse(System.out::println,
            () -> System.out.println("Não encontrado"));
    nomes.buscarNome("Erick").ifPresent(nome -> System.out.println("Nome " + nome));

    List<String> alfabeto = new LinkedList<>();
    alfabeto.add("A");
    alfabeto.add("D");
    alfabeto.add("B");
    alfabeto.add("C");
    alfabeto.sort(String::compareTo);
    System.out.println(alfabeto);

    List<Integer> numeros = new ArrayList<>();
    numeros.add(1);
    numeros.add(99);
    numeros.add(45);
    numeros.add(13);
    numeros.add(22);
    System.out.println("LISTA S/ ORDENACAO");
    System.out.println(numeros);
    numeros.sort(Integer::compareTo);
    System.out.println("LISTA COM ORDENACAO");
    System.out.println(numeros);

    boolean listaEstaVazia = numeros.isEmpty();
    int tamanhoDaLista = numeros.size();
    Integer primeiroElemento = numeros.get(0);
    numeros.add(1000);
    //numeros.remove(1);
    //numeros.clear();
    //Integer[] numerosArray = numeros.toArray(new Integer[0]);
    //System.out.println(numerosArray);

    // for (Integer valor : numeros) {};
    numeros.forEach((numero) -> System.out.println(numero));
    int indexValor = numeros.indexOf(Integer.valueOf(13));
    System.out.println("Index do valor 13: " + indexValor);

    namesMap.put("Lucas", 18);
    Integer lucas = namesMap.get("Lucas");
    namesMap.remove("Erick");
    Collection<Integer> idades = namesMap.values();
    Set<String> nomesMap = namesMap.keySet();
    System.out.println("IDADES " + idades);
    System.out.println("NOMES " + nomesMap);
    namesMap
        .forEach((chave, valor) -> System.out.println("Chave: " + chave + " Valor: " + valor));
    namesMap.keySet().forEach(key -> System.out.println("Chave: " + key));
    namesMap.entrySet().forEach(entry -> System.out.println("Chave: " + entry.getKey() + " Valor: " + entry.getValue()));

    List<Integer> integers = Collections.unmodifiableList(numeros);
    integers.add(100);
    System.out.println(integers);

  }

}
