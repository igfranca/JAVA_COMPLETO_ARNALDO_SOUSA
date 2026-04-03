package secao15.exercicios.ex01;

public class AplicacaoPessoa {
  public static void main(String[] args) {

    Pessoa p1 = new Pessoa();

    p1.nome = "Joao";
    p1.setIdade(37);
    p1.setEndereco("Rua Teste");
    p1.telefone = "111-111-111";

    System.out.println(p1.nome);
    System.out.println(p1.getIdade());
    System.out.println(p1.endereco);
    System.out.println(p1.telefone);


  }
}
