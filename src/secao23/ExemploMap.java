package secao23;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
  public static void main(String[] args) {

    Map<String, Integer> mapa = new HashMap<>();

    // Adicionando elementos com Map - mapa.put("Chave", Valor), todos os valores podem ser iguais, mas as chaves não podem ser iguais
    mapa.put("Java", 20);
    mapa.put("Python", 10);
    mapa.put("C++", 15);

    // Verificando se o mapa contém uma chave
    System.out.println("Contém 'Java'? " + mapa.containsKey("Java")); // Return true

    // Obtendo o valor associado a uma chave
    System.out.println("Valor associado a 'Java': " + mapa.get("Java")); // Return 20

    mapa.put("JavaScript", 25); // Adicionando mais elementos
    mapa.put("Ruby", 5);

    // Imprimir o mapa sem ordem
    System.out.println("Mapa completo: " + mapa);

    mapa.remove("Python");

    // Imprimir após a remoção sem ordem
    System.out.println("Mapa após remoção de elemento: " + mapa);

    // Atualizando o valor associado a uma chave
    mapa.put("Java", 30 );

    // Imprimir o Map com o valor associado a uma chave foi atualizado
    System.out.println("Impressão atualizada o valor : " + mapa);

    mapa.clear(); // Limpando o mapa
    System.out.println("Mapa após limpar: " + mapa); // {}
  }
}
