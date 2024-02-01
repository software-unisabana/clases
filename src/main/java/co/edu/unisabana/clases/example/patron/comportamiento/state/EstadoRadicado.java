package co.edu.unisabana.clases.example.patron.comportamiento.state;

public class EstadoRadicado implements Estado {

  @Override
  public void avanzar(PeddidoRappo peddidoRappo) {
    if(peddidoRappo.prime){
      System.out.println("SU pedido va a pasar  a Recogiendo");
      //crea factura, busca el rappitendero
      peddidoRappo.estado = new EstadoRecogiendo();
    }else{
      System.out.println("SU pedido va a pasar  a preparando");
      //crea factura, busca el rappitendero
      peddidoRappo.estado = new EstadoPreparando();
    }

  }

  @Override
  public String obtenerEstado() {
    return "Radicando";
  }
}
