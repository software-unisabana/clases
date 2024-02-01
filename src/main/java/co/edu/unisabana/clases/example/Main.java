package co.edu.unisabana.clases.example;

import co.edu.unisabana.clases.example.alto.Servicio;
import co.edu.unisabana.clases.example.bajo.MysqlAdapter;
import co.edu.unisabana.clases.example.bajo.PostgreSQLAdapter;

public class Main {

  public static void main(String[] args) {

    Servicio service = new Servicio(new MysqlAdapter());
    service.hacerLogica();

    Servicio otroService = new Servicio(new PostgreSQLAdapter());
    otroService.hacerLogica();
  }
}
