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

package es.ads.cursojava.clase05.metodos.explicativos;

/**
 * Métodos en Java
 * ----------------------------------------
 * - Un método es un bloque de código que ejecuta una tarea.
 * - Se puede llamar (invocar) varias veces.
 * - Ayuda a organizar y reutilizar el código.
 *
 * Sintaxis:
 * modificadorDeAcceso tipoDeRetorno nombreMetodo(parametros) {
 *     // cuerpo del método
 * }
 */
public class MetodosBasicos {

    // Método que no devuelve nada (void)
    public static void saludar() {
        System.out.println("¡Hola desde un método!");
    }

    // Método que devuelve un valor (int)
    public static int obtenerNumero() {
        return 42;
    }

    public static void main(String[] args) {
        // Llamar a un método sin retorno
        saludar();

        // Llamar a un método con retorno
        int numero = obtenerNumero();
        System.out.println("El método devolvió: " + numero);
    }
}
