package logicaNegocio;

public abstract class Animal {
    
    public static void main(String[] args) {
        Animal Perro = new Perro();
        Animal Leon = new Leon();
        Animal Delfin = new Delfin();
}
 public abstract String emitirSonido();
 public abstract String obtenerDieta();
 
}
