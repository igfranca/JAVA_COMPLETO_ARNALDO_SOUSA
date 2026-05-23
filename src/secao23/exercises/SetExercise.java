package secao23.exercises;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
  public static void main(String[] args) {

    Set<Integer> numerosInteiros = new HashSet<Integer>();

    numerosInteiros.add(1);
    numerosInteiros.add(10);
    numerosInteiros.add(200);
    numerosInteiros.add(300);

    System.out.println("Contém o número 200? " + numerosInteiros.contains(200));

    numerosInteiros.remove(200);

    System.out.println("Todos os números atualizado: " + numerosInteiros);
  }
}
