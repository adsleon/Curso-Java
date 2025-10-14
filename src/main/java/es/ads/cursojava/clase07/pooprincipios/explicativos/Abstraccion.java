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

package es.ads.cursojava.clase07.pooprincipios.explicativos;

/**
 * Principio de Abstracción
 * ----------------------------------------
 * Nos permite centrarnos en lo esencial y ocultar los detalles.
 */
abstract class Vehiculo {
    String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // Método abstracto: no tiene implementación aquí
    public abstract void mover();
}

class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }

    @Override
    public void mover() {
        System.out.println("El coche " + this.marca + " se mueve sobre 4 ruedas 🚗");
    }
}

public class Abstraccion {
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche("Toyota");
        miCoche.mover();
    }
}
