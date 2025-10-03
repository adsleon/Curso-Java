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

package clase09_excepciones.ejercicios;

/**
 * Reto con excepción personalizada
 * ------------------------------------------------------
 * Instrucciones:
 * 1. Crea una excepción personalizada llamada SaldoInsuficienteException.
 * 2. Declara una clase CuentaBancaria con:
 *    - Atributo saldo.
 *    - Método retirar(double monto) que:
 *        - Lanza SaldoInsuficienteException si monto > saldo.
 *        - Resta el monto al saldo si es válido.
 * 3. Maneja la excepción en main usando try-catch.
 */

// Excepción personalizada
..........

class .......... {
    ..........

    ..........

    ..........
}

public class RetoCuentaBancaria {
    public static void main(String[] args) {
        .......... cuenta = new ..........;

        .......... {
            cuenta...........(50);
            cuenta...........(80); // Esto lanza excepción
        } .......... (.......... e) {
            System.out.println("⚠ Operación fallida: " + e...........());
        }
    }
}

