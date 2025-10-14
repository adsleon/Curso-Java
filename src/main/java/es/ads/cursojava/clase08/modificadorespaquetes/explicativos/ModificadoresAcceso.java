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

package es.ads.cursojava.clase08.modificadorespaquetes.explicativos;

/**
 * Modificadores de acceso en Java
 * ----------------------------------------
 * public    -> Accesible desde cualquier parte.
 * private   -> Solo accesible dentro de la misma clase.
 * protected -> Accesible dentro del mismo paquete y subclases.
 * default   -> (sin modificador) accesible solo dentro del paquete.
 */
public class ModificadoresAcceso {
    public String atributoPublico = "Soy público";
    private final String atributoPrivado = "Soy privado";
    protected String atributoProtegido = "Soy protegido";
    String atributoDefault = "Soy default";

    public void mostrar() {
        System.out.println("Público: " + this.atributoPublico);
        System.out.println("Privado: " + this.atributoPrivado);
        System.out.println("Protegido: " + this.atributoProtegido);
        System.out.println("Default: " + this.atributoDefault);
    }

    public static void main(String[] args) {
        ModificadoresAcceso obj = new ModificadoresAcceso();
        obj.mostrar();
    }
}

