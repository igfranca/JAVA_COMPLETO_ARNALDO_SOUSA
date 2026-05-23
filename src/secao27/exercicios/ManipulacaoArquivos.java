package secao27.exercicios;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulacaoArquivos {
  public static void main(String[] args) {

    String nomeArquivo = "meuarquivo.txt";
    String conteudo = "Olá, mundo! Este é um exemplo de escrita em arquivo.";

    //Escrevendo no arquivo
    escreverNoArquivo(nomeArquivo, conteudo);

    //Lendo do arquivo
    String conteudoLido = lerDoArquivo(nomeArquivo);
    System.out.println("Conteúdo lido do arquivo: " + conteudoLido);
  }

  private static String lerDoArquivo(String nomeArquivo) {
    return nomeArquivo;
  }

  public static void escreverNoArquivo(String nomeArquivo, String conteudo) {
    try {
      FileWriter writer = new FileWriter(nomeArquivo);
      writer.write(conteudo);
      writer.close();
      System.out.println("Arquivo criado e texto escrito com sucesso!");
    } catch (IIOException e) {
      System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }
}
