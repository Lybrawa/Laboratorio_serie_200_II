package practica1_2laboratorio;

public class CuentaBancaria {
    public String titular;
    public String numeroCuenta;
    public double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void depositar(double monto){
        saldo+=monto;
    }
    public void retirar (double monto){
        if(saldo<monto){
            saldo-=monto;
        }else{
            System.out.println("Saldo insuficiente");
        }  
    }
    public double consultarSaldo(){
        return saldo;
    }
}
