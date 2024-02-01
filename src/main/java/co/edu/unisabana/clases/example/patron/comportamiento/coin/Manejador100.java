package co.edu.unisabana.clases.example.patron.comportamiento.coin;

public class Manejador100 implements Manejador {

  @Override
  public boolean validar(Moneda moneda) {
    return "100 Pesos".equals(moneda.getTexto());
  }

  @Override
  public int obtenerValor() {
    return 100;
  }
}
