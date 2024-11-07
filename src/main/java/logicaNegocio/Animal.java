package logicaNegocio;

public abstract class Animal {

    Animal Perro = new Perro();
    Animal Leon = new Leon();
    Animal Delfin = new Delfin();
     
    private TipoHabitat habitat;
    
    public Animal (TipoHabitat habitat){
        
    this.habitat = habitat;
    }

    public abstract String emitirSonido();
    public abstract String obtenerDieta();
    public abstract String interactuarConHumano();
}
