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

package es.ads.cursojava.clase05.metodos.enunciados;

public class Clase05Enunciados {

    // ======================================
    // A. MÉTODOS BÁSICOS
    // ======================================

    // 1. Crea un método que devuelva el texto "Hola Mundo"
    public String ejercicio1() {
        return "";
    }

    // 2. Crea un método que devuelva Tu Nombre
    public String ejercicio2() {
        return "";
    }

    // 3. Crea un método que devuelva la suma de 5 + 3
    public int ejercicio3() {
        return 0;
    }

    // 4. Crea un método que devuelva true
    public boolean ejercicio4() {
        return false;
    }

    // 5. Crea un método que calcule el cuadrado de 10
    public int ejercicio5() {
        return 0;
    }

    // 6. Crea un método que devuelva la primera letra de "Java"
    public char ejercicio6() {
        return ' ';
    }

    // 7. Crea un método que concatene "Hola" y "Java"
    public String ejercicio7() {
        return "";
    }

    // 8. Crea un método que devuelva el resultado de 8 dividido 2
    public int ejercicio8() {
        return 0;
    }

    // 9. Crea un método que devuelva la suma de los primeros 5 números naturales
    public int ejercicio9() {
        return 0;
    }

    // 10. Crea un método que devuelva la cadena "Método básico completado"
    public String ejercicio10() {
        return "";
    }

    // ======================================
    // B. MÉTODOS CON PARÁMETROS
    // ======================================

    // 11. Recibe dos números enteros y devuelve su suma
    public int ejercicio11(int a, int b) {
        return 0;
    }

    // 12. Recibe dos números y devuelve su resta
    public int ejercicio12(int a, int b) {
        return 0;
    }

    // 13. Recibe dos números y devuelve su multiplicación
    public int ejercicio13(int a, int b) {
        return 0;
    }

    // 14. Recibe dos números y devuelve la división entera
    public int ejercicio14(int a, int b) {
        return 0;
    }

    // 15. Recibe una cadena y devuelve su longitud
    public int ejercicio15(String texto) {
        return 0;
    }

    // 16. Recibe una cadena y devuelve su versión en mayúsculas
    public String ejercicio16(String texto) {
        return "";
    }

    // 17. Recibe un número y devuelve true si es par
    public boolean ejercicio17(int numero) {
        return false;
    }

    // 18. Recibe un número y devuelve su valor absoluto
    public int ejercicio18(int numero) {
        return 0;
    }

    // 19. Recibe un nombre y un apellido y los concatena con un espacio
    public String ejercicio19(String nombre, String apellido) {
        return "";
    }

    // 20. Recibe un boolean y devuelve su negación
    public boolean ejercicio20(boolean valor) {
        return false;
    }

    // ======================================
    // C. MÉTODOS AVANZADOS
    // ======================================

    // 21. Crea un método que reciba un número y calcule su factorial
    public int ejercicio21(int n) {
        return 0;
    }

    // 22. Crea un método que devuelva true si el número es primo
    public boolean ejercicio22(int n) {
        return false;
    }

    // 23. Crea un método que calcule el n-ésimo número de Fibonacci
    public int ejercicio23(int n) {
        return 0;
    }

    // 24. Crea un método recursivo que calcule la suma de los números del 1 al n
    public int ejercicio24(int n) {
        return 0;
    }

    // 25. Crea un método que reciba un array y devuelva su suma total
    public int ejercicio25(int[] numeros) {
        return 0;
    }

    // 26. Crea un método que reciba una lista de Strings y devuelva la concatenación de todas
    public String ejercicio26(String[] palabras) {
        return "";
    }

    // 27. Crea un método sobrecargado que reciba dos enteros o tres enteros y devuelva la suma
    public int ejercicio27(int a, int b) {
        return 0;
    }
    public int ejercicio27(int a, int b, int c) {
        return 0;
    }

    // 28. Crea un método que devuelva el número mayor entre tres valores
    public int ejercicio28(int a, int b, int c) {
        return 0;
    }

    // 29. Crea un método que reciba un número y devuelva su cuadrado usando Math.pow
    public double ejercicio29(int n) {
        return 0.0;
    }

    // 30. Crea un método que reciba un número y devuelva true si está entre 10 y 20
    public boolean ejercicio30(int n) {
        return false;
    }

    // ======================================
    // D. MÉTODOS CON OBJETOS
    // ======================================

    public static class Persona {
        String nombre;
        int edad;
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }

    // 31. Recibe una Persona y devuelve su nombre
    public String ejercicio31(Persona p) {
        return "";
    }

    // 32. Recibe una Persona y devuelve su edad
    public int ejercicio32(Persona p) {
        return 0;
    }

    // 33. Recibe dos Personas y devuelve el nombre del mayor
    public String ejercicio33(Persona p1, Persona p2) {
        return "";
    }

    // 34. Recibe un array de Personas y devuelve la edad promedio
    public double ejercicio34(Persona[] personas) {
        return 0.0;
    }

    // 35. Recibe un array de Personas y devuelve el nombre más corto
    public String ejercicio35(Persona[] personas) {
        return "";
    }

    // 36. Recibe un array de Personas y devuelve true si todas son mayores de edad
    public boolean ejercicio36(Persona[] personas) {
        return false;
    }

    // 37. Recibe una Persona y una edad extra y devuelve una nueva Persona con edad incrementada
    public Persona ejercicio37(Persona p, int extra) {
        return null;
    }

    // 38. Recibe una Persona y devuelve un mensaje del tipo “Hola, <nombre>”
    public String ejercicio38(Persona p) {
        return "";
    }

    // 39. Crea un método que reciba una Persona y devuelva true si su nombre contiene la letra ‘a’
    public boolean ejercicio39(Persona p) {
        return false;
    }

    // 40. Crea un método que reciba dos Personas y devuelva una nueva con el nombre combinado
    public Persona ejercicio40(Persona p1, Persona p2) {
        return null;
    }

    // ======================================
    // E. RETOS COMBINADOS
    // ======================================

    // 41. Crea un método que reciba un número y devuelva una cadena con todos los números del 1 al n separados por comas
    public String ejercicio41(int n) {
        return "";
    }

    // 42. Crea un método que reciba un texto y devuelva cuántas vocales contiene
    public int ejercicio42(String texto) {
        return 0;
    }

    // 43. Crea un método que reciba un número y devuelva si es múltiplo de 3 y 5
    public boolean ejercicio43(int n) {
        return false;
    }

    // 44. Crea un método que reciba un array y devuelva el promedio de los valores pares
    public double ejercicio44(int[] numeros) {
        return 0.0;
    }

    // 45. Crea un método que reciba una cadena y devuelva la misma al revés
    public String ejercicio45(String texto) {
        return "";
    }

    // 46. Crea un método recursivo que cuente cuántas veces aparece un carácter en un String
    public int ejercicio46(String texto, char c) {
        return 0;
    }

    // 47. Crea un método que reciba un array y devuelva el mayor valor sin usar bucles for
    public int ejercicio47(int[] numeros) {
        return 0;
    }

    // 48. Crea un método que reciba dos números y devuelva un texto con el resultado de su suma, resta, multiplicación y división
    public String ejercicio48(int a, int b) {
        return "";
    }

    // 49. Crea un método que reciba un número y devuelva su representación binaria
    public String ejercicio49(int n) {
        return "";
    }

    // 50. Crea un método que reciba una cadena y devuelva true si es un palíndromo
    public boolean ejercicio50(String texto) {
        return false;
    }
}
