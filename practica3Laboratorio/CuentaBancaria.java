package practica3Laboratorio;

public class CuentaBancaria {
    public String numeroCuenta;
    private double saldo;
    protected String titular;

    public CuentaBancaria(String numeroCuenta, double saldoInicial, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
        }
    }
}

