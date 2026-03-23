package secao14;

public class ControleDeLoopBreak {
  public static void main(String[] args) {

    //Break
    for (int i = 0; i < 100; i++) {
      if (i == 30) {
        break;
      }
      System.out.println(i);
    }

    //Continue
    for (int i=0; i<10; i++) {
      if (i == 4) {
        continue;
      }
      System.out.println(i);
    }
  }
}
