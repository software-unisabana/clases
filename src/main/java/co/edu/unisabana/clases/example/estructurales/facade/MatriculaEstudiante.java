package co.edu.unisabana.clases.example.estructurales.facade;

public class MatriculaEstudiante {

  private Email email;
  private MatriculaFacade facade;


  public void matricularEstudiante() {
    facade.matricular();
  }

  public void reenviarEmailMatricula() {
    email.reenviarEmail();
  }
}
