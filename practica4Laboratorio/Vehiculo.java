package laboratorio;

public class Vehiculo {
    
    int modelo;

    public Vehiculo (int modelo){
        this.modelo = modelo;
    }

    public void showImformation(){
        System.out.println("Modelo" + modelo);
    }
}
