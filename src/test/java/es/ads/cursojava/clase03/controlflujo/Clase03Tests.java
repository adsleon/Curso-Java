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

package es.ads.cursojava.clase03.controlflujo;


import es.ads.cursojava.clase03.controlflujo.enunciados.Clase03Enunciados;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Clase03Tests {

    final Clase03Enunciados ejercicios = new Clase03Enunciados();

    // ================================
    // A. Condicionales simples (if / else)
    // ================================
    @Test
    public void testEjercicio1() {
        assertEquals("Positivo", ejercicios.ejercicio1(10));
    }

    @Test
    public void testEjercicio2() {
        assertEquals("Par", ejercicios.ejercicio2(8));
    }

    @Test
    public void testEjercicio3() {
        assertEquals("Mayor de edad", ejercicios.ejercicio3(20));
    }

    @Test
    public void testEjercicio4() {
        assertEquals(8, ejercicios.ejercicio4(5, 8));
    }

    @Test
    public void testEjercicio5() {
        assertEquals(3, ejercicios.ejercicio5(3, 10));
    }

    @Test
    public void testEjercicio6() {
        assertEquals("Aprobado", ejercicios.ejercicio6(5.5));
    }

    @Test
    public void testEjercicio7() {
        assertEquals("Cero", ejercicios.ejercicio7(0));
    }

    @Test
    public void testEjercicio8() {
        assertEquals("Múltiplo de 3", ejercicios.ejercicio8(9));
    }

    @Test
    public void testEjercicio9() {
        assertTrue(ejercicios.ejercicio9(20));
    }

    @Test
    public void testEjercicio10() {
        assertEquals("Número dentro de rango", ejercicios.ejercicio10(5));
    }

    // ================================
    // B. Condicionales compuestos (if / else if / else)
    // ================================
    @Test
    public void testEjercicio11() {
        assertEquals("Sobresaliente", ejercicios.ejercicio11(9.5));
    }

    @Test
    public void testEjercicio12() {
        assertEquals(9, ejercicios.ejercicio12(3, 9, 5));
    }

    @Test
    public void testEjercicio13() {
        assertEquals("Negativo", ejercicios.ejercicio13(-5));
    }

    @Test
    public void testEjercicio14() {
        assertEquals("Adolescente", ejercicios.ejercicio14(15));
    }

    @Test
    public void testEjercicio15() {
        assertEquals("Divisible entre 2 y 3", ejercicios.ejercicio15(6));
    }

    @Test
    public void testEjercicio16() {
        assertTrue(ejercicios.ejercicio16(2024));
    }

    @Test
    public void testEjercicio17() {
        assertEquals("Capricornio", ejercicios.ejercicio17(1));
    }

    @Test
    public void testEjercicio18() {
        assertEquals("Vocal", ejercicios.ejercicio18('a'));
    }

    @Test
    public void testEjercicio19() {
        assertTrue(ejercicios.ejercicio19("admin123"));
    }

    @Test
    public void testEjercicio20() {
        assertEquals("Dentro del rango", ejercicios.ejercicio20(150));
    }

    // ================================
    // C. Switch
    // ================================
    @Test
    public void testEjercicio21() {
        assertEquals("Lunes", ejercicios.ejercicio21(1));
    }

    @Test
    public void testEjercicio22() {
        assertEquals("Enero", ejercicios.ejercicio22(1));
    }

    @Test
    public void testEjercicio23() {
        assertEquals("Círculo", ejercicios.ejercicio23(1));
    }

    @Test
    public void testEjercicio24() {
        assertEquals("Vocal", ejercicios.ejercicio24('e'));
    }

    @Test
    public void testEjercicio25() {
        assertEquals("Aprobado", ejercicios.ejercicio25('B'));
    }

    // ================================
    // D. Bucles for
    // ================================
    @Test
    public void testEjercicio26() {
        assertEquals(55, ejercicios.ejercicio26());
    }

    @Test
    public void testEjercicio27() {
        assertEquals(30, ejercicios.ejercicio27());
    }

    @Test
    public void testEjercicio28() {
        assertEquals(10, ejercicios.ejercicio28());
    }

    @Test
    public void testEjercicio29() {
        assertEquals(120, ejercicios.ejercicio29(5));
    }

    @Test
    public void testEjercicio30() {
        assertEquals("12345", ejercicios.ejercicio30());
    }

    @Test
    public void testEjercicio31() {
        assertEquals(9, ejercicios.ejercicio31(6));
    }

    @Test
    public void testEjercicio32() {
        assertEquals(3, ejercicios.ejercicio32("Hola Java"));
    }

    @Test
    public void testEjercicio33() {
        assertEquals(8, ejercicios.ejercicio33(2, 3));
    }

    @Test
    public void testEjercicio34() {
        assertEquals(45, ejercicios.ejercicio34(5));
    }

    @Test
    public void testEjercicio35() {
        assertEquals(78, ejercicios.ejercicio35(20));
    }

    // ================================
    // E. Bucles while
    // ================================
    @Test
    public void testEjercicio36() {
        assertEquals(15, ejercicios.ejercicio36());
    }

    @Test
    public void testEjercicio37() {
        assertEquals("10987654321", ejercicios.ejercicio37());
    }

    @Test
    public void testEjercicio38() {
        assertEquals(6, ejercicios.ejercicio38(123));
    }

    @Test
    public void testEjercicio39() {
        assertEquals(321, ejercicios.ejercicio39(123));
    }

    @Test
    public void testEjercicio40() {
        assertEquals(8, ejercicios.ejercicio40(4));
    }

    // ================================
    // F. Bucles do-while
    // ================================
    @Test
    public void testEjercicio41() {
        assertTrue(ejercicios.ejercicio41() > 50);
    }

    @Test
    public void testEjercicio42() {
        assertEquals("12345", ejercicios.ejercicio42());
    }

    @Test
    public void testEjercicio43() {
        assertEquals(3, ejercicios.ejercicio43(789));
    }

    @Test
    public void testEjercicio44() {
        assertEquals(14, ejercicios.ejercicio44());
    }

    @Test
    public void testEjercicio45() {
        assertEquals(99, ejercicios.ejercicio45());
    }

    // ================================
    // G. Control con break y continue
    // ================================
    @Test
    public void testEjercicio46() {
        assertEquals(15, ejercicios.ejercicio46());
    }

    @Test
    public void testEjercicio47() {
        assertEquals(30, ejercicios.ejercicio47());
    }

    @Test
    public void testEjercicio48() {
        assertEquals(13, ejercicios.ejercicio48());
    }

    @Test
    public void testEjercicio49() {
        assertEquals(13, ejercicios.ejercicio49());
    }

    @Test
    public void testEjercicio50() {
        assertEquals(14, ejercicios.ejercicio50());
    }
}
