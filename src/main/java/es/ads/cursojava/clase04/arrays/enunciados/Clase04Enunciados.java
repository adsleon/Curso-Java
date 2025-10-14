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

package es.ads.cursojava.clase04.arrays.enunciados;

public class Clase04Enunciados {

    // ======================================
    // A. ARRAYS SIMPLES
    // ======================================

    // 1. Crea un array de 5 enteros y devuelve la suma de sus elementos
    public int ejercicio1(int[] numeros) {
        return 0;
    }

    // 2. Devuelve el mayor valor en un array de enteros
    public int ejercicio2(int[] numeros) {
        return 0;
    }

    // 3. Devuelve el menor valor en un array de enteros
    public int ejercicio3(int[] numeros) {
        return 0;
    }

    // 4. Devuelve la media de los valores del array
    public double ejercicio4(int[] numeros) {
        return 0.0;
    }

    // 5. Cuenta cuántos números pares hay en un array
    public int ejercicio5(int[] numeros) {
        return 0;
    }

    // 6. Cuenta cuántos números impares hay en un array
    public int ejercicio6(int[] numeros) {
        return 0;
    }

    // 7. Devuelve un nuevo array con los elementos multiplicados por 2
    public int[] ejercicio7(int[] numeros) {
        return null;
    }

    // 8. Devuelve la cantidad de veces que aparece un número específico
    public int ejercicio8(int[] numeros, int buscado) {
        return 0;
    }

    // 9. Devuelve true si todos los elementos son positivos
    public boolean ejercicio9(int[] numeros) {
        return false;
    }

    // 10. Devuelve true si el array está ordenado de forma ascendente
    public boolean ejercicio10(int[] numeros) {
        return false;
    }

    // ======================================
    // B. STRINGS EN ARRAYS
    // ======================================

    // 11. Devuelve el número total de caracteres de todas las palabras
    public int ejercicio11(String[] palabras) {
        return 0;
    }

    // 12. Devuelve la palabra más larga
    public String ejercicio12(String[] palabras) {
        return "";
    }

    // 13. Devuelve la palabra más corta
    public String ejercicio13(String[] palabras) {
        return "";
    }

    // 14. Devuelve cuántas palabras comienzan con vocal
    public int ejercicio14(String[] palabras) {
        return 0;
    }

    // 15. Devuelve un String con todas las palabras concatenadas separadas por comas
    public String ejercicio15(String[] palabras) {
        return "";
    }

    // 16. Devuelve true si una palabra específica está en el array
    public boolean ejercicio16(String[] palabras, String buscada) {
        return false;
    }

    // 17. Devuelve un nuevo array con todas las palabras en mayúsculas
    public String[] ejercicio17(String[] palabras) {
        return null;
    }

    // 18. Devuelve el índice de la primera ocurrencia de una palabra
    public int ejercicio18(String[] palabras, String buscada) {
        return -1;
    }

    // 19. Devuelve el número de palabras que tienen más de 5 letras
    public int ejercicio19(String[] palabras) {
        return 0;
    }

    // 20. Devuelve una cadena con las palabras que terminan en vocal
    public String ejercicio20(String[] palabras) {
        return "";
    }

    // ======================================
    // C. ARRAYS BIDIMENSIONALES
    // ======================================

    // 21. Suma todos los elementos de una matriz 2x2
    public int ejercicio21(int[][] matriz) {
        return 0;
    }

    // 22. Devuelve la suma de cada fila de una matriz
    public int[] ejercicio22(int[][] matriz) {
        return null;
    }

    // 23. Devuelve la suma de cada columna de una matriz
    public int[] ejercicio23(int[][] matriz) {
        return null;
    }

    // 24. Devuelve el valor máximo de la matriz
    public int ejercicio24(int[][] matriz) {
        return 0;
    }

    // 25. Devuelve el valor mínimo de la matriz
    public int ejercicio25(int[][] matriz) {
        return 0;
    }

    // 26. Devuelve la suma de los elementos de la diagonal principal
    public int ejercicio26(int[][] matriz) {
        return 0;
    }

    // 27. Devuelve la suma de la diagonal secundaria
    public int ejercicio27(int[][] matriz) {
        return 0;
    }

    // 28. Devuelve true si la matriz es cuadrada
    public boolean ejercicio28(int[][] matriz) {
        return false;
    }

    // 29. Devuelve una nueva matriz traspuesta
    public int[][] ejercicio29(int[][] matriz) {
        return null;
    }

    // 30. Devuelve la matriz invertida (cada fila al revés)
    public int[][] ejercicio30(int[][] matriz) {
        return null;
    }

    // ======================================
    // D. ARRAYS DE OBJETOS
    // ======================================

    // Clase auxiliar interna para pruebas
    public static class Persona {
        public String nombre;
        public int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }

    // 31. Devuelve la suma de las edades de todas las personas
    public int ejercicio31(Persona[] personas) {
        return 0;
    }

    // 32. Devuelve el nombre de la persona más joven
    public String ejercicio32(Persona[] personas) {
        return "";
    }

    // 33. Devuelve el nombre de la persona más mayor
    public String ejercicio33(Persona[] personas) {
        return "";
    }

    // 34. Devuelve el promedio de edad
    public double ejercicio34(Persona[] personas) {
        return 0.0;
    }

    // 35. Devuelve cuántas personas son mayores de 18
    public int ejercicio35(Persona[] personas) {
        return 0;
    }

    // 36. Devuelve true si hay alguna persona con nombre igual al buscado
    public boolean ejercicio36(Persona[] personas, String nombre) {
        return false;
    }

    // 37. Devuelve una cadena con los nombres de todas las personas separados por comas
    public String ejercicio37(Persona[] personas) {
        return "";
    }

    // 38. Devuelve una nueva lista de personas mayores de 30
    public Persona[] ejercicio38(Persona[] personas) {
        return null;
    }

    // 39. Devuelve la edad media de las personas cuyo nombre empieza con vocal
    public double ejercicio39(Persona[] personas) {
        return 0.0;
    }

    // 40. Devuelve la primera persona con nombre más largo de 5 letras
    public Persona ejercicio40(Persona[] personas) {
        return null;
    }

    // ======================================
    // E. COMBINADOS Y RETOS
    // ======================================

    // 41. Devuelve un nuevo array con los elementos de dos arrays concatenados
    public int[] ejercicio41(int[] a, int[] b) {
        return null;
    }

    // 42. Devuelve un array con los elementos comunes entre dos arrays
    public int[] ejercicio42(int[] a, int[] b) {
        return null;
    }

    // 43. Devuelve un array sin elementos repetidos
    public int[] ejercicio43(int[] a) {
        return null;
    }

    // 44. Devuelve true si dos arrays son iguales
    public boolean ejercicio44(int[] a, int[] b) {
        return false;
    }

    // 45. Devuelve un array invertido (de atrás hacia adelante)
    public int[] ejercicio45(int[] a) {
        return null;
    }

    // 46. Calcula el número total de elementos en una matriz 2D
    public int ejercicio46(int[][] matriz) {
        return 0;
    }

    // 47. Devuelve una matriz con los valores duplicados
    public int[][] ejercicio47(int[][] matriz) {
        return null;
    }

    // 48. Devuelve true si la matriz contiene al menos un valor negativo
    public boolean ejercicio48(int[][] matriz) {
        return false;
    }

    // 49. Devuelve el número de filas que contienen un número par
    public int ejercicio49(int[][] matriz) {
        return 0;
    }

    // 50. Devuelve la matriz con cada elemento incrementado en 1
    public int[][] ejercicio50(int[][] matriz) {
        return null;
    }
}
