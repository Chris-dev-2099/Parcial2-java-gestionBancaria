package bank;
import java.util.ArrayList;
import java.util.List;

public class GestorCuentas {
    private List<CuentaBancaria> cuentas = new ArrayList<>();

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void depositar(int indiceCuenta, double monto) {
        if (indiceCuenta >= 0 && indiceCuenta < cuentas.size()) {
            cuentas.get(indiceCuenta).depositar(monto);
        } else {
            System.out.println("Índice de cuenta no válido.");
        }
    }

    public boolean retirar(int indiceCuenta, double monto) {
        if (indiceCuenta >= 0 && indiceCuenta < cuentas.size()) {
            return cuentas.get(indiceCuenta).retirar(monto);
        } else {
            System.out.println("Índice de cuenta no válido.");
            return false;
        }
    }

    public double consultarSaldo(int indiceCuenta) {
        if (indiceCuenta >= 0 && indiceCuenta < cuentas.size()) {
            return cuentas.get(indiceCuenta).consultarSaldo();
        } else {
            System.out.println("Índice de cuenta no válido.");
            return 0;
        }
    }
}
