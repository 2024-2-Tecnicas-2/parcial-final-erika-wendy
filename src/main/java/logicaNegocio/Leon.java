package logicaNegocio;

public class Leon extends Animal {

    private TipoHabitat habitat = TipoHabitat.TERRESTRE;
    
    @Override
    public String emitirSonido() {
        return "Rugido";
    }

    @Override
    public String obtenerDieta() {
        return "Carnivoro";
    }
  public TipoHabitat getHabitat() {
        return habitat;
    }
  
}
