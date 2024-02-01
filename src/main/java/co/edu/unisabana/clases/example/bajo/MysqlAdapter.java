package co.edu.unisabana.clases.example.bajo;

import co.edu.unisabana.clases.example.alto.IBD;

public class MysqlAdapter implements IBD {

  @Override
  public void guardarInformacio() {
    System.out.println("Guarde informacion en Mysql");
  }
}
