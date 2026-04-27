package secao23;

class TesteCarrinho {

  private String modelo;
  public TesteCarrinho(String modelo){
    this.modelo = modelo;
  }
  public String getModelo() {
    return modelo;
  }
}

class TesteBoneca {
  private String nome;
    public TesteBoneca(String nome){
    this.nome = nome;
  }
  public String getNome() {
    return nome;
  }
}

public class Brinquedos {
  public static void main(String[] args) {

    TesteCarrinho c = new TesteCarrinho("Hot Wheels");
    TesteBoneca b = new TesteBoneca("Barbie");

    System.out.println("Carrinho: " + c.getModelo());
    System.out.println("Boneca: " + b.getNome());
  }
}
