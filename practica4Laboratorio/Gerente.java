package practica4Laboratorio;

public class Gerente extends Empleado {
    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBono() {
        return getSalario() * 0.15;
    }
}
