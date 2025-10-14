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

package es.ads.cursojava.clase04.arrays.explicativos;

/**
 * Ejemplo básico de Arrays en Java
 * ----------------------------------------
 * - Declaración
 * - Inicialización
 * - Recorrido con for y for-each
 */
public class ArrayBasico {
    public static void main(String[] args) {
        // Declaración e inicialización
        int[] numeros = {10, 20, 30, 40, 50};
        char[] letras = new char[5];

        // Recorrido con for clásico
        System.out.println("Recorrido con for clásico:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en posición " + i + ": " + numeros[i]);
        }

        // Recorrido con for-each
        System.out.println("\nRecorrido con for-each:");
        for (int num : numeros) {
            System.out.println("Elemento: " + num);
        }

        // Recorrido con for clásico
        System.out.println("Recorrido con for clásico:");
        for (int i = 0; i < letras.length; i++) {
            letras[i] = (char) (97+i);
        }

        // Recorrido con for-each
        System.out.println("\nRecorrido con for-each:");
        for (char letra : letras) {
            System.out.println("Elemento: " + letra);
        }
    }
}
