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
 * Control de Flujo Avanzado
 * ----------------------------------------
 * Ejemplos de:
 * - break: salir de un bucle antes de tiempo
 * - continue: saltar a la siguiente iteración
 * - bucles anidados
 */
public class ControlFlujoAvanzado {
    public static void main(String[] args) {
        // Ejemplo de break
        System.out.println("Ejemplo de break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.println("Se alcanzó el número 5, saliendo del bucle.");
                break; // rompe el bucle
            }
            System.out.println("Número: " + i);
        }

        // Ejemplo de continue
        System.out.println("\nEjemplo de continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Saltando el número 3.");
                continue; // salta esta iteración
            }
            System.out.println("Número: " + i);
        }

        // Ejemplo de bucles anidados
        System.out.println("\nEjemplo de bucles anidados (tabla de multiplicar):");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("----");
        }

        // Ejemplo de bucle con doble variable
        System.out.println("\nEjemplo de bucle con doble variables (uno crece de 1 y el otro decrece de 2):");
        for(int i = 0, j = 20; i <= 10 && j >= 0; i++, j-=2){
            System.out.println(i + " - " + j );

        }
    }
}
