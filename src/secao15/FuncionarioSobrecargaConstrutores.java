package secao15;

public class FuncionarioSobrecargaConstrutores {

  String nome;
  String cargo;
  int idade;

  FuncionarioSobrecargaConstrutores(String nome, String cargo, int idade) {
    this.nome = nome;
    this.cargo = cargo;
    this.idade = idade;
  }

  FuncionarioSobrecargaConstrutores(String nome) {
    this.nome = nome;
  };

  FuncionarioSobrecargaConstrutores() {
  }

  public static void main(String[] args) {


    FuncionarioSobrecargaConstrutores funcionario = new  FuncionarioSobrecargaConstrutores("Maria");
    FuncionarioSobrecargaConstrutores funcionario2 = new FuncionarioSobrecargaConstrutores();
    FuncionarioSobrecargaConstrutores funcionario3 = new FuncionarioSobrecargaConstrutores("João", "Segundo", 34);
    System.out.println(funcionario.nome);

  }

}
