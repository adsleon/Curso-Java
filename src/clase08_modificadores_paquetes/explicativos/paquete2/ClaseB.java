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

package clase08_modificadores_paquetes.explicativos.paquete2;

import clase08_modificadores_paquetes.explicativos.paquete1.ClaseA;

public class ClaseB extends ClaseA {
    public void probarAccesos() {
        ClaseA obj = new ClaseA();

        // Accesibles
        System.out.println(obj.mensajePublico);  // ✔
        System.out.println(this.mensajeProtegido);    // ✔ (por herencia)

        // No accesibles:
        // System.out.println(obj.mensajeDefault); // ✘ fuera del paquete
        // System.out.println(obj.mensajePrivado); // ✘ privado
    }

    public static void main(String[] args) {
        ClaseB b = new ClaseB();
        b.probarAccesos();
    }
}

