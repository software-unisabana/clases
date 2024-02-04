package co.edu.unisabana.clases.example.solid.modelo;

public class Informatico extends Estudiante{
    public Informatico(String nombre, String carrera) {
        super(nombre, carrera);
    }

    @Override
    public String devolverMaterias() {
        return "Programacion, Arquitectura, Base de datos";
    }
}
