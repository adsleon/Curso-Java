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

import java.util.ArrayList;

/**
 * Reto Figura Polimorfismo
 * ----------------------------------------
 * Instrucciones:
 * 1. Usa una lista de tipo Figura.
 * 2. Añade objetos de distintas subclases.
 * 3. Recorre la lista mostrando el área de cada figura.
 */
abstract class FiguraAvanzada {
    public abstract double area();
}

class Circulo extends FiguraAvanzada {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * this.radio * this.radio;
    }
}

class Triangulo extends FiguraAvanzada {
    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (this.base * this.altura) / 2;
    }
}

public class RetoFiguraPolimorfismo {
    public static void main(String[] args) {
        ArrayList<FiguraAvanzada> figuras = new ArrayList<>();
        figuras.add(new Circulo(3));
        figuras.add(new Triangulo(4, 6));

        for (FiguraAvanzada f : figuras) {
            System.out.println("Área: " + f.area());
        }
    }
}
