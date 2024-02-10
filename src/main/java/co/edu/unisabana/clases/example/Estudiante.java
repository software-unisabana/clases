package co.edu.unisabana.clases.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

public class Estudiante {
  //Final en clases es para evitar que se haga herencia (Deprecated)


  //Abstract metodos, es definir la firma, sin implementar el cuerpo
  // Para obligar a mis hijos a implementarlo


  //static No se necesita instanciar un objeto para invocar el metodo/variable
  //pertenecen a la clase no a la instancia.

  //variables estaticas: Cuando quiero compartir un mismo valor para todas las instancias
  //que arraigado a la clase.

  static String nombreInstitucion = "Universidad de la Sabana";
  String nombre;
  final String numeroIdentificacion;
  //camel
  static final int ID_UNIVERSIDAD = 54321;
  //snake

  public Estudiante(String numeroIdentificacion) {
    this.numeroIdentificacion = numeroIdentificacion;
  }
  //Oracle Certified Professional: Java

  //Este método pertenece es a la clase, no a la instancia.
  //Para ofrecer una funcionalidad sin tener que instanciar la clase.
  //Ud no puede ver variables de instancia en un static method .
  //SOLO puede ver variables estaticas
  static void metodoCualquiera() {
    System.out.println("La mejor Universidad de informatica/sistemas :" + nombreInstitucion);
  }

  // Para que no se pueda @Override: Cuando tengo herencia
  //Pero no quiero que mis hijos me sobreescriben este método.
  public final void hagaAlgo() {

  }
}
