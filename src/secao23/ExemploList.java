package secao23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {
  public static void main(String[] args) {

    List<String> lista = new ArrayList<>();

    lista.add("Java");
    lista.add("Python");
    lista.add("C++");

    // Verificando se alista contém um elemento
    System.out.println("Contém 'Java'? " + lista.contains("Java")); // Return true

    // Adicionando todos os elementos de outra coleção
    List<String> outraLista = Arrays.asList("JavaScript", "Ruby");

    System.out.println("Lista 1: " + lista);
    System.out.println("Lista 2: " + outraLista);

    lista.addAll(outraLista);

    // Imprimir as duas listas
    System.out.println("Lista completa: " + lista);

    // Removendo um elemento
    lista.remove("Python");

    // Imprimir lista após remoção
    System.out.println("Lista após remoção: " + lista);

    // Obtendo um elemento pelo índice
    String elemento = lista.get(2); // Obtém o 3º elemento da lista
    System.out.println("Elemento no 'índice 2: " + elemento);

    lista.remove(3);
    System.out.println(lista);

    try {
        String elemento2 = lista.get(3);
        System.out.println(elemento2);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Não existe elemento disponível no índice da lista \n" + e.getMessage());
    }

    // Limpando a lista
    lista.clear();

    System.out.println("Lista após limpar: " + lista); // Return []

  }
}
