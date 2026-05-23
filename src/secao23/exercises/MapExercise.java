package secao23.exercises;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {
  public static void main(String[] args) {

    Map<String, Integer> estoque = new HashMap<>();

    estoque.put("Lava-louça", 1);
    estoque.put("Esponja", 200);
    estoque.put("Detergente", 3);
    estoque.put("Sabão em pó", 4);

    System.out.println(estoque);
    String produto = "Esponja";
    String quantidadeProduto = String.valueOf(estoque.get(produto));
    System.out.println("Quantidade de produto " + produto + ": " + quantidadeProduto);

  }
}
