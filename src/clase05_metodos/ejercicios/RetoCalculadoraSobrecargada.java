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

package clase05_metodos.ejercicios;

/**
 * Reto Calculadora Sobrecargada
 * ----------------------------------------
 * Instrucciones:
 * 1. Crea varios métodos "sumar" que reciban:
 *    - Dos enteros
 *    - Dos doubles
 *    - Dos Strings (concaténalos)
 * 2. Llama a los métodos desde main.
 */
public class RetoCalculadoraSobrecargada {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static String sumar(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Suma int: " + sumar(5, 10));
        System.out.println("Suma double: " + sumar(2.5, 3.7));
        System.out.println("Concatenación String: " + sumar("Hola", " Mundo"));
    }
}
