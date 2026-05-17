package secao27;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploNIO {
  public static void main(String[] args) throws IOException {

    Path path = Paths.get("C:/Users/igorf/Documents/JAVA/JAVA_COMPLETO_ARNALDO_SOUSA/src/secao27/meuArquivo2.txt");

    try {
      //Escrevendo em um arquivo
      Files.write(path, "Olá, mundo dois!".getBytes());

      //Lendo de um arquivo
      byte[] bytes = Files.readAllBytes(path);
      String content = new String(bytes);
      System.out.println(content);

    } catch (IOException e) {
      System.out.println("Problemas de NIO: " + e.getMessage());
    }
  }
}
