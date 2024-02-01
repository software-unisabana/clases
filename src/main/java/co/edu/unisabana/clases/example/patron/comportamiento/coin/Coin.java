package co.edu.unisabana.clases.example.patron.comportamiento.coin;

import java.util.List;

public class Coin {

  List<Manejador> manejadores;

  public Coin(List<Manejador> manejadores) {
    this.manejadores = manejadores;
  }

  public int calcularDineroConsignar(List<Moneda> monedas) {
    int dineroTotal = 0;
    for (Moneda moneda : monedas) {
      for (Manejador manejador : manejadores) {
        if (manejador.validar(moneda)) {
          dineroTotal += manejador.obtenerValor();
        }
      }
    }
    return dineroTotal;
  }
}
