package secao23;

class CaixaGenerica<T> {
  private T coisaNacaixa;

  public void guardar(T coisa){
    this.coisaNacaixa = coisa;
  }
  public T pegar() {
    return this.coisaNacaixa;
  }
}

public class CaixaGenericaMain {
  public static void main(String[] args) {

    //Criando uma caixa para guardar carrinhos
    CaixaGenerica<TesteCarrinho> caixaDeCarrinhos = new CaixaGenerica<>();
    caixaDeCarrinhos.guardar(new TesteCarrinho("Hot Wheels"));

    //Criando uma caixa para guardar bonecas
    CaixaGenerica<TesteBoneca> caixaDeBonecas = new CaixaGenerica<>();
    caixaDeBonecas.guardar(new TesteBoneca("Barbie"));

    TesteCarrinho carrinho = caixaDeCarrinhos.pegar();
    TesteBoneca boneca = caixaDeBonecas.pegar();

    System.out.println(carrinho.getModelo());
    System.out.println(boneca.getNome());
  }
}
