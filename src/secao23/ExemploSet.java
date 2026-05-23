package secao23;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
  public static void main(String[] args) {

    Set<String> conjunto = new HashSet<>();

    // Adicionando elementos
    conjunto.add("Java");
    conjunto.add("Python");
    conjunto.add("C++");

    // Verificando se o conjunto contém um elemento
    System.out.println("Contém 'Java'? " + conjunto.contains("Java")); // Return true or false

    // Adicionando mais elementos
    conjunto.add("JavaScript");
    conjunto.add("Ruby");

    // Imprimi conjunto completo
    System.out.println("Conjunto completo: " + conjunto);

    // Removendo um elemento
    conjunto.remove("Python");

    // Imprimi após remoção
    System.out.println("Conjunto após remoção: " + conjunto);

    // Tentando adicionar um elemento duplicado
    boolean foiAdicionado = conjunto.add("Java");
    System.out.println("Java foi adicionado novamente? " + foiAdicionado); // Return false

    // Limpando o conjunto
    conjunto.clear();
    System.out.println("Conjunto após limpar: " + conjunto); // Return []

  }
}
