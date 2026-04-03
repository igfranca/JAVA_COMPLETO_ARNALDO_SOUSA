import secao15.empresa.dados.*;

class FolhaDePagamento {
  public static void main(String[] args) {

    Funcionario funcionario = new Funcionario("Igor", 36);
    Funcionario funcionario2 = new Funcionario("Maria", 40);
    Funcionario funcionario3 = new Funcionario();

    funcionario3.setNome("João");
    funcionario3.setSalario(5000);

    System.out.println(funcionario.obterInfo());
    System.out.println(funcionario2.obterInfo());
    System.out.println(funcionario3.obterInfo());
  }
}
