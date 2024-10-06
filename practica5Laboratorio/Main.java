package practica5Laboratorio;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente(1000, 500);

        try{
            cuenta1.retirar(1000);
            System.out.println("Retiro exitoso. \nSaldo restante: S/." + cuenta1.getSaldo());
        }catch(SaldoInsuficienteException  | LimiteSobregiroExcedidoException e){
            System.out.println("Retiro invalido");
        }
    }
    
}
