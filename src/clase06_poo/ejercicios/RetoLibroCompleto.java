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

import java.util.Objects;

/**
 * Reto Libro Completo
 * ----------------------------------------
 * Instrucciones:
 * 1. Implementa atributos privados título, autor y páginas.
 * 2. Crea constructores (sin parámetros y con parámetros).
 * 3. Añade getters y setters.
 * 4. Sobreescribe toString(), equals() y hashCode().
 */
public class RetoLibroCompleto {
    private String titulo;
    private String autor;
    private int paginas;

    // Constructor sin parámetros
    public RetoLibroCompleto() {
        this.titulo = "Sin título";
        this.autor = "Desconocido";
        this.paginas = 0;
    }

    // Constructor con parámetros
    public RetoLibroCompleto(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Getters y Setters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    // toString
    @Override
    public String toString() {
        return "Libro [titulo=" + this.titulo + ", autor=" + this.autor + ", páginas=" + this.paginas + "]";
    }

    // equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RetoLibroCompleto)) return false;
        RetoLibroCompleto libro = (RetoLibroCompleto) o;
        return this.paginas == libro.paginas &&
                Objects.equals(this.titulo, libro.titulo) &&
                Objects.equals(this.autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.titulo, this.autor, this.paginas);
    }

    public static void main(String[] args) {
        RetoLibroCompleto libro1 = new RetoLibroCompleto("1984", "George Orwell", 328);
        RetoLibroCompleto libro2 = new RetoLibroCompleto("1984", "George Orwell", 328);

        System.out.println(libro1);
        System.out.println("¿Son iguales? " + libro1.equals(libro2));
    }
}
