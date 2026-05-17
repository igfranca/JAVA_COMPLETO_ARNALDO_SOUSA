package secao27;

import java.io.*;

public class ExemploIO {
  public static void main(String[] args) {

    try {
      //Escrevendo em um arquivo
      FileWriter writer = new FileWriter("C:/Users/igorf/Documents/JAVA/JAVA_COMPLETO_ARNALDO_SOUSA/src/secao27/meuArquivo.txt");
      writer.write("Olá, mundo!");
      writer.close();

      //Lendo um arquivo
      FileReader reader = new FileReader("C:\\Users\\igorf\\Documents\\JAVA\\JAVA_COMPLETO_ARNALDO_SOUSA\\src\\secao27\\meuArquivo.txt");
      int data = reader.read();
      while (data != -1) {
        System.out.print((char) data);
        data = reader.read();
      }
      reader.close();

    } catch (IOException e) {
      System.out.println("Problema de IO: " + e.getMessage());
    }
  }
}
