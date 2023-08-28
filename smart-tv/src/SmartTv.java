public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 20;

  public void ligar() {
    ligada=true;
  }

  public void aumentarVolume(){
    // volume = volume + 1;
    volume++;
  }

  public void diminuirVolume(){
    // volume = volume + 1;
    volume--;
  }

  public void mudarCanalCima(){
    canal++;
  }

  public void mudarCanalBaixo(){
    canal--;
  }

  public void mudarCanal (int novoCanal){
    canal = novoCanal;
  }

  public void desligar() {
    ligada=false;
  }
}
