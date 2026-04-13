package secao18.exercicios;

class SuperClasse {

  public void imprime() {
    System.out.println("Imprime");
  }
}

class MinhaClasse extends SuperClasse {

  @Override
  public void imprime() {
    System.out.println("Imprime");
  }
}

public class SuperClasses {
  public static void main(String[] args) {

    MinhaClasse minhaInstancia = new MinhaClasse();
    minhaInstancia.imprime();
  }
}
