
// Interfaz o Clase (segun desee implementarlo) CuentaBancaria que defina métodos
// como depositar, retirar y consultarSaldo.

// Clase concreta CuentaCorriente que implemente CuentaBancaria e incluya atributos
// como saldo y límite de sobregiro.

// Clase concreta CuentaAhorro que implemente CuentaBancaria e incluya atributos
// como saldo y tasa de interés.

// Clase GestorCuentas que tenga una lista de cuentas bancarias y métodos para realizar
// operaciones como depositar, retirar y consultar saldo.


import bank.CuentaAhorro;
import bank.CuentaCorriente;
// import bank.CuentaBancaria;
import bank.GestorCuentas;

public class App {
    public static void main(String[] args) {
        GestorCuentas gestor = new GestorCuentas();

        CuentaCorriente cuentaCorriente = new CuentaCorriente(1000, 500);

        CuentaAhorro cuentaAhorro = new CuentaAhorro(2000, 0.05);

        gestor.agregarCuenta(cuentaCorriente);
        gestor.agregarCuenta(cuentaAhorro);

        gestor.depositar(0, 200);
        gestor.retirar(0, 1500); 
        gestor.retirar(0, 100);

        gestor.depositar(1, 500);

        System.out.println("Saldo cuenta corriente: " + gestor.consultarSaldo(0));
        System.out.println("Saldo cuenta ahorros: " + gestor.consultarSaldo(1));
    }
}


