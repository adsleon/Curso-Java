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

package es.ads.cursojava.clase02.variables.explicativos;/*
 * Copyright (c) 2025 Rubén Bécares Álvarez
 *
 * Licencia: CC BY-NC 4.0
 * Uso permitido solo para fines personales o educativos.
 * Prohibido el uso comercial sin autorización expresa del autor.
 * Última modificación: 30/9/2025
 *
 *
 */

/**
 *   Comparación de formas de concatenar Strings en Java
 * ========================================================================
 * | Método            | Ejemplo                           | Ventajas                   | Desventajas                 | Cuándo usarlo                  |
 * |-------------------|-----------------------------------|----------------------------|-----------------------------|--------------------------------|
 * | Operador +        | "Hola " + nombre                  | Legible y simple           | Ineficiente en bucles       | Ejemplos rápidos, impresión    |
 * | .concat()         | "Hola ".concat(nombre)            | Explícito como método      | Solo Strings (no int, etc.) | Cuando se quiere mostrar que   |
 * |                   |                                   | Encadenable                | Menos legible que +         | String es un objeto            |
 * | StringBuilder     | sb.append("Hola ").append(nombre) | Muy eficiente en bucles    | Sintaxis más extensa        | Concatenar muchos Strings      |
 * |                   |                                   | Métodos útiles extra       | No thread-safe              | Dinámicos o en ciclos grandes  |
 * | StringBuffer      | sbuf.append("Hola ").append(n)    | Thread-safe (multihilo)    | Más lento que StringBuilder | Concatenación en entornos      |
 * |                   |                                   |                            |                             | con múltiples hilos            |
 * ========================================================================
 *
 *   Conclusión:
 * - Usa + cuando sean pocas concatenaciones y busques simplicidad.
 * - Usa .concat() si quieres ser explícito sobre los objetos String.
 * - Usa StringBuilder para bucles o concatenaciones extensas.
 * - Usa StringBuffer en entornos multihilo.
 */

public class ComparacionConcatenacion {
    public static void main(String[] args) {
        String nombre = "Ana";
        int repeticiones = 10000;

        // 1. Concatenación con +
        String resultado1 = "";
        for (int i = 0; i < repeticiones; i++) {
            resultado1 += nombre; // Genera muchos objetos intermedios
        }

        // 2. Concatenación con concat()
        String resultado2 = "";
        for (int i = 0; i < repeticiones; i++) {
            resultado2 = resultado2.concat(nombre); // Ineficiente también
        }

        // 3. Concatenación con StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeticiones; i++) {
            sb.append(nombre); // Mucho más eficiente
        }
        String resultado3 = sb.toString();

        // 4. Concatenación con StringBuffer (multihilo seguro)
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < repeticiones; i++) {
            sbuf.append(nombre);
        }
        String resultado4 = sbuf.toString();

        System.out.println("Ejemplo terminado. Se han concatenado " + repeticiones + " veces la palabra '" + nombre + "'.");
    }
}

