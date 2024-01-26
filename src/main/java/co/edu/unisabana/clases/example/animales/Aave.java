package co.edu.unisabana.clases.example.animales;

public class Aave implements Animal {

  @Override
  public void reproducirse() {
    System.out.println("Reproduciendose...");
  }

  @Override
  public void volar() {
    System.out.println("volando...");
  }
}
