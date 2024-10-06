package laboratorio;

public class Coche extends Vehiculo_motorizado{
   private int numeroPuertas;
   
   public Coche (int modelo, int serie, int numeroPuertas){
    super(modelo, serie);
    this.numeroPuertas = numeroPuertas;
   }

   public void showImformation(){
    super.showImformation();
    System.out.print("numero de puertas: " + numeroPuertas);
   }
}
