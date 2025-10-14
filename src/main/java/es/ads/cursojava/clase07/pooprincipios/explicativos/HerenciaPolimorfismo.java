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
 * Principios de Herencia y Polimorfismo
 * ----------------------------------------
 * Herencia: una clase hija reutiliza atributos y métodos de la clase padre.
 * Polimorfismo: un mismo método se comporta de manera diferente según el objeto.
 */
class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra 🐶: Guau!");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla 🐱: Miau!");
    }
}

public class HerenciaPolimorfismo {
    public static void main(String[] args) {
        Animal a1 = new Perro();
        Animal a2 = new Gato();

        a1.hacerSonido(); // Polimorfismo → se ejecuta el método del Perro
        a2.hacerSonido(); // Polimorfismo → se ejecuta el método del Gato
    }
}
