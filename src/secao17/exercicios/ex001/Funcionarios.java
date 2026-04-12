package secao17.exercicios.ex001;

public class Funcionarios {

  private String nome;
  private double salario;
  private double valor;

  public void addAumento(double valor) {
    salario += valor;
  }

  public double ganhoAnual() {
    return salario * 12;

  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
