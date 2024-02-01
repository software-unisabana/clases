package co.edu.unisabana.clases.example.patron.comportamiento.state;

public interface Estado {

  void avanzar(PeddidoRappo peddido);

  String obtenerEstado();
}
