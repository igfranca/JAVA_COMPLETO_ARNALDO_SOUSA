package secao17;

/// Overriding sobre escrita de metodo
class Animal2 {
  public void fazerSom() {
    System.out.println("O animal faz um som");
  }
}

class Cachorro2 extends Animal2 {
  public void fazerSom() {
    System.out.println("O cachorro late");
  }
}

public class TestOverriding {
  public static void main(String[] args) {
    Cachorro2 dog = new Cachorro2();

    dog.fazerSom();

  }
}
