/*
 * Copyright (c) 2025 Rubén Bécares Álvarez
 *
 * Licencia: CC BY-NC 4.0
 * Uso permitido solo para fines personales o educativos.
 * Prohibido el uso comercial sin autorización expresa del autor.
 * Última modificación: 14/10/2025
 *
 *
 */

package es.ads.cursojava.clase03.controlflujo.explicativos;

/**
 * Bucles en Java
 * ----------------------------------------
 * Sirven para repetir un bloque de código.
 *
 * - for
 * - while
 * - do/while
 */
public class Bucles {
    public static void main(String[] args) {
        // for
        System.out.println("Bucle for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración: " + i);
        }

        // while
        System.out.println("\nBucle while:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteración: " + j);
            j++;
        }

        // do/while
        System.out.println("\nBucle do/while:");
        int k = 1;
        do {
            System.out.println("Iteración: " + k);
            k++;
        } while (k <= 5);

        // Con salto albitario

        //Saldo de 2 (cambiar para cambair el bucle
        int n = 2;

        // for
        System.out.println("Bucle for:");
        for (int i = 1; i <= 5; i += n) {
            System.out.println("Iteración: " + i);
        }

        // while
        System.out.println("\nBucle while:");
        j = 1;
        while (j <= 5) {
            System.out.println("Iteración: " + j);
            j += n;
        }

        // do/while
        System.out.println("\nBucle do/while:");
        k = 1;
        do {
            System.out.println("Iteración: " + k);
            k += n;
        } while (k <= 5);
    }
}
