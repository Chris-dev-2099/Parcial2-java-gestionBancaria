package bank;

public class CuentaCorriente implements CuentaBancaria {
    private double saldo;
    private double limiteSobregiro;

    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        this.saldo = saldoInicial;
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public boolean retirar(double monto) {
        if (saldo >= monto || (saldo + limiteSobregiro) >= monto) {
            if (saldo >= monto) {
                saldo -= monto;
            } else {
                double excesoRetiro = monto - saldo;
                saldo = 0;
                limiteSobregiro -= excesoRetiro;
            }
            return true;
        }
        return false;
    }
    
    
    

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}
