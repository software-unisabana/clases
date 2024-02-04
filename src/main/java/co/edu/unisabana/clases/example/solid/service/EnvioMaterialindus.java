package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Envio;
import co.edu.unisabana.clases.example.solid.modelo.Estudiante;
import java.util.ArrayList;

public class EnvioMaterialindus {


    /* violates open close */
    public void enviarMaterialEstudianteindus(Estudiante estudiante) {
        if (estudiante.carrera.equals("Industrial")) {
            Envio envio = new Envio();
            envio.material = new ArrayList<>();
            envio.material.add("Computador");
            envio.material.add("Mouse");
            envio.saludoDirector = "Jenny envia saludos";
            EmailOutlook email = new EmailOutlook();
            email.enviarEmail(envio);
        }
    }
}