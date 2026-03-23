package secao13;

public class Ternario {
  public static void main(String[] args) {

    int numero = 10;
    String resultado;

    if (numero % 2 == 0) {
      resultado = "Par";
    } else {
      resultado = "Impar";
    }

    System.out.println("O número é: " + resultado);

    int numero2 = 10;
    String resultado2 = (numero2 % 2 == 0) ? "Par" : "Impar";

    System.out.println("O número é: " + resultado2);

  }

}

