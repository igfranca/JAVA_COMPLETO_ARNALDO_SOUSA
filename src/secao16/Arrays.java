package secao16;

public class Arrays {
  public static void main(String[] args) {

    int[] meuArray; // Declaracao de Arrays

    meuArray = new int[3]; // Criacao do Array
    meuArray[0] = 5;
    meuArray[1] = 8;
    meuArray[2] = 2;

    meuArray = new int[]{5, 8, 2}; // Cria e preenche o array com valores

    System.out.println(meuArray[0]); // Saida = 5
    System.out.println(meuArray[1]); // Saida = 8
    System.out.println(meuArray[2]); // Saida = 2

    // Alterando elementos do Array
    meuArray[0] = 10;

    System.out.println("Valor alterado:  " + meuArray[0]); // Saida = 10

    // Percorrendo Arrays
    for (int i = 0; i < meuArray.length; i++) {
      System.out.println(meuArray[i]);
    }

    // For-each
    for (int elemento : meuArray) {
      System.out.println(elemento);
    }
  }
}
