package secao15.exercicios;

public class FuncionarioComConstrutor {

  String nome;
  String cargo;
  int idade;

  FuncionarioComConstrutor(String nomeInit, String cargoInit, int idade) {
    nome = nomeInit;
    cargo = cargoInit;
    this.idade = idade;
  }

  public static void main(String[] args) {

    FuncionarioComConstrutor funcionario1 = new FuncionarioComConstrutor("João", "Desenvolvedor", 30);
    FuncionarioComConstrutor funcionario2 = new FuncionarioComConstrutor("Maria", "Gerente", 50);

    System.out.println("Nome: " + funcionario1.nome);
    System.out.println("Cargo: " + funcionario1.cargo);
    System.out.println("Idade: " + funcionario1.idade);
    System.out.println("-------------------------------");
    System.out.println("Nome: " + funcionario2.nome);
    System.out.println("Cargo: " + funcionario2.cargo);
    System.out.println("Idade: " + funcionario2.idade);

  }
}
