package co.edu.unisabana.clases.example.patron.comportamiento.state;

public class EstadoPreparando implements Estado {

  @Override
  public void avanzar(PeddidoRappo peddidoRappo) {
    System.out.println("SU pedido va a pasar  a Recogiendo");
    //crea factura, busca el rappitendero
    peddidoRappo.estado = new EstadoRecogiendo();
  }

  @Override
  public String obtenerEstado() {
    return "Preparando";
  }
}
