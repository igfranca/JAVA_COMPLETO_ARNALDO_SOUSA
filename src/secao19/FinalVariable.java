package secao19;

class FinalVariableUm {

  int numeroMaximo = 100;
  String mensagem = "Bem-vindo ao mundo da programação";
}

public class FinalVariable {
  public static void main(String[] args) {

    FinalVariableUm c1 = new FinalVariableUm();

    c1.numeroMaximo = 200;
    c1.mensagem = "TesteAlteração";

    System.out.println(c1.numeroMaximo);
    System.out.println(c1.mensagem);


  }
}
