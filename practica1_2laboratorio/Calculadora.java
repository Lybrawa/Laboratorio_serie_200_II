package practica1_2laboratorio;

public class Calculadora {
    public void sumar(double numero1, double numero2){
        double suma = numero1 + numero2;
        System.out.println("Suma: " + suma); 
    }
    public void restar (double numero1, double numero2){
        double resta = numero1 - numero2;
        System.out.println("Resta: " + resta );
    }
    public void multiplicar (double numero1, double numero2){
        double producto = numero1 * numero2;
        System.out.println("Multiplicacion: " + producto);
    }
    public void division (double numero1, double numero2){
        try{
            double cociente = numero1 / numero2;
            System.out.println("Division: " + cociente);
        } catch (ArithmeticException e){
            System.out.println("Errors");
        }
    }
}
