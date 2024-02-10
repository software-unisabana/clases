package co.edu.unisabana.clases.example.estructurales.proxy;

public class ProxyUnisabana implements IInternet {

  private IInternet iInternet;

  public ProxyUnisabana() {
    this.iInternet = new Internet();
  }

  @Override
  public String navegar(String url) {
    if (url.contains("xxx")) {
      throw new RuntimeException("No vea esto en la universidad");
    } else if (url.contains("instagram")) {
      throw new RuntimeException("Mejor estudie");
    }

    return iInternet.navegar(url);
  }
}
