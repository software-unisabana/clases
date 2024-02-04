package co.edu.unisabana.clases.example.solid.main;

import co.edu.unisabana.clases.example.solid.modelo.Administrador;
import co.edu.unisabana.clases.example.solid.modelo.Estudiante;
import co.edu.unisabana.clases.example.solid.modelo.Industrial;
import co.edu.unisabana.clases.example.solid.modelo.Informatico;
import co.edu.unisabana.clases.example.solid.service.EnvioMaterial;

public class Main {
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
        EnvioMaterial material = new EnvioMaterial();
        material.enviarMaterialEstudiante(new Informatico("Daniel"));
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.devolverMaterias());
        }
    }
}
