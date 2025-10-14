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

package es.ads.cursojava.clase02.variables;


import es.ads.cursojava.clase02.variables.enunciados.Clase02Enunciados;
import org.junit.Test;

import static org.junit.Assert.*;

public class Clase02Tests {

    final Clase02Enunciados ejercicios = new Clase02Enunciados();

    // ================================
    // A. Tipos de variables
    // ================================
    @Test
    public void testEjercicio1() {
        assertEquals(20, ejercicios.ejercicio1());
    }

    @Test
    public void testEjercicio2() {
        assertEquals(1.75, ejercicios.ejercicio2(), 0);
    }

    @Test
    public void testEjercicio3() {
        assertEquals('J', ejercicios.ejercicio3());
    }

    @Test
    public void testEjercicio4() {
        assertTrue(ejercicios.ejercicio4());
    }

    @Test
    public void testEjercicio5() {
        assertEquals("Juan Perez", ejercicios.ejercicio5());
    }

    @Test
    public void testEjercicio6() {
        assertEquals(3.1416, ejercicios.ejercicio6(), 0);
    }

    @Test
    public void testEjercicio7() {
        assertEquals(8000000000L, ejercicios.ejercicio7());
    }

    @Test
    public void testEjercicio8() {
        assertEquals(25.50f, ejercicios.ejercicio8(), 0);
    }

    @Test
    public void testEjercicio9() {
        assertEquals(1995, ejercicios.ejercicio9());
    }

    @Test
    public void testEjercicio10() {
        assertEquals(120, ejercicios.ejercicio10());
    }

    // ================================
    // B. Casteo
    // ================================
    @Test
    public void testEjercicio11() {
        assertEquals(9, ejercicios.ejercicio11(9.7));
    }

    @Test
    public void testEjercicio12() {
        assertEquals(15.0, ejercicios.ejercicio12(15), 0);
    }

    @Test
    public void testEjercicio13() {
        assertEquals(8, ejercicios.ejercicio13(8.99f));
    }

    @Test
    public void testEjercicio14() {
        assertEquals(65, ejercicios.ejercicio14('A'));
    }

    @Test
    public void testEjercicio15() {
        assertEquals('A', ejercicios.ejercicio15(65));
    }

    @Test
    public void testEjercicio16() {
        assertEquals(100, ejercicios.ejercicio16(100L));
    }

    @Test
    public void testEjercicio17() {
        assertEquals("3.14", ejercicios.ejercicio17(3.14));
    }

    @Test
    public void testEjercicio18() {
        assertEquals("true", ejercicios.ejercicio18(true));
    }

    @Test
    public void testEjercicio19() {
        assertTrue(ejercicios.ejercicio19("true"));
    }

    @Test
    public void testEjercicio20() {
        assertEquals("123", ejercicios.ejercicio20(123));
    }

    // ================================
    // C. Strings
    // ================================
    @Test
    public void testEjercicio21() {
        assertEquals(4, ejercicios.ejercicio21("Jose"));
    }

    @Test
    public void testEjercicio22() {
        assertEquals("JAVA", ejercicios.ejercicio22("java"));
    }

    @Test
    public void testEjercicio23() {
        assertEquals("java", ejercicios.ejercicio23("JAVA"));
    }

    @Test
    public void testEjercicio24() {
        assertEquals("HolaMundo", ejercicios.ejercicio24("Hola", "Mundo"));
    }

    @Test
    public void testEjercicio25() {
        assertEquals("HolaMundo", ejercicios.ejercicio25("Hola", "Mundo"));
    }

    @Test
    public void testEjercicio26() {
        assertEquals("Pro", ejercicios.ejercicio26("Programacion"));
    }

    @Test
    public void testEjercicio27() {
        assertEquals(1, ejercicios.ejercicio27("Java"));
    }

    @Test
    public void testEjercicio28() {
        assertTrue(ejercicios.ejercicio28("Me gusta Java"));
    }

    @Test
    public void testEjercicio29() {
        assertEquals("Hola Java", ejercicios.ejercicio29("Hola mundo"));
    }

    @Test
    public void testEjercicio30() {
        assertTrue(ejercicios.ejercicio30("Java", "Java"));
    }

    // ================================
    // D. Operadores aritméticos
    // ================================
    @Test
    public void testEjercicio31() {
        assertEquals(13, ejercicios.ejercicio31(10, 3));
    }

    @Test
    public void testEjercicio32() {
        assertEquals(7, ejercicios.ejercicio32(10, 3));
    }

    @Test
    public void testEjercicio33() {
        assertEquals(30, ejercicios.ejercicio33(10, 3));
    }

    @Test
    public void testEjercicio34() {
        assertEquals(3, ejercicios.ejercicio34(10, 3));
    }

    @Test
    public void testEjercicio35() {
        assertEquals(1, ejercicios.ejercicio35(10, 3));
    }

    @Test
    public void testEjercicio36() {
        assertEquals(11, ejercicios.ejercicio36(10));
    }

    @Test
    public void testEjercicio37() {
        assertEquals(2, ejercicios.ejercicio37(3));
    }

    @Test
    public void testEjercicio38() {
        assertEquals(100, ejercicios.ejercicio38(10));
    }

    @Test
    public void testEjercicio39() {
        assertEquals(27, ejercicios.ejercicio39(3));
    }

    @Test
    public void testEjercicio40() {
        assertEquals(6.5, ejercicios.ejercicio40(10, 3), 0);
    }

    // ================================
    // E. Operadores lógicos y relacionales
    // ================================
    @Test
    public void testEjercicio41() {
        assertTrue(ejercicios.ejercicio41());
    }

    @Test
    public void testEjercicio42() {
        assertFalse(ejercicios.ejercicio42());
    }

    @Test
    public void testEjercicio43() {
        assertTrue(ejercicios.ejercicio43());
    }

    @Test
    public void testEjercicio44() {
        assertTrue(ejercicios.ejercicio44());
    }

    @Test
    public void testEjercicio45() {
        assertTrue(ejercicios.ejercicio45());
    }

    @Test
    public void testEjercicio46() {
        assertTrue(ejercicios.ejercicio46());
    }

    @Test
    public void testEjercicio47() {
        assertTrue(ejercicios.ejercicio47(12));
    }

    @Test
    public void testEjercicio48() {
        assertTrue(ejercicios.ejercicio48(7));
    }

    @Test
    public void testEjercicio49() {
        assertFalse(ejercicios.ejercicio49(true));
    }

    @Test
    public void testEjercicio50() {
        assertEquals("Positivo", ejercicios.ejercicio50(10));
    }
}

