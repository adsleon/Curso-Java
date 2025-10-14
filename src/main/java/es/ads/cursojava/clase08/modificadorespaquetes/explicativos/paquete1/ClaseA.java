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

package es.ads.cursojava.clase08.modificadorespaquetes.explicativos.paquete1;

public class ClaseA {
    public String mensajePublico = "Mensaje público desde ClaseA";
    protected String mensajeProtegido = "Mensaje protegido desde ClaseA";
    String mensajeDefault = "Mensaje default desde ClaseA";
    private final String mensajePrivado = "Mensaje privado desde ClaseA";

    public void mostrar() {
        System.out.println(this.mensajePublico);
        System.out.println(this.mensajeProtegido);
        System.out.println(this.mensajeDefault);
        System.out.println(this.mensajePrivado);
    }
}

