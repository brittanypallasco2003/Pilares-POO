package Encapsulamiento.EncapsulamientoEj3;

public class main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000.0);

        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        cuenta.depositar(500.0);
        cuenta.retirar(200.0);
        cuenta.retirar(800.0);

        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}
