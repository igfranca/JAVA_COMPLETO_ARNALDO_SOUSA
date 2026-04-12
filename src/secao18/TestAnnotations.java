package secao18;

class Animal {
  public void fazerSom() {
    System.out.println("O animal faz um som");
  }
}

class Cachorro extends Animal {
  public void fazerSom() {
    System.out.println("O cahcorro late");
  }
}

public class TestAnnotations {
  public static void main(String[] args) {
    Cachorro dog = new Cachorro ();
    dog.fazerSom();

  }
}
