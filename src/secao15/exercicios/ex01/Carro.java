package secao15.exercicios.ex01;

class Carro {
  String marcaDoCarro;
  String modeloDoCarro;
  Integer anoDoCarro;

  //Construtor
  Carro(){};

  Carro(String marcaDoCarro, String modeloDoCarro){
    this.marcaDoCarro = marcaDoCarro;
    this.modeloDoCarro = modeloDoCarro;
  }

  Carro(String marcaDoCarro, String modeloDoCarro, Integer anoDoCarro){
    this.marcaDoCarro = marcaDoCarro;
    this.modeloDoCarro = modeloDoCarro;
    this.anoDoCarro = anoDoCarro;
  }

  //Metodo
  public void exibirDetalhes(){
    System.out.println("Marca do carro: " + this.marcaDoCarro);
    System.out.println("Modelo do carro: " + this.modeloDoCarro);
    System.out.println("Ano do carro: " + this.anoDoCarro);
    System.out.println();
  }

  public static void exibirDetalhes2(String marcaDoCarro, String modeloDoCarro, Integer anoDoCarro){
    System.out.println("Marca do carro: " + marcaDoCarro);
    System.out.println("Modelo do carro: " + modeloDoCarro);
    System.out.println("Ano do carro: " + anoDoCarro);
    System.out.println();
  }
}

class Aplicacao {
  public static void main(String[] args) {

    //Instancia
    Carro carro1 = new Carro();
    Carro carro2 = new Carro("Ford", "Fiesta");
    Carro carro3 = new Carro("Chevrolet", "Onix", 2020);

    carro1.exibirDetalhes();
    carro2.exibirDetalhes();
    carro3.exibirDetalhes();

    Carro.exibirDetalhes2("Audi", "A4", 2019);

  }
}

