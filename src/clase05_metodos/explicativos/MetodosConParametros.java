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

package clase05_metodos.explicativos;

/**
 * Métodos con parámetros
 * ----------------------------------------
 * Los métodos pueden recibir datos (parámetros).
 * Así podemos hacerlos más flexibles y reutilizables.
 */
public class MetodosConParametros {

    // Método que recibe un String
    public static void saludarPersona(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    // Método que suma dos enteros
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Llamamos al método pasando un argumento
        saludarPersona("Ana");
        saludarPersona("Carlos");

        // Llamamos al método de suma
        int resultado = sumar(5, 7);
        System.out.println("La suma es: " + resultado);
    }
}
