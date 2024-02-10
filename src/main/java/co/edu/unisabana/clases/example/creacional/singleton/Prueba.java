package co.edu.unisabana.clases.example.creacional.singleton;

public class Prueba {

  public static void main(String[] args) {


    cualquierCosa();
    cualquierCosa2();

  }

  private static void cualquierCosa2() {
    Database db = Database.obtenerInstancia();
    db.guardarRegistro();
  }

  private static void cualquierCosa() {
    Database db = Database.obtenerInstancia();
    db.guardarRegistro();
  }
}
