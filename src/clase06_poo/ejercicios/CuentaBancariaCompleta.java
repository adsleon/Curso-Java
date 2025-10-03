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

import java.util.Objects;

/**
 * Cuenta Bancaria Completa
 * ----------------------------------------
 * Ejemplo de clase con:
 * - Encapsulación (atributos privados)
 * - Constructores
 * - Getters y Setters
 * - toString(), equals() y hashCode()
 */
public class CuentaBancariaCompleta {
    // Atributos privados
    private String titular;
    private double saldo;

    // Constructor sin parámetros
    public CuentaBancariaCompleta() {
        this.titular = "Desconocido";
        this.saldo = 0;
    }

    // Constructor con parámetros
    public CuentaBancariaCompleta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getters y Setters
    public String getTitular() { return this.titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public double getSaldo() { return this.saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    // Métodos
    public void depositar(double cantidad) {
        this.saldo += cantidad;
        System.out.println("Depósito de " + cantidad + "€. Nuevo saldo: " + this.saldo);
    }

    public void retirar(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            System.out.println("Retiro de " + cantidad + "€. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // toString
    @Override
    public String toString() {
        return "CuentaBancaria [titular=" + this.titular + ", saldo=" + this.saldo + "]";
    }

    // equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CuentaBancariaCompleta)) return false;
        CuentaBancariaCompleta cuenta = (CuentaBancariaCompleta) o;
        return Double.compare(cuenta.saldo, this.saldo) == 0 &&
                Objects.equals(this.titular, cuenta.titular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.titular, this.saldo);
    }

    public static void main(String[] args) {
        CuentaBancariaCompleta c1 = new CuentaBancariaCompleta("Ana", 200);
        CuentaBancariaCompleta c2 = new CuentaBancariaCompleta("Ana", 200);

        System.out.println(c1);
        System.out.println("¿Son iguales? " + c1.equals(c2));

        c1.depositar(100);
        c1.retirar(50);
    }
}
