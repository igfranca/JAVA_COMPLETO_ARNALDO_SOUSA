package secao23;

class Caixas<T> {
  private T coisaNaCaixa;

  public void guardar(T coisa){
    this.coisaNaCaixa = coisa;
  }

  public T pegar(){
    return this.coisaNaCaixa;
  }
}

public class Caixa{
  public static void main(String[] args) {

    //Criando uma caixa para guardar Strings
    Caixas<String> caixaDeTexto = new Caixas<>();
    String texto = "Olá mundo!";
    caixaDeTexto.guardar(texto);
    String valorResgatadoTexto = caixaDeTexto.pegar();
    System.out.println(valorResgatadoTexto);

    //Caixa para números, int -> Integer, long -> Long, byte -> Byte
    Caixas<Integer> caixaDeNumeros = new Caixas<>();
    Integer numeros = 3;
    caixaDeNumeros.guardar(numeros);
    Integer valorResgatado = caixaDeNumeros.pegar();
    System.out.println(valorResgatado);

    //valueOf
    Caixas<Integer> caixaDeNumeros2 = new Caixas<>();
    Integer numeros2 = Integer.valueOf(6);
    caixaDeNumeros2.guardar(numeros2);
    Integer valorResgatado2 = caixaDeNumeros2.pegar();
    System.out.println(valorResgatado2);
  }
}
