package secao17.exercicios.ex001;

public class TesteHeranca {
  public static void main(String[] args) {
    Assistente ass = new Assistente();

    ass.setNome("João");
    ass.setSalario(3000);
    ass.addAumento(500);

    System.out.println(ass.getNome());
    System.out.println("Salário Anual: " + ass.ganhoAnual());



  }
}
