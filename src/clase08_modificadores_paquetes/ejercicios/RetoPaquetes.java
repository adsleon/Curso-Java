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

package clase08_modificadores_paquetes.ejercicios;

..........

/**
 * Reto Paquetes
 * ----------------------------------------
 * Instrucciones:
 * 1. Importa la clase ClaseA desde paquete1.
 * 2. Intenta acceder a sus atributos.
 * 3. Observa cuáles se pueden usar y cuáles no.
 */
public class RetoPaquetes {
    public static void main(String[] args) {
        ..........

        // Accesible:
        System.out.println(...........mensajePublico);

        // No accesibles desde fuera del paquete:
        // System.out.println(...........mensajeProtegido);
        // System.out.println(...........mensajeDefault);
        // System.out.println(...........mensajePrivado);
    }
}
