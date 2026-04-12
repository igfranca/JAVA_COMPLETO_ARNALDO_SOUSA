package secao17;

/// Superclass
class Animal4 {
  String nome;

  Animal4(String nome) {
    this.nome = nome;
  }
}

/// Subclass
class Cachorro4 extends Animal4 {
  String raca;

  Cachorro4(String nome, String raca) {
    super(nome); // Chama o construtor da superclass Animal4
    this.raca = raca;
  }
}

public class TestSuperDois {
  public static void main(String[] args) {
    Cachorro4 dog = new Cachorro4("Max", "Pastor Australiano");
    System.out.println("O nome do animal: " + dog.nome);
    System.out.println("A raça do cachorro: " + dog.raca);
  }
}
