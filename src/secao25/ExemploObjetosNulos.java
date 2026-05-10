package secao25;

import javax.swing.*;

public class ExemploObjetosNulos {

  String test; //Inicialização automática! Neste teste será null;
  int testPrimitiva; //Inicialização automática! Neste teste será 0;

  public static void main(String[] args) {

    String nome = "Igor"; //A variáveis e objetos locais devem ser inicializados

    try {
      int tamanhoNome = nome.length(); //Tentando acessar o objeto nulo
      System.out.println("Tamanho do nome: " + tamanhoNome);
    } catch (NullPointerException e) {
      System.out.println("Erro: A variável 'nome' está nula!");
    } finally {
      System.out.println("Sempre execute o bloco finally");
    }
  }
}
