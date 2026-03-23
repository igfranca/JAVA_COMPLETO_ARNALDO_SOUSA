package secao13;

public class Switch {
  public static void main(String[] args) {

    // Switch-case Expression

    int day = 3;

    switch (day) {

      case 1 -> System.out.println("Segunda");
      case 2 -> System.out.println("Terca");
      case 3 -> System.out.println("Quarta");

      default -> System.out.println("Desconhecido");
    }
  }
}
