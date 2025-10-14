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

package es.ads.cursojava.clase06.poo.explicativos;

/**
 * Clase CocheBasico
 * ----------------------------------------
 * Otro ejemplo de clase con atributos y métodos.
 */
public class CocheBasico {
    // Atributos
    String marca;
    String modelo;
    int velocidad;

    // Método para acelerar
    public void acelerar(int incremento) {
        this.velocidad += incremento;
        System.out.println(this.marca + " " + this.modelo + " ahora va a " + this.velocidad + " km/h");
    }

    // Método para frenar
    public void frenar(int decremento) {
        this.velocidad -= decremento;
        if (this.velocidad < 0) this.velocidad = 0;
        System.out.println(this.marca + " " + this.modelo + " frenó a " + this.velocidad + " km/h");
    }

    public static void main(String[] args) {
        CocheBasico miCoche = new CocheBasico();
        miCoche.marca = "Toyota";
        miCoche.modelo = "Corolla";
        miCoche.velocidad = 0;

        miCoche.acelerar(50);
        miCoche.frenar(20);
    }
}
