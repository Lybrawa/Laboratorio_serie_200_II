package practica5Laboratorio;

public class CuentaBancaria {
    protected double saldo;
    public CuentaBancaria (double saldo){
        this.saldo = saldo;
    }
    public void retirar (double cantidad) throws SaldoInsuficienteException , LimiteSobregiroExcedidoException{
        if (saldo < cantidad){
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar la operacion");
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. \n Saldo restante: S/." + saldo);
    }
    public double getSaldo(){
        return saldo;
    }
}
