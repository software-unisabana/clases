package co.edu.unisabana.clases.example.patron.comportamiento.strategy;

public class Caminando implements TipoMovilizacion {

  @Override
  public Ruta calcularRuta(Integer distancia) {
    if (distancia > 10) {
      return new Ruta("Zip zap ", 180, "0");
    }
    return new Ruta("Derecho", 60, "0");

  }
}
