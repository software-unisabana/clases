package co.edu.unisabana.clases.example.estructurales.facade;

public class MatriculaFacade {

  private Dian dian;
  private Factura factura;
  private Facultad facultad;
  private Email email;

  public void matricular(){
    dian.obtenerSalario();
    factura.facturar();
    facultad.registrarFacultad();
    email.enviarEmail();
  }
}
