package secao17.exercicios.ex002;

public class Estudante extends Pessoa {

  private int matricula;

  public Estudante(String nome, int idade, int matricula) {
    super(nome, idade);
    this.matricula = matricula;
  }

  public int getMatricula() {
    return matricula;
  }
}
