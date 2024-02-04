package co.edu.unisabana.clases.example.solid.main;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public class administracion implements Materias{
    @Override
    public boolean ismajor(Estudiante estudiante) {
        return estudiante.carrera.equals("Administracion");
    }

    @Override
    public void mostarMaterias() {

        System.out.println("Negocios, Administracion I, Historia de la Administracion");

    }
}
