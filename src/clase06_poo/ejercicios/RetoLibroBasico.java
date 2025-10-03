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

package clase06_poo.ejercicios;

/**
 * Reto Libro Básico
 * ----------------------------------------
 * Instrucciones:
 * 1. Crea una clase con atributos título, autor y páginas (públicos).
 * 2. Añade un método mostrarInfo() que imprima los atributos.
 * 3. En main, crea dos objetos y muestra la información.
 */
public class RetoLibroBasico {
    String titulo;
    String autor;
    int paginas;

    public void mostrarInfo() {
        System.out.println("Título: " + this.titulo + " | Autor: " + this.autor + " | Páginas: " + this.paginas);
    }

    public static void main(String[] args) {
        RetoLibroBasico libro1 = new RetoLibroBasico();
        libro1.titulo = "1984";
        libro1.autor = "George Orwell";
        libro1.paginas = 328;
        libro1.mostrarInfo();

        RetoLibroBasico libro2 = new RetoLibroBasico();
        libro2.titulo = "Don Quijote";
        libro2.autor = "Miguel de Cervantes";
        libro2.paginas = 863;
        libro2.mostrarInfo();
    }
}
