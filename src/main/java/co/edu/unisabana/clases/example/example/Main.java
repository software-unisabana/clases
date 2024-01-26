package co.edu.unisabana.clases.example.example;

public class Main {

  public static void main(String[] args) {
    CarroComercial[] carros = {
        new Audi(),
        new Mercedez(),
        new Nissan()
    };
    imprimirPrecioCarros(carros);

  }

  public static void imprimirPrecioCarros(CarroComercial[] carros) {
    for (CarroComercial carro : carros) {
      System.out.println(carro.obtenerPrecioVehiculo());
    }
  }
  public static void imprimirAsientos(CarroComercial[] carros) {
    for (CarroComercial carro : carros) {
      if(carro instanceof Audi){
        System.out.println(((Audi) carro).numeroAsientosAudi());
      }
    }
  }
}
