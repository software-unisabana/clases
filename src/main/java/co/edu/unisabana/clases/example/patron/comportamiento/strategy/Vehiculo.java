package co.edu.unisabana.clases.example.patron.comportamiento.strategy;

public class Vehiculo implements TipoMovilizacion {

  @Override
  public Ruta calcularRuta(Integer distancia) {
    if (distancia > 10) {
      return new Ruta("Derecho", 60, "10000");
    }
    return new Ruta("Derecho", 30, "5000");

  }
}
