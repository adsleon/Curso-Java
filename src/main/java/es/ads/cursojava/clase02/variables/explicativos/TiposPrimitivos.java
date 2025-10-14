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
 * Tipos de datos primitivos en Java
 * ----------------------------------------
 * Java tiene 8 tipos primitivos, que ocupan
 * diferente memoria y sirven para distintos casos.
 *
 * ENTEROS:
 * - byte  (8 bits = 1 byte)   Rango: -128 a 127
 *   Uso: cuando se necesitan números pequeños, ahorro de memoria.
 *
 * - short (16 bits = 2 bytes) Rango: -32,768 a 32,767
 *   Uso: para números enteros medianos (ej. sensores).
 *
 * - int   (32 bits = 4 bytes) Rango: -2,147,483,648 a 2,147,483,647
 *   Uso: valor por defecto para enteros.
 *
 * - long  (64 bits = 8 bytes) Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
 *   Uso: números muy grandes (ej. población mundial).
 *
 * DECIMALES:
 * - float  (32 bits = 4 bytes)  Precisión: ~7 decimales
 *   Uso: cuando se necesita ahorrar memoria en decimales.
 *
 * - double (64 bits = 8 bytes)  Precisión: ~15 decimales
 *   Uso: valor por defecto para decimales.
 *
 * OTROS:
 * - char   (16 bits = 2 bytes) Representa un único carácter Unicode.
 *   Uso: letras, símbolos, etc.
 *
 * - boolean (1 bit, depende de implementación) Valores: true / false
 *   Uso: lógica booleana (condiciones, banderas).
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        // Enteros
        byte miByte = 120;
        short miShort = 30000;
        int miInt = 2000000000;
        long miLong = 15000000000L; // nota la "L" al final

        // Decimales
        float miFloat = 3.1416f;    // nota la "f" al final
        double miDouble = 2.718281828459045d;   // nota la "d" al final

        // Otros
        char miChar = 'J';
        boolean miBoolean = true;

        // Mostrar resultados
        System.out.println("byte: " + miByte);
        System.out.println("short: " + miShort);
        System.out.println("int: " + miInt);
        System.out.println("long: " + miLong);
        System.out.println("float: " + miFloat);
        System.out.println("double: " + miDouble);
        System.out.println("char: " + miChar);
        System.out.println("boolean: " + miBoolean);
    }
}
