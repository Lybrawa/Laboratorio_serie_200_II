package practica3Laboratorio;

public class Circulo {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double getRadio() {
        return radio;
    }
}

