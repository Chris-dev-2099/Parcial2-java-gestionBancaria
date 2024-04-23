package bank;

public class CuentaAhorro implements CuentaBancaria {
    private double saldo;
    private double tasaInteres;

    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        this.saldo = saldoInicial;
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
        double intereses = saldo * tasaInteres;
        saldo += intereses;
    }

    @Override
    public boolean retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}
