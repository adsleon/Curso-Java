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

package clase04_arrays.ejercicios;

import java.util.Scanner;

/**
 * Reto Notas
 * ----------------------------------------
 * Instrucciones:
 * 1. Pide al usuario 5 notas y guárdalas en un array.
 * 2. Calcula la media de las notas.
 */
public class RetoNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce la nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        double media = suma / notas.length;
        System.out.println("La media es: " + media);
    }
}
