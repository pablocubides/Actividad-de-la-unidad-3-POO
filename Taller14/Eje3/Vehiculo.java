public class Vehiculo {
String nombre;
public Vehiculo(String nombre) {
    this.nombre = nombre;
}

public void moverse() {
   System.out.println("El" + nombre + "se esta moviendo");
}
}
class coche extends Vehiculo {
    public coche(String nombre) {
        super(nombre);
    } 
    @Override
    public void moverse() {
        System.out.println("El " + nombre + " se esta moviendo");
      }
    
} 
class Moto extends Vehiculo {
    public Moto(String nombre) {
        super(nombre);
    } 
    @Override
    public void moverse() {
        System.out.println("La " + nombre + " se esta moviendo");
      }  
          public void frenar() {
        System.out.println("el " + nombre + " esta frenando");
    }   
}
class prueba {
    public static void main(String[] args) {
        Vehiculo v1 = new coche("toyota");

        v1.moverse();       
        v1.frenar(); 
        }
}