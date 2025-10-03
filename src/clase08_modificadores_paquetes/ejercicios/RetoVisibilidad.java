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

/**
 * Reto Visibilidad
 * ----------------------------------------
 * Instrucciones:
 * 1. Crea una clase con atributos de distintos modificadores.
 * 2. Crea otra clase en el mismo paquete e intenta acceder a ellos.
 * 3. Explica cuáles son accesibles y por qué.
 */
public class RetoVisibilidad {
    public String pub = "público";
    protected String pro = "protegido";
    String def = "default";
    private final String pri = "privado";

    public static void main(String[] args) {
        RetoVisibilidad obj = new RetoVisibilidad();
        System.out.println("Accediendo desde la misma clase:");
        System.out.println(obj.pub);
        System.out.println(obj.pro);
        System.out.println(obj.def);
        System.out.println(obj.pri);
    }
}
