package co.edu.unisabana.clases.example.creacional;

public class DecoracionVictoriana implements AbstractFactory {

  @Override
  public Silla crearSilla() {
    return new SillaVictoriana();
  }

  @Override
  public Sofa crearSofa() {
    return new SofaVictoriana();
  }
}
