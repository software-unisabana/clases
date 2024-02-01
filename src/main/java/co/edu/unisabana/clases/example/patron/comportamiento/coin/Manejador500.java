package co.edu.unisabana.clases.example.patron.comportamiento.coin;

public class Manejador500 implements Manejador {

  @Override
  public boolean validar(Moneda moneda) {
    return "500 Pesos".equals(moneda.getTexto()) || "500 Pesos Colombianos".equals(
        moneda.getTexto());
  }

  @Override
  public int obtenerValor() {
    return 500;
  }
}
