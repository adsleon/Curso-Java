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

package es.ads.cursojava.clase09.excepciones.explicativos;

/**
 * Manejo de Excepciones en Java
 * ------------------------------------------------------
 * - Una excepción es un error que ocurre durante la ejecución.
 * - Java proporciona el bloque try-catch para manejar errores.
 *
 * Sintaxis:
 * try {
 *     // Código que puede lanzar una excepción
 * } catch (TipoDeExcepcion e) {
 *     // Código para manejar la excepción
 * } finally {
 *     // (Opcional) Código que siempre se ejecuta
 * }
 */
public class ExcepcionesBasicas {
    public static void main(String[] args) {
        System.out.println("Inicio del programa...");

        try {
            // Ejemplo: división por cero
            int resultado = 10 / 0; // Lanza ArithmeticException
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("⚠ Error: No se puede dividir entre cero.");
            System.out.println("Mensaje de la excepción: " + e.getMessage());
        } finally {
            System.out.println("Bloque finally: se ejecuta siempre.");
        }

        System.out.println("El programa sigue funcionando después de la excepción.");
    }
}
