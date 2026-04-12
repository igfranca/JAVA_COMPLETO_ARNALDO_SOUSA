package secao17;

/// Superclasse
class Animal3 {
  public String nome;
  public void fazerSom() {
    System.out.println("O animal faz um som");
  }
}

class Cachorro3 extends Animal3 {
  public void fazerSom() {
    super.fazerSom();
    System.out.println("O cachorro late");
  }
}

public class TestSuperClass {
  public static void main(String[] args) {
    Cachorro3 dog = new Cachorro3();

    dog.nome = "Rex";
    System.out.println("O nome do animal: " + dog.nome);
    dog.fazerSom();

  }
}