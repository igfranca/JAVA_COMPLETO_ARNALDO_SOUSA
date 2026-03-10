package secao11.var;

public class UsodeDeVar {
  public static void main(String[] args) {

    // Só pode ser utilizado para variáveis locais e com inicializado, a partir do Java 10
    var numero = 10;
    int numero2 = numero;
    var numero3 = 'A';

    System.out.println(numero);
    System.out.println(numero2);
    System.out.println(numero3);

  }
}
