package co.edu.unisabana.clases.example.solid.modelo;

public class Industrial extends Estudiante{
    public Industrial(String nombre, String carrera) {
        super(nombre, carrera);
    }

    @Override
    public String devolverMaterias() {
        return "Procesos, Analitica de datos, Gestion de Calidad ";
    }
}
