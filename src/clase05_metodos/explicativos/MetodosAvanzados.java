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

package clase05_metodos.explicativos;

/**
 * Métodos Avanzados en Java
 * ----------------------------------------
 * - Sobrecarga de métodos (overloading): varios métodos con el mismo nombre
 *   pero distintos parámetros.
 * - Métodos estáticos vs no estáticos:
 *   * static: se pueden llamar sin crear un objeto.
 *   * no static: necesitan que se cree un objeto.
 */
public class MetodosAvanzados {

    // Ejemplo de sobrecarga: método "sumar" con diferentes parámetros
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static String sumar(String a, String b) {
        return a + b;
    }

    // Método estático
    public static void metodoEstatico() {
        System.out.println("Este es un método estático. Se puede llamar sin crear objeto.");
    }

    // Método no estático
    public void metodoNoEstatico() {
        System.out.println("Este es un método NO estático. Necesita un objeto para usarse.");
    }

    public static void main(String[] args) {
        // Ejemplo de sobrecarga
        System.out.println("Suma int: " + sumar(5, 10));
        System.out.println("Suma double: " + sumar(3.5, 2.1));
        System.out.println("Suma String: " + sumar("Hola", " Mundo"));

        // Llamar a método estático
        metodoEstatico();

        // Llamar a método no estático
        MetodosAvanzados obj = new MetodosAvanzados();
        obj.metodoNoEstatico();
    }
}
