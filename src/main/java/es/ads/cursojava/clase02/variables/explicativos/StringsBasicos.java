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

package es.ads.cursojava.clase02.variables.explicativos;

/**
 * Strings en Java
 * ----------------------------------------
 * - String no es un tipo primitivo, es una clase.
 * - Se usa para representar texto (cadenas de caracteres).
 * - En Java los Strings son objetos, pero tienen soporte especial
 *   que los hace muy fáciles de usar.
 *
 * Caracteres especiales más comunes en Strings:
 * \n -> salto de línea
 * \t -> tabulación
 * \" -> comillas dobles
 * \' -> comillas simples
 * \\ -> barra invertida
 */
public class StringsBasicos {
    public static void main(String[] args) {
        // Declaración de Strings
        String nombre = "Ana";
        String saludo = "Hola";
        String frase = "Aprendiendo Java es divertido";
        String despedida1 = " Adios ";
        String despedida2 = "Adios";
        String coma = ", ";

        // Concatenación de Strings con +
        String mensaje = saludo + coma + nombre + "!";
        System.out.println(mensaje);

        // Concatenación con concat()
        String mensaje2 = saludo.concat(", ").concat(nombre).concat("!");
        System.out.println("Usando concat(): " + mensaje2);

        // Métodos útiles de la clase String
        System.out.println("Longitud de la frase: " + frase.length());
        System.out.println("En mayúsculas: " + frase.toUpperCase());
        System.out.println("En minúsculas: " + frase.toLowerCase());
        System.out.println("¿La frase contiene 'Java'? " + frase.contains("Java"));
        System.out.println("El primer carácter de 'nombre' es: " + nombre.charAt(0));
        System.out.println("¿Las despedidas son iguales? " + despedida1.equals(despedida2));
        System.out.println("¿Y si quitamos los espacios en blanco? " + despedida1.trim().equals(despedida2));

        // Ejemplo de caracteres especiales
        System.out.println("\n--- Ejemplos de caracteres especiales ---");
        System.out.println("Salto de línea:\nPrimera línea\nSegunda línea");
        System.out.println("Tabulación:\tTexto con tabulación");
        System.out.println("Comillas dobles: \"Java es genial\"");
        System.out.println("Comillas simples: 'A'");
        System.out.println("Barra invertida: C:\\Users\\Ana");
    }
}

