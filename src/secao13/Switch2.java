package secao13;

public class Switch2 {
  public static void main(String[] args) {

    //Switch-case Initialization

    String dia = "Domingo";

    String tipoDedia = switch (dia) {
      case "Seg.", "Ter.", "Qua.", "Qui.", "Sex." -> "Dia util";
      case "Sabado", "Domingo" -> "Fim de semana";
      default -> "Desconhecido";
    };

    System.out.println(tipoDedia);
  }
}
