package co.edu.unisabana.clases.example.solid.modelo;

import java.util.ArrayList;

public abstract class Estudiante {

    String nombre;
    String carrera;



    public abstract String devolverMaterias();

    public abstract ArrayList<String> devolverMateriales();

    public abstract String saludoDirector();

    /*
    Se borro el metodo guardarEstudiante debido a que no es utilizado
     */

}
