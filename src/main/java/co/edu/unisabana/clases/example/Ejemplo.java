package co.edu.unisabana.clases.example;

public class Ejemplo {

  public static void main(String[] args) {
    Estudiante kevin = new Estudiante("1151");
    System.out.println(kevin.nombreInstitucion);
    kevin.nombre = "Kevin";
    Estudiante camilo = new Estudiante("111111");
    camilo.nombreInstitucion = "Super Universidad de la Sabana";
    camilo.nombre = "Camilo";

    System.out.println(kevin.nombreInstitucion);

    Estudiante.metodoCualquiera();

    System.out.println(Math.pow(10,2));
  }
}
