package secao244;

public class ExceptionDivisaoPorZero {
  public static void main(String[] args) {

    int totalNotas = 100;
    int quantidade = 0;

    try {
      int media = totalNotas / quantidade; // Divisão por zero
    } catch (ArithmeticException e) {
      System.out.println("Problema divisão por zero!");
    } finally {
      System.out.println("O programa terminou.");
    }
  }
}
