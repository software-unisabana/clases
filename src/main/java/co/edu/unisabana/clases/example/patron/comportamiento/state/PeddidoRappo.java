package co.edu.unisabana.clases.example.patron.comportamiento.state;

public class PeddidoRappo {

  Estado estado;
  boolean prime;

  public PeddidoRappo(Boolean prime) {
    this.prime = prime;
    this.estado = new EstadoRadicado();
  }

  public void avanzar() {
    this.estado.avanzar(this);
  }

  /*
  public void avanzar() {
    if ("Radicado".equals(estado)) {
      estado = "Preparando";
      //logica que necesite aca....
    } else if ("Preparando".equals(estado)) {
      estado = "Recogiendo";
      //logica que necesite aca....
    } else if ("Recogiendo".equals(estado)) {
      estado = "Entregado";
      //logica que necesite aca....
    } else if ("Entregado".equals(estado)) {
//logica que necesite aca....
    }
  }

  public String consultarEstadoPedido() {
    return estado;
  }

   */

  public String consultarEstadoPedido() {
    return estado.obtenerEstado();
  }
}
