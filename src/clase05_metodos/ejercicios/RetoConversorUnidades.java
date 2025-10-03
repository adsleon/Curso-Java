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

package clase05_metodos.ejercicios;

/**
 * Reto Conversor de Unidades
 * ----------------------------------------
 * Instrucciones:
 * 1. Crea métodos estáticos para convertir:
 *    - Kilómetros a millas
 *    - Grados Celsius a Fahrenheit
 * 2. Llama a los métodos desde main sin crear objeto.
 */
public class RetoConversorUnidades {

    public static double kilometrosAMillas(double km) {
        return km * 0.621371;
    }

    public static double celsiusAFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double km = 10;
        double c = 25;

        System.out.println(km + " km = " + kilometrosAMillas(km) + " millas");
        System.out.println(c + " °C = " + celsiusAFahrenheit(c) + " °F");
    }
}
