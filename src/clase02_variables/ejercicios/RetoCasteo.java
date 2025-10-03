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

package clase02_variables.ejercicios;

import java.util.Scanner;

/**
 * Reto Casteo
 * ----------------------------------------
 * Instrucciones:
 * 1. Pide al usuario un número decimal.
 * 2. Convierte ese número a entero y muéstralo.
 * 3. Pide un número entero y conviértelo a char.
 * 4. Explica qué pasó en cada conversión.
 */
public class RetoCasteo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Paso 1: decimal a entero
        System.out.print("Introduce un número decimal: ");
        double decimal = sc.nextDouble();
        int entero = (int) decimal;
        System.out.println("El número como entero es: " + entero);

        // Paso 2: entero a char
        System.out.print("Introduce un número entero (ej. 65): ");
        int codigo = sc.nextInt();
        char caracter = (char) codigo;
        System.out.println("El número corresponde al carácter: " + caracter);
    }
}

