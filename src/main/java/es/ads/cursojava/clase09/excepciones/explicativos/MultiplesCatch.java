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
 * Ejemplo con múltiples bloques catch
 * ------------------------------------------------------
 * Podemos atrapar diferentes tipos de excepciones en un mismo try.
 */
public class MultiplesCatch {
    public static void main(String[] args) {
        String texto = null;

        try {
            // Error 1: acceso a índice inválido
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);

            // Error 2: método sobre un null
            System.out.println(texto.length());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠ Error: Índice fuera de rango.");
        } catch (NullPointerException e) {
            System.out.println("⚠ Error: El objeto es null.");
        } catch (Exception e) {
            System.out.println("⚠ Error genérico: " + e.getMessage());
        }

        System.out.println("Fin del programa.");
    }
}

