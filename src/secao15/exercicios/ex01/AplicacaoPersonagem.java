package secao15.exercicios.ex01;

public class AplicacaoPersonagem {
  public static void main(String[] args) {

    Personagem p1 = new Personagem("Mago", 10);

    System.out.println("Antes de tentarAumentarNivelDePoder: "
    + p1.nivelDePoder);
    p1.tentarAumentarNivelDePoder(p1.nivelDePoder);
    System.out.println("Depois de tentarAumentarNivelDePoder: " + p1.nivelDePoder);

    System.out.println("Antes de mudarNome:" + p1.nome);
    p1.mudarNome("Igor");
    System.out.println("Depois de mudarNome: " + p1.nome);

    System.out.println("Antes de aumnetarNivelDePoder: " + p1.nivelDePoder);
    p1.aumentarNivelDePoder(30);
    System.out.println("Depois de aumentarNivelDePoder: " + p1.nivelDePoder);


  }
}
