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

package clase06_poo.explicativos;

/**
 * Clase PersonaBasica
 * ----------------------------------------
 * Una clase es un "molde" o plantilla.
 * Los objetos son instancias creadas a partir de esa clase.
 *
 * Esta clase define:
 * - Atributos: nombre y edad
 * - Métodos: presentarse
 */
public class PersonaBasica {
    // Atributos (características)
    String nombre;
    int edad;

    // Método (comportamiento)
    public void presentarse() {
        System.out.println("Hola, me llamo " + this.nombre + " y tengo " + this.edad + " años.");
    }

    public static void main(String[] args) {
        // Crear objetos (instancias de PersonaBasica)
        PersonaBasica p1 = new PersonaBasica();
        p1.nombre = "Ana";
        p1.edad = 20;

        PersonaBasica p2 = new PersonaBasica();
        p2.nombre = "Luis";
        p2.edad = 25;

        // Usar métodos
        p1.presentarse();
        p2.presentarse();
    }
}
