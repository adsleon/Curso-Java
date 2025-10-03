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

package clase02_variables.explicativos;

/**
 * Casteo de variables en Java
 * ----------------------------------------
 * El "casteo" es la conversión de un tipo de dato a otro.
 *
 * Tipos:
 * - Casting implícito (widening): ocurre automáticamente cuando
 *   se pasa de un tipo más pequeño a uno más grande.
 * - Casting explícito (narrowing): hay que forzarlo usando (tipo).
 */
public class Casteo {
    public static void main(String[] args) {
        // Casting implícito (de int a double)
        int numEntero = 10;
        double numDecimal = numEntero; // automático
        System.out.println("Casting implícito: int -> double = " + numDecimal);

        // Casting explícito (de double a int)
        double valorDecimal = 9.78;
        int valorEntero = (int) valorDecimal; // se pierde la parte decimal
        System.out.println("Casting explícito: double -> int = " + valorEntero);

        // Casting entre char e int
        char letra = 'A'; // en Unicode = 65
        int codigo = letra; // implícito
        System.out.println("Casting implícito: char -> int = " + codigo);

        int codigo2 = 66;
        char letra2 = (char) codigo2; // explícito
        System.out.println("Casting explícito: int -> char = " + letra2);
    }
}

