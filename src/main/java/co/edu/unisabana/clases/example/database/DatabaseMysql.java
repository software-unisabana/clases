package co.edu.unisabana.clases.example.database;


import co.edu.unisabana.clases.example.logica.IDatabase;

public class DatabaseMysql implements IDatabase {

  public void insertarRegistroBaseDatos() {
    System.out.println("Guarde algo en mysql");
  }
}
