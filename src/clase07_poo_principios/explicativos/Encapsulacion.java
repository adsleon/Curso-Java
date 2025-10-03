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

package clase07_poo_principios.explicativos;

/**
 * Principio de Encapsulación
 * ----------------------------------------
 * Protege los atributos de acceso directo y los controla mediante getters y setters.
 */
public class Encapsulacion {
    private String titular;
    private double saldo;

    public Encapsulacion(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getter y Setter
    public String getTitular() { return this.titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public double getSaldo() { return this.saldo; }
    public void depositar(double cantidad) {
        this.saldo += cantidad; }

    public void retirar(double cantidad) {
        if (cantidad <= this.saldo) this.saldo -= cantidad;
        else System.out.println("Saldo insuficiente");
    }

    public static void main(String[] args) {
        Encapsulacion cuenta = new Encapsulacion("Ana", 1000);
        cuenta.depositar(500);
        cuenta.retirar(300);
        System.out.println("Saldo de " + cuenta.getTitular() + ": " + cuenta.getSaldo());
    }
}
