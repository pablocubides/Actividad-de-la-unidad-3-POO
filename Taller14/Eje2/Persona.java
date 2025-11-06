

public class Persona {
 String nombre;

public Persona(String nombre) {
    this.nombre = nombre;
}

public void presentarse() {
    System.out.println("Hola, Soy una persona me llamo " + nombre);
}
}
class estudiante extends Persona {


    public estudiante(String nombre) {
        super(nombre);
     
    }
    @Override
    public void presentarse() {
        System.out.println("Hola, Soy un estuidante me llamo " + nombre );
    }
}
class profesor extends Persona {


    public profesor(String nombre) {
        super(nombre);
        
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, Soy un profesor me llamo " + nombre);
    }
}
