package laboratorio;

class Motocicleta extends Vehiculo_motorizado {

    int año;

    public Motocicleta (int modelo, int serie, int año){
        super(modelo,serie);
        this.año = año;
    }
    
    public void showImformation (){
        System.out.println("modelo "+ modelo+ " serie "+serie+" año "+año);
    }
}
