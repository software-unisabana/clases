package co.edu.unisabana.clases.example.solid.modelo;

public class Administrador extends Estudiante{
    public Administrador(String nombre, String carrera) {
        super(nombre, carrera);
    }

    @Override
    public String devolverMaterias() {
        return "Negocios, Administracion I, Historia de la Administracion";
    }
}
