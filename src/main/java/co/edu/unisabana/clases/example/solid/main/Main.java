package co.edu.unisabana.clases.example.solid.main;

import co.edu.unisabana.clases.example.solid.modelo.Administrador;
import co.edu.unisabana.clases.example.solid.modelo.Estudiante;
import co.edu.unisabana.clases.example.solid.modelo.Industrial;
import co.edu.unisabana.clases.example.solid.modelo.Informatico;
import co.edu.unisabana.clases.example.solid.service.EnvioMaterial;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Informatico("Daniel", "Informatica"),
                new Administrador("Monica", "Administracion"),
                new Industrial("Liliana", "Industrial"),
        };
        verMateriasEstudiantes(listadoEstudiantes);
        EnvioMaterial material = new EnvioMaterial();
        material.enviarMaterialEstudiante(new Informatico("Daniel", "Informatica"));
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.devolverMaterias());
        }
    }
}
