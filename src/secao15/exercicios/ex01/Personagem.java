package secao15.exercicios.ex01;

public class Personagem {
  String nome;
  int nivelDePoder;

  Personagem(String nome, int nivelDePoder){
    this.nome = nome;
    this.nivelDePoder = nivelDePoder;
  }

  public void tentarAumentarNivelDePoder(int nivelDePoder) {
    nivelDePoder += 10;
  }

  public void mudarNome(String nome) {
    this.nome = nome;
  }

  public void aumentarNivelDePoder(int nivelDePoder) {
    this.nivelDePoder += nivelDePoder;
  }
}
