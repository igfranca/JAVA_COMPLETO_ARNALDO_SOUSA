package secao26;

@FunctionalInterface
interface Calculadora {

  double calcular(double a, double b);
}

public class CalculadoraComInterfaceFuncional {
  public static void main(String[] args) {
    Calculadora soma = (a, b) -> a + b;
    System.out.println("Soma: " + soma.calcular(10, 5));

    Calculadora subtracao = (a, b) -> a - b;
    System.out.println("Subtração: " + subtracao.calcular(10, 5));

    Calculadora multiplicacao = (a, b) -> a * b;
    System.out.println("Multiplicação: " + multiplicacao.calcular(10, 5));

    Calculadora dividir = (a, b) -> a / b;
    System.out.println("Dividir: " + dividir.calcular(10, 5));

  }
}
