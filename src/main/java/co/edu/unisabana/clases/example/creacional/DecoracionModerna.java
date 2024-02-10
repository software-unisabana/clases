package co.edu.unisabana.clases.example.creacional;

public class DecoracionModerna implements AbstractFactory {

  @Override
  public Silla crearSilla() {
    return new SillaModerna();
  }

  @Override
  public Sofa crearSofa() {
    return new SofaModerna();
  }
}
