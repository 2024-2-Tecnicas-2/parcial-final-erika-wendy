package logicaNegocio;

public abstract class Animal {

    public static void main(String[] args) {
        Animal Perro = new Perro();
        Animal Leon = new Leon();
        Animal Delfin = new Delfin();
       

        System.out.println("León:");
        System.out.println("Sonido: " + Leon.emitirSonido());
        System.out.println("Dieta: " + Leon.obtenerDieta());
        System.out.println("Hábitat: " + Leon.getHabitat());

        System.out.println("Delfín:");
        System.out.println("Sonido: " + Delfin.emitirSonido());
        System.out.println("Dieta: " + Delfin.obtenerDieta());
        System.out.println("Hábitat: " + Delfin.getHabitat());

        System.out.println("Perro:");
        System.out.println("Sonido: " + Perro.emitirSonido());
        System.out.println("Dieta: " + Perro.obtenerDieta());
        System.out.println("Hábitat: " + Perro.getHabitat());
        System.out.println("Interacción con humano: " + Perro.interactuarConHumano());
    }
    
    
 public abstract String emitirSonido();
 public abstract String obtenerDieta();
 public abstract String interactuarConHumano();
 
}
