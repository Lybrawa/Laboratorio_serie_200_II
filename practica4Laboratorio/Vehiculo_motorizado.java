package laboratorio;

class Vehiculo_motorizado extends Vehiculo  {
    
    int serie;

    public Vehiculo_motorizado (int modelo, int serie){
        super(modelo);
        this.serie = serie;
    }

    public void showImformation(){
        System.out.println("modelo "+ modelo+ "serie "+ serie);
    }
}
