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

package clase06_poo.explicativos;

import java.util.Objects;

/**
 * Coche Completo
 * ----------------------------------------
 * Ejemplo con:
 * - Constructores
 * - Getters y Setters
 * - toString()
 * - equals() y hashCode()
 */
public class CocheCompleto {
    // Atributos privados (encapsulación)
    private String marca;
    private String modelo;
    private int velocidad;

    // Constructor sin parámetros
    public CocheCompleto() {
        this.setMarca("Desconocido");
        this.setModelo("Generico");
        this.setVelocidad(0);
    }

    // Constructor con parámetros
    public CocheCompleto(String marca, String modelo, int velocidad) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVelocidad(velocidad);
    }

    // Getters y Setters
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    // Métodos
    public void acelerar(int incremento) {
        this.setVelocidad(this.getVelocidad() + incremento);
        System.out.println(this.marca + " " + this.modelo + " ahora va a " + this.velocidad + " km/h");
    }

    public void frenar(int decremento) {
        this.velocidad -= decremento;
        if (this.velocidad < 0) this.velocidad = 0;
        System.out.println(this.marca + " " + this.modelo + " frenó a " + this.velocidad + " km/h");
    }

    // Sobreescribir toString
    @Override
    public String toString() {
        return "Coche [marca=" + this.marca + ", modelo=" + this.modelo + ", velocidad=" + this.velocidad + "]";
    }

    // equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CocheCompleto)) return false;
        CocheCompleto coche = (CocheCompleto) o;
        return this.velocidad == coche.velocidad &&
                Objects.equals(this.marca, coche.marca) &&
                Objects.equals(this.modelo, coche.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.marca, this.modelo, this.velocidad);
    }

    public static void main(String[] args) {
        CocheCompleto c1 = new CocheCompleto("Toyota", "Corolla", 50);
        CocheCompleto c2 = new CocheCompleto("Toyota", "Corolla", 50);

        System.out.println(c1);
        System.out.println("¿Son iguales? " + c1.equals(c2));
    }
}
