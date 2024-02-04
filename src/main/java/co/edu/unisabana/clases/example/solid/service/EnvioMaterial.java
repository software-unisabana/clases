package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Envio;
import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public class EnvioMaterial {

  public void enviarMaterialEstudiante(Estudiante estudiante) {
    Envio envio =new Envio();
    envio.setMaterial(estudiante.devolverMateriales());
    envio.setSaludoDirector(estudiante.saludoDirector());

    EmailOutlook email = new EmailOutlook();
    email.enviarEmail(envio);

    /*
    Se estaba violando el principio open-closed por lo tanto modificamos para que
    cada clase conociera sus materiales y el saludo de su director
     */
  }
}
