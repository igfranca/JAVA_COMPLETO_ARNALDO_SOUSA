package secao28;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExemploSerializacao {

  // Método para serializar os contatos
  private static void serializarContatos(List<Contato> listaContatos) throws IOException {
    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("agenda.ser"))) {
      outputStream.writeObject(listaContatos);
      System.out.println("Contato serializados e salvos com sucesso!");
    }
  }

  // Método para deserializar e exibir os contatos
  private static void deserializarContatos() throws IOException, ClassNotFoundException {
    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("agenda.ser"))) {
      Object obj = inputStream.readObject();
      if (obj instanceof List<?>) {
        List<?> contatosLidos = (List<?>) obj;
        for (Object contato : contatosLidos) {
          if (contato instanceof Contato) {
            Contato contatoTyped = (Contato) contato;
            System.out.println("Nome: " + contatoTyped.nome + ", Telefone: " + contatoTyped.telefone);
          }
        }
      }
    }
  }

  /*// Método para deserializar e exibir os contatos
  @SuppressWarnings("unchecked")
  private static void deserializarContatos () throws IOException, ClassNotFoundException {
    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(("agenda.ser"))) {
      List<Contato> contatosLidos = (List<Contato>) inputStream.readObject();
      for (Contato contato : contatosLidos) {
        System.out.println("Nome: " + contato.nome + ", Telefone: " + contato.telefone);
      }
    }
  }
  */

  public static void main(String[] args) {
    Contato contato1 = new Contato("Igor", "111111111111");
    Contato contato2 = new Contato("Maria", "22222222222");
    Contato contato3 = new Contato("Ana", "333333333333");

    List<Contato> listaContatos = new ArrayList<>();
    listaContatos.add(contato1);
    listaContatos.add(contato2);
    listaContatos.add(contato3);

    try {
      serializarContatos(listaContatos);
      deserializarContatos();
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Erro a manipular contatos! " + e.getMessage());
    }
  }
}
