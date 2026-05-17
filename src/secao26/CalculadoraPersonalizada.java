package secao26;

@FunctionalInterface
interface OperacaoMatematica {
  double executar(double a, double b);
}

public class CalculadoraPersonalizada{
  public static void main(String[] args) {

    OperacaoMatematica potencia = (a, b) -> Math.pow(a, b);
    OperacaoMatematica raiz = (a, b) -> Math.sqrt(a + b);

    System.out.println(potencia.executar(10, 5));
    System.out.println(raiz.executar(10, 5));

  }
}
