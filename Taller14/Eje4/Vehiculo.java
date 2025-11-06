package Eje4;

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
class bicicleta extends Vehiculo {
    public bicicleta(String nombre) {
        super(nombre);
    } 
    @Override
    public void moverse() {
        System.out.println("La " + nombre + " se esta moviendo");
    }   
}
