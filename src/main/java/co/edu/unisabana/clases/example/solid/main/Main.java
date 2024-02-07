package co.edu.unisabana.clases.example.solid.main;

import co.edu.unisabana.clases.example.solid.modelo.*;
import co.edu.unisabana.clases.example.solid.service.EmailOutlook;
import co.edu.unisabana.clases.example.solid.service.EnvioMaterial;

public class Main {
    static Envio envio = new Envio();
    static EmailOutlook email = new EmailOutlook();
    static EnvioMaterial material = new EnvioMaterial(envio, email);
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Informatico("Daniel"),
                new Administrador("Monica"),
                new Industrial("Liliana"),
                /*
                Se modifica y se crea la clase Estudiante correspondiente a cada pregrado
                para de esta forma cumplir con el principio open-closed al igual con el
                principio Liskov Substitution Principle
                 */
        };
        verMateriasEstudiantes(listadoEstudiantes);
        material.enviarMaterialEstudiante(new Informatico("Daniel"));
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.devolverMaterias());
        }
    }
}
