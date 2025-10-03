/*
 * Copyright (c) 2025 Rubén Bécares Álvarez
 *
 * Licencia: CC BY-NC 4.0
 * Uso permitido solo para fines personales o educativos.
 * Prohibido el uso comercial sin autorización expresa del autor.
 * Última modificación: 30/9/2025
 *
 *
 */

package clase06_poo.ejercicios;

/**
 * Cuenta Bancaria Básica
 * ----------------------------------------
 * Ejemplo de clase con atributos públicos y métodos simples.
 */
public class CuentaBancariaBasica {
    // Atributos
    String titular;
    double saldo;

    // Método para depositar dinero
    public void depositar(double cantidad) {
        this.saldo += cantidad;
        System.out.println("Depósito de " + cantidad + "€. Nuevo saldo: " + this.saldo);
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        this.saldo -= cantidad;
        if (this.saldo < 0) this.saldo = 0;
        System.out.println("Retiro de " + cantidad + "€. Nuevo saldo: " + this.saldo);
    }

    public static void main(String[] args) {
        CuentaBancariaBasica cuenta = new CuentaBancariaBasica();
        cuenta.titular = "Ana";
        cuenta.saldo = 100;

        cuenta.depositar(50);
        cuenta.retirar(30);
    }
}
