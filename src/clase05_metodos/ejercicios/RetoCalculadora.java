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

package clase05_metodos.ejercicios;

/**
 * Reto Calculadora
 * ----------------------------------------
 * Instrucciones:
 * 1. Crea métodos para:
 *    - sumar
 *    - restar
 *    - multiplicar
 *    - dividir
 * 2. Llama a cada método desde main e imprime los resultados.
 */
public class RetoCalculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: división por cero");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        int x = 10, y = 5;

        System.out.println("Suma: " + sumar(x, y));
        System.out.println("Resta: " + restar(x, y));
        System.out.println("Multiplicación: " + multiplicar(x, y));
        System.out.println("División: " + dividir(x, y));
    }
}
