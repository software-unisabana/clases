package co.edu.unisabana.clases.example.animales;

public class Perro implements Animal {

  @Override
  public void reproducirse() {
    System.out.println("Reproduciendose...");
  }

  @Override
  public void volar() {
    throw new RuntimeException("Este metodo no se puede invocar");
  }
}
