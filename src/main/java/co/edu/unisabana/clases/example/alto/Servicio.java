package co.edu.unisabana.clases.example.alto;

public class Servicio {

  final IBD bd;

  public Servicio(IBD bd) {
    this.bd = bd;
  }

  public void hacerLogica(){
    //Logica de negocio bla bla bla
    bd.guardarInformacio();
  }
}
