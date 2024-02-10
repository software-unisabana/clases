package co.edu.unisabana.clases.example.patron.comportamiento.strategy;

public class Cliente {

  public static void main(String[] args) {
    GoogleMaps maps = new GoogleMaps();
    System.out.println(maps.calcularRuta(new Vehiculo(), 20));
  }
}
