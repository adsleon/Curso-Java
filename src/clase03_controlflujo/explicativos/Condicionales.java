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

package clase03_controlflujo.explicativos;

/**
 * Condicionales en Java
 * ----------------------------------------
 * Permiten ejecutar diferentes bloques de código
 * según una condición booleana.
 * <p>
 * - if
 * - if/else
 * - if/else if/else
 * - switch (para múltiples opciones)
 */
public class Condicionales {
    public static void main(String[] args) {
        int edad = 20;

        // if simple
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }

        // if/else
        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Eres adulto");
        }

        // if/else if/else
        if (edad < 13) {
            System.out.println("Eres un niño");
        } else if (edad < 18) {
            System.out.println("Eres adolescente");
        } else {
            System.out.println("Eres adulto");
        }

        // switch
        int dia = 3; // 1 = lunes, 2 = martes, etc.
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miércoles");
                break;

            default:
                System.out.println("Otro día");
        }
    }
}
