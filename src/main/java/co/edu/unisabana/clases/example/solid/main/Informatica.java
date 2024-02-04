package co.edu.unisabana.clases.example.solid.main;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public class Informatica implements Materias{
    @Override
    public boolean ismajor(Estudiante estudiante) {
        return estudiante.carrera.equals("Informatica");
    }

    @Override
    public void mostarMaterias() {

        System.out.println("Programacion, Arquitectura, Base de datos");

    }
}
