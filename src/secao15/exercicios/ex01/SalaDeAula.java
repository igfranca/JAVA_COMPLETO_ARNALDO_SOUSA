package secao15.exercicios.ex01;

public class SalaDeAula {

  static int totalAlunos = 0;

  public static void adicionarAluno() {
    totalAlunos++;
  }

  public static void exibirTotalAlunos() {
    System.out.println("Total de alunos na sala: " + totalAlunos);
  }
}


