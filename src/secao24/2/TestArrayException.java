package secao244;

public class TestArrayException {
  public static void main(String[] args) {

    try {
      int[] numeros = {1, 2, 3};
      System.out.println(numeros[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Erro: " + e.getMessage());
    } finally {
      System.out.println("Programa finalizado com ou sem problemas");
    }
  }
}

