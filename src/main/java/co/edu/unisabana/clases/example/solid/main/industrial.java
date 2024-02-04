package co.edu.unisabana.clases.example.solid.main;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public class industrial implements Materias{
    @Override
    public boolean ismajor(Estudiante estudiante) {
        return estudiante.carrera.equals("Industrial");
    }

    @Override
    public void mostarMaterias() {
        System.out.println("Procesos, Analitica de datos, Gestion de Calidad ");

    }
}
