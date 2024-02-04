package co.edu.unisabana.clases.example.solid.modelo;

import java.util.ArrayList;

public class Industrial extends Estudiante{
    public Industrial(String nombre) {
        this.nombre = nombre;
        this.carrera = "Industrial";
    }

    @Override
    public String devolverMaterias() {
        return "Procesos, Analitica de datos, Gestion de Calidad ";
    }

    @Override
    public ArrayList<String> devolverMateriales() {
        ArrayList<String> materiales = new ArrayList<>();
        materiales.add("Casco");
        materiales.add("Esfero");

        return materiales;
    }

    @Override
    public String saludoDirector() {
        return "Chips envia saludos";
    }
}
