package secao20;

interface Animal {

  void fazerSom(); // metodo abstrato
}

// Classe Cachorro que implementa a interface Animal
class Cachorro implements Animal {

  public void fazerSom() {
    System.out.println("O cachorro faz: Au Au!");
  }
}

//Classe Gato que implementa a interface Animal
class Gato implements Animal {
VAMOS DEITARA
  public void fazerSom() {
    System.out.println("O gato faz: Miau Miau!");
  }
}

public class TestInterface {
  public static void main(String[] args) {
    Cachorro cachorro = new Cachorro();
    cachorro.fazerSom();

    Gato gato = new Gato();
    gato.fazerSom();
  }
}
