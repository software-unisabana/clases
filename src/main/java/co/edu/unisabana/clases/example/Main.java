package co.edu.unisabana.clases.example;

import co.edu.unisabana.clases.example.patron.comportamiento.coin.Coin;
import co.edu.unisabana.clases.example.patron.comportamiento.coin.Manejador;
import co.edu.unisabana.clases.example.patron.comportamiento.coin.Manejador100;
import co.edu.unisabana.clases.example.patron.comportamiento.coin.Manejador200;
import co.edu.unisabana.clases.example.patron.comportamiento.coin.Manejador500;
import co.edu.unisabana.clases.example.patron.comportamiento.coin.Moneda;
import co.edu.unisabana.clases.example.patron.comportamiento.state.EstadoRecogiendo;
import co.edu.unisabana.clases.example.patron.comportamiento.state.PeddidoRappo;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    PeddidoRappo peddidoRappo = new PeddidoRappo(true);
    peddidoRappo.consultarEstadoPedido();
    peddidoRappo.avanzar();
    Thread.sleep(5000);

    peddidoRappo.consultarEstadoPedido();
    peddidoRappo.avanzar();
    Thread.sleep(5000);

    peddidoRappo.consultarEstadoPedido();
    peddidoRappo.avanzar();
    Thread.sleep(5000);


    peddidoRappo = new PeddidoRappo(false);
    peddidoRappo.consultarEstadoPedido();
    peddidoRappo.avanzar();
    Thread.sleep(5000);

    peddidoRappo.consultarEstadoPedido();
    peddidoRappo.avanzar();
    Thread.sleep(5000);

    peddidoRappo.consultarEstadoPedido();
    peddidoRappo.avanzar();
    Thread.sleep(5000);




    List<Manejador> manejadors = new ArrayList<>();
    manejadors.add(new Manejador500());
    manejadors.add(new Manejador100());
    manejadors.add(new Manejador200());

    List<Moneda> monedasInsertar = new ArrayList<>();
    monedasInsertar.add(new Moneda("500 Pesos"));
    monedasInsertar.add(new Moneda("200 Pesos"));
    monedasInsertar.add(new Moneda("100 Pesos"));

    Coin coinSantaFe= new Coin(manejadors);
    int monto = coinSantaFe.calcularDineroConsignar(monedasInsertar);

    System.out.println(monto);
  }
}
