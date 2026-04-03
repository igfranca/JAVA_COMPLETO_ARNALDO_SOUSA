package secao15;

public class FuncionarioConstrutorDefault {

  String nome;
  String cargo;
  int idade;

  FuncionarioConstrutorDefault() {

  };

  FuncionarioConstrutorDefault(String nomeInit, String cargoInit, int idade) {
    nome = nomeInit;
    cargo = cargoInit;
    this.idade = idade;
  }

  public static void main(String[] args) {

    //Com construtor default
    FuncionarioConstrutorDefault funcionario1 = new FuncionarioConstrutorDefault();
    funcionario1.nome = "João";
    System.out.println(funcionario1.nome);

    //Com construtor da classe
    FuncionarioConstrutorDefault funcionario2 = new FuncionarioConstrutorDefault("João", "Desenvolvedor", 30);
    System.out.println(funcionario2.nome);
  }
}