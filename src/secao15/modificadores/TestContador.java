package secao15.modificadores;

class Contador {

  static String nome;
  static int contagem = 0;

  public Contador(String nome) {
    Contador.nome = nome;
    contagem++;
  }
}

public class TestContador {
  public static void main(String[] args) {

    Contador c1 = new Contador("Igor");
    Contador c2 = new Contador("Teste");
    Contador c3 = new Contador("Teste2");
    Contador c4 = new Contador("Teste3");
    Contador c5 = new Contador("Teste4");

    System.out.println(Contador.contagem);
    System.out.println(Contador.nome);


  }
}