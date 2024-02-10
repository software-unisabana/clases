package co.edu.unisabana.clases.example.estructurales.proxy;

public class Estudiante {

  public static void main(String[] args) {
    IInternet internet = new ProxyUnisabana();

    String navegar = internet.navegar("instagram.com");
    System.out.println(navegar);
  }

}
