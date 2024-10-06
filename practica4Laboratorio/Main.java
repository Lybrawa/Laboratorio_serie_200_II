package laboratorio;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehicle1 = new Vehiculo(3546);
        vehicle1.showImformation();
        Vehiculo_motorizado obj1 = new Vehiculo_motorizado(3546, 2024);
        obj1.showImformation();
        Motocicleta obj2 = new Motocicleta(3546,2024, 2024);
        obj2.showImformation();
        Coche coche1 = new Coche(234, 123333, 4);
        coche1.showImformation();
    }
}
