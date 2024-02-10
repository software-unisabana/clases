package co.edu.unisabana.clases.example.creacional;

public class Main {

  public static void main(String[] args) {
    decoraConSebastian(new DecoracionModerna());
    System.out.println("me arrepenti, ahora quiero esto:");
    decoraConSebastian(new DecoracionVictoriana());
  }
  public static void decoraConSebastian(AbstractFactory estilo){
    System.out.println(estilo.crearSilla());
    System.out.println(estilo.crearSofa());
  }
}
