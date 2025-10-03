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

package clase02_variables.explicativos;

/**
 * Operadores en Java
 * ----------------------------------
 * - Aritméticos: +, -, *, /, %, ++, --
 * - Asignación: =, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=
 * - Relacionales: ==, !=, >, <, >=, <=
 * - Lógicos: &&, ||, !
 * - Bit a bit: &, |, ^, ~, <<, >>, >>>
 * - Ternario: cond ? valor1 : valor2
 * - instanceof: para comprobar tipos de objetos
 *
 * Precedencia (de mayor a menor):
 * 1. () []
 * 2. ++ -- ! ~ (casting)
 * 3. * / %
 * 4. + -
 * 5. << >> >>>
 * 6. < <= > >= instanceof
 * 7. == !=
 * 8. &
 * 9. ^
 * 10. |
 * 11. &&
 * 12. ||
 * 13. ? :
 * 14. = += -= *= /= %= &= |= ^= <<= >>=
 */
public class OperadoresBasicos {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Operadores aritméticos
        System.out.println("Aritméticos:");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División entera: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        System.out.println("Incremento de a: " + ++a);
        System.out.println("Incremento de a: " + a++);
        System.out.println("Incremento de a: " + a);
        System.out.println("Decremento de b: " + --b);
        System.out.println("Decremento de b: " + b--);
        System.out.println("Decremento de b: " + b);

        // Operadores de asignación
        System.out.println("\nAsignación:");
        int x = 5;
        x += 3;  // x = x + 3
        System.out.println("x += 3: " + x);
        x *= 2;  // x = x * 2
        System.out.println("x *= 2: " + x);

        // Operadores relacionales
        System.out.println("\nRelacionales:");
        System.out.println("¿a > b? " + (a > b));
        System.out.println("¿a == b? " + (a == b));
        System.out.println("¿a != b? " + (a != b));

        // Operadores lógicos
        System.out.println("\nLógicos:");
        boolean cond1 = true, cond2 = false;
        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 || cond2: " + (cond1 || cond2));
        System.out.println("!cond1: " + (!cond1));

        // Operadores bit a bit
        System.out.println("\nBit a bit:");
        int m = 5;  // 0101 en binario
        int n = 3;  // 0011 en binario
        System.out.println("m & n: " + (m & n)); // AND
        System.out.println("m | n: " + (m | n)); // OR
        System.out.println("m ^ n: " + (m ^ n)); // XOR
        System.out.println("~m: " + (~m));       // NOT
        System.out.println("m << 1: " + (m << 1)); // Desplazamiento izq
        System.out.println("m >> 1: " + (m >> 1)); // Desplazamiento der

        // Operador ternario
        System.out.println("\nTernario:");
        int edad = 18;
        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("Edad: " + edad + " -> " + resultado);

        // Operador instanceof
        System.out.println("\nInstanceof:");
        String texto = "Hola";
        System.out.println("texto instanceof String: " + (texto instanceof String));

        // Precedencia de operadores
        System.out.println("\nPrecedencia:");
        int res1 = 10 + 2 * 5;    // * tiene más prioridad que +
        int res2 = (10 + 2) * 5;  // () cambia la precedencia
        System.out.println("10 + 2 * 5 = " + res1);
        System.out.println("(10 + 2) * 5 = " + res2);
    }
}

