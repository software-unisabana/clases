package co.edu.unisabana.clases.example.patron.comportamiento.coin;

public interface Manejador {

  boolean validar(Moneda moneda);

  int obtenerValor();
}
