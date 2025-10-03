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
 * Reto Saludo
 * ----------------------------------------
 * Instrucciones:
 * 1. Crea un método que reciba un nombre (String).
 * 2. El método debe imprimir un saludo personalizado.
 * 3. Llama al método varias veces con distintos nombres.
 */
public class RetoSaludo {

    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public static void main(String[] args) {
        saludar("Ana");
        saludar("Luis");
        saludar("María");
    }
}
