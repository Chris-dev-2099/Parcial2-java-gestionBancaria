package bank;

public interface CuentaBancaria {
    void depositar(double monto);
    boolean retirar(double monto);
    double consultarSaldo();
}
