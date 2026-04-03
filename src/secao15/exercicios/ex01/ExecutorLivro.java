package secao15.exercicios.ex01;

public class ExecutorLivro {
  public static void main(String[] args) {

    Livro livro1 = new Livro();
    System.out.println("Título: " + livro1.titulo);
    System.out.println("Ano de Publicação: " + livro1.anoPublicacao);
    System.out.println("Preço: " + livro1.preco);
    System.out.println();

    Livro livro2 = new Livro("1984", "George Orwell");
    System.out.println("Título: " + livro2.titulo);
    System.out.println("Ano de Publicação: " + livro2.anoPublicacao);
    System.out.println("Preço: " + livro2.preco);
    System.out.println();

    Livro livro3 = new Livro("O Senhor dos Anéis","J.R.R. Tolkien", 1954, 40.90);
    System.out.println("Título: " + livro3.titulo);
    System.out.println("Ano de Publicação: " + livro3.anoPublicacao);
    System.out.println("Preço: " + livro3.preco);
  }
}
