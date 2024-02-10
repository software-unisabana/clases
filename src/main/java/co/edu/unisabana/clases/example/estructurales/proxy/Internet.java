package co.edu.unisabana.clases.example.estructurales.proxy;

public class Internet implements IInternet {

  public String navegar(String url) {
    throw new NullPointerException();
  //  return "Resultado de la navegacion en la pagina " + url;
  }
}
