package co.edu.unisabana.clases.example.solid.modelo;

import java.util.ArrayList;

public class Administrador extends Estudiante{
    public Administrador(String nombre) {
        this.nombre = nombre;
        this.carrera = "Administrador";
    }

    @Override
    public String devolverMaterias() {
        return "Negocios, Administracion I, Historia de la Administracion";
    }

    @Override
    public ArrayList<String> devolverMateriales() {
        ArrayList<String> materiales = new ArrayList<>();
        materiales.add("Cerebro");
        materiales.add("Cafe");

        return materiales;
    }

    @Override
    public String saludoDirector() {
        return "Petro envia saludos";
    }
}
