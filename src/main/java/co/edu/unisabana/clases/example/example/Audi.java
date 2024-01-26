package co.edu.unisabana.clases.example.example;

public class Audi extends CarroComercial{

  /*
  Retorna el precio del vehiculo
   */
  @Override
  int obtenerPrecioVehiculo() {
    return 150;
  }

  int numeroAsientosAudi(){
    return 2;
  }
}
