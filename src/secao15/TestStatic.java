package secao15;

public class TestStatic {

  // Metodo estático sobrecarregado #1
  public static void exibirValor(int a) {
    System.out.println("O valor do inteiro é: " + a);
  }

  // Metodo estático sobrecarregado #2
  public static void exibirValor(String str) {
    System.out.println("A string é: " + str);
  }

  public static void main(String[] args) {
    TestStatic.exibirValor(10);
    exibirValor("Teste");



  }
}
