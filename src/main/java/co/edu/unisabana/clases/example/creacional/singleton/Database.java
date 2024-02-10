package co.edu.unisabana.clases.example.creacional.singleton;

public class Database {
  //Garantizar que solo haya una instancia de Database

  private static Database database;

  private Database() {
  }

  public static Database obtenerInstancia() {
    if (database == null) {
      database = new Database();
    }
    return database;
  }
  public void guardarRegistro(){
    //guardadno
    //guardadno
  }
}
