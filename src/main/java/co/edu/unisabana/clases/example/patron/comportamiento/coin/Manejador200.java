package co.edu.unisabana.clases.example.patron.comportamiento.coin;

public class Manejador200 implements Manejador {

  @Override
  public boolean validar(Moneda moneda) {
    return "200 Pesos".equals(moneda.getTexto());
  }

  @Override
  public int obtenerValor() {
    return 200;
  }
}
