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

import java.util.Scanner;

/**
 * Reto: Manejo de excepciones con entrada del usuario
 * ------------------------------------------------------
 * Instrucciones:
 * 1. Pide al usuario que introduzca un número.
 * 2. Usa try-catch para manejar:
 *    - NumberFormatException: si el usuario no introduce un número válido.
 * 3. Imprime el número si es válido, o un mensaje de error si no lo es.
 */
public class RetoEntradaUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número introducido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("⚠ Error: Debes introducir un número válido.");
        } finally {
            System.out.println("Gracias por usar el programa.");
        }
    }
}

