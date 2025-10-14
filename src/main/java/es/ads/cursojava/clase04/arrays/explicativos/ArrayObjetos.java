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

package es.ads.cursojava.clase04.arrays.explicativos;

/**
 * Ejemplo de Arrays con Objetos
 * ----------------------------------------
 * En este caso usamos un array de Strings.
 */
public class ArrayObjetos {
    public static void main(String[] args) {
        String[] nombres = new String[3];
        nombres[0] = "Ana";
        nombres[1] = "Luis";
        nombres[2] = "Marta";

        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }
    }
}
