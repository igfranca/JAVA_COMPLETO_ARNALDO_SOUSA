package secao19;

import javax.crypto.ExemptionMechanismException;

class ExemploFinal {

    // Definicao de Constante - uso de final
  final int CODIGO_FIXO = 10;

    // Metodo final
  final void meuMetodo() {
    System.out.println("Este é o método final.");
  }
}

public class TestTinalKeyword {
  public static void main(String[] args) {
    ExemploFinal testFinal = new ExemploFinal();
    System.out.println("Valor da constante: " + testFinal.CODIGO_FIXO );
    testFinal.meuMetodo();
  }
}

