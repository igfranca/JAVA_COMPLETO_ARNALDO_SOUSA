package secao23.exercises;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
  public static void main(String[] args) {

    List<String> listaDeFilmes = new ArrayList<>();

    listaDeFilmes.add("Lord of the Rings");
    listaDeFilmes.add("Star Wars");
    listaDeFilmes.add("Teste Filme 300");
    listaDeFilmes.add("Teste Filme 20220");

    System.out.println("Lista dos filmes" + listaDeFilmes);
    String trueOrFalse = String.valueOf(listaDeFilmes.contains("Star Wars"));

    if (trueOrFalse.equals("true")) {
      System.out.println("O filme está disponível sim!");
    } else System.out.println("O filme não está disponível!");
  }
}
