package secao19;

class Calculadora1 {

  int a, b;

  final public int somar(int a, int b) {
    int somar = a + b;
    this.a = a;
    this.b = b;
    return somar;
  }
}

public class Calculadora {
  public static void main(String[] args) {
    Calculadora1 c1 = new Calculadora1();

    c1.somar(10, 10);
    System.out.println(c1.somar(10, 10));
  }
}
