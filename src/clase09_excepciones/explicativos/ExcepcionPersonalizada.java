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

package clase09_excepciones.explicativos;

/**
 * Excepciones personalizadas en Java
 * ------------------------------------------------------
 * - Podemos crear nuestras propias clases de excepción
 *   extendiendo de Exception (checked) o RuntimeException (unchecked).
 * - Esto es útil para dar mensajes más claros en casos específicos.
 */
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class ExcepcionPersonalizada {
    public static void main(String[] args) {
        try {
            validarEdad(15);
            System.out.println("Edad válida, puedes continuar.");
        } catch (EdadInvalidaException e) {
            System.out.println("⚠ Error: " + e.getMessage());
        }
    }

    // Método que lanza una excepción personalizada
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 18) {
            throw new EdadInvalidaException("La edad mínima es 18 años.");
        }
    }
}

