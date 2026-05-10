package secao24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {
  public static void main(String[] args) {

    List<String> lista = new ArrayList<String>();

    lista.add("Java");
    lista.add("Python");
    lista.add("C++");

    //Verificando se a lista contém um elemento
    System.out.println("Contém 'Java'? " + lista.contains("Java")); //True

    //Adicionando todos os elementos de outra coleção
    List<String> outraLista = Arrays.asList("JavaScript", "Ruby");
    lista.addAll(outraLista);

    //Imprimir --> [Java, Python, C++, JavaScript, Ruby]
    System.out.println("Lista completa: " + lista);

    //Removendo um elemento
    lista.remove("Python");
    System.out.println("Lista após a remoção: " + lista);

    //Obtendo um elemento pelo índice
    String elemento = lista.get(2);
    System.out.println("Elemento no índice 2: " + elemento);

    //Limpando a lista
    lista.clear();
    System.out.println("Lista após limpar: " + lista);

  }
}
