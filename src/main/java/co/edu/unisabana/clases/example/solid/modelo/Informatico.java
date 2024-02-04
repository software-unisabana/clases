package co.edu.unisabana.clases.example.solid.modelo;

import java.util.ArrayList;

public class Informatico extends Estudiante{
    public Informatico(String nombre) {
        this.nombre = nombre;
        this.carrera = "Informatico";
    }

    @Override
    public String devolverMaterias() {
        return "Programacion, Arquitectura, Base de datos";
    }

    @Override
    public ArrayList<String> devolverMateriales() {
        ArrayList<String> materiales = new ArrayList<>();
        materiales.add("Teclado");
        materiales.add("Mouse");

        return materiales;
    }

    @Override
    public String saludoDirector() {
        return "Jenny envia saludos";
    }
}
