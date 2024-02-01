package co.edu.unisabana.clases.example.patron.comportamiento.state;

public class EstadoRecogiendo implements Estado {

  @Override
  public void avanzar(PeddidoRappo peddidoRappo) {

    System.out.println("SU pedido va a pasar  a su boca");
    //crea factura, busca el rappitendero
    peddidoRappo.estado = new EstadoRecogiendo();
  }

  @Override
  public String obtenerEstado() {
    return "En entrega";
  }
}
