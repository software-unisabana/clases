package co.edu.unisabana.clases.example.solid.modelo;

public class Estudiante {

    public String nombre;
    public String carrera;

    public Estudiante(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }
    /*
    * viola el Single resposilbility principle por lo que una clase deberia estar solo cumpliendo un funcion entonces pusimos el metodo en otra clase
    *
    *   void guardarEstudiante() {
        System.out.println("Guardando estudiante en base de datos");
    }
 */

}
