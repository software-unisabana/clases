package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Envio;
import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public class EnvioMaterial {
  private final Envio envio;
  private final EmailOutlook email;


  public EnvioMaterial(Envio envio, EmailOutlook email){
    this.envio=envio;
    this.email=email;
  }

  public void enviarMaterialEstudiante(Estudiante estudiante) {
    envio.setMaterial(estudiante.devolverMateriales());
    envio.setSaludoDirector(estudiante.saludoDirector());

    email.enviarEmail(envio);

    /*
    Se estaba violando el principio open-closed por lo tanto modificamos para que
    cada clase conociera sus materiales y el saludo de su director
     */
  }
}
