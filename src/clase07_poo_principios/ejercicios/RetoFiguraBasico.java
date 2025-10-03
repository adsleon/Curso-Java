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

package clase07_poo_principios.ejercicios;

/**
 * Reto Figura Básico
 * ----------------------------------------
 * Instrucciones:
 * 1. Crea una clase Figura con un método area().
 * 2. Crea dos subclases: Cuadrado y Rectangulo.
 * 3. Sobrescribe el método area() en cada subclase.
 */
abstract class Figura {
    public abstract double area();
}

class Cuadrado extends Figura {
    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return this.lado * this.lado;
    }
}

class Rectangulo extends Figura {
    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }
}

public class RetoFiguraBasico {
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado(4);
        Rectangulo r = new Rectangulo(5, 3);

        System.out.println("Área del cuadrado: " + c.area());
        System.out.println("Área del rectángulo: " + r.area());
    }
}
