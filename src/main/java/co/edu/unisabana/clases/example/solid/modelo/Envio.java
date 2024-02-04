package co.edu.unisabana.clases.example.solid.modelo;

import java.util.List;

public class Envio {

  private List<String> material;

  /*
  Los atributos material y saludoDirector ahora son privados
   */

  public void setSaludoDirector(String saludoDirector) {
    this.saludoDirector = saludoDirector;
  }

  public void setMaterial(List<String> material) {
    this.material = material;
  }

  private String saludoDirector;

  @Override
  public String toString() {
    return "Envio{" +
        "material=" + material +
        ", saludoDirector='" + saludoDirector + '\'' +
        '}';
  }
}
