public class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

   
    public double calcularArea() {
        System.out.println("No hay figura "+ nombre);
        return 0;
    }

    public void mostrarArea() {
        System.out.println("El area de la figura " + nombre + " es: " + calcularArea());
    }
}


class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}


class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}