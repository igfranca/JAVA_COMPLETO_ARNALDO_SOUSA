package secao16.exercicios;

public class Ex001 {
  public static void main(String[] args) {

    double[] ArrayD = new double[5];

    ArrayD[0] = 3.3;
    ArrayD[1] = 6.8;
    ArrayD[2] = 7.5;
    ArrayD[3] = 9.3;
    ArrayD[4] = 10.0;

    for (int i=0; i<ArrayD.length; i++) {
      System.out.printf(" " + ArrayD[i]);
    }
  }
}
