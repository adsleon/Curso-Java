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
 * Reto Divisiones con manejo de excepciones
 * ------------------------------------------------------
 * Instrucciones:
 * 1. Declara dos variables numéricas (int).
 * 2. Intenta dividirlas dentro de un bloque try.
 * 3. Maneja los siguientes casos con catch:
 *    - ArithmeticException: división por cero.
 *    - Exception: cualquier otro error.
 * 4. Muestra un mensaje en finally indicando que el programa sigue.
 */
public class RetoDivisiones {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0; // Cámbialo a probar

        try {
            int resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("⚠ No se puede dividir entre 0.");
        } catch (Exception e) {
            System.out.println("⚠ Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("El bloque finally siempre se ejecuta.");
        }

        System.out.println("El programa termina correctamente.");
    }
}

