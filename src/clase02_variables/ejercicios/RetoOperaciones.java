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

/**
 * Reto Operaciones
 * ----------------------------------
 * Instrucciones:
 * 1. Declara dos variables numéricas (int o double).
 * 2. Aplica todos los operadores básicos:
 *    - Aritméticos
 *    - Relacionales
 *    - Lógicos
 *    - De asignación
 *    - Bit a bit
 *    - Ternario
 * 3. Declara dos Strings y prueba a concatenarlos.
 * 4. Demuestra la precedencia de operadores en un ejemplo.
 */
public class RetoOperaciones {
    public static void main(String[] args) {
        int num1 = 12, num2 = 5;

        // Aritméticos
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
        System.out.println("Módulo: " + (num1 % num2));

        // Relacionales
        System.out.println("¿num1 mayor que num2? " + (num1 > num2));
        System.out.println("¿num1 igual que num2? " + (num1 == num2));

        // Lógicos
        boolean a = true, b = false;
        System.out.println("a y b: " + (a && b));
        System.out.println("a o b: " + (a || b));
        System.out.println("no a: " + (!a));

        // Asignación
        int x = 10;
        x += 2;
        System.out.println("x más igual 2: " + x);

        // Bit a bit
        System.out.println("num1 and num2: " + (num1 & num2));
        System.out.println("num1 or num2: " + (num1 | num2));

        // Ternario
        String resultado = (num1 > num2) ? "num1 es mayor" : "num2 es mayor o igual";
        System.out.println("Ternario: " + resultado);

        // Concatenación de Strings
        String palabra1 = "Hola";
        String palabra2 = "Mundo";
        System.out.println("Concatenación: " + palabra1 + " " + palabra2);

        // Precedencia
        int res1 = 10 + 2 * 5;   // Multiplicación antes que suma
        int res2 = (10 + 2) * 5; // Paréntesis cambia precedencia
        System.out.println("10 + 2 * 5 = " + res1);
        System.out.println("(10 + 2) * 5 = " + res2);
    }
}


