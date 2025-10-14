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

package es.ads.cursojava.clase05.metodos;


import es.ads.cursojava.clase05.metodos.enunciados.Clase05Enunciados;
import org.junit.Test;

import static org.junit.Assert.*;

public class Clase05Tests {

    final Clase05Enunciados ejercicios = new Clase05Enunciados();

    // ======================================
    // A. MÉTODOS BÁSICOS
    // ======================================
    final Clase05Enunciados.Persona p1 = new Clase05Enunciados.Persona("Ana", 25);
    final Clase05Enunciados.Persona p2 = new Clase05Enunciados.Persona("Luis", 40);
    final Clase05Enunciados.Persona p3 = new Clase05Enunciados.Persona("Eva", 30);
    final Clase05Enunciados.Persona[] personas = {p1, p2, p3};

    @Test
    public void testEjercicio1() {
        assertEquals("Hola Mundo", ejercicios.ejercicio1());
    }

    @Test
    public void testEjercicio2() {
        assertEquals("Tu Nombre", ejercicios.ejercicio2());
    } // El alumno puede cambiar su nombre

    @Test
    public void testEjercicio3() {
        assertEquals(8, ejercicios.ejercicio3());
    }

    @Test
    public void testEjercicio4() {
        assertTrue(ejercicios.ejercicio4());
    }

    @Test
    public void testEjercicio5() {
        assertEquals(100, ejercicios.ejercicio5());
    }

    @Test
    public void testEjercicio6() {
        assertEquals('J', ejercicios.ejercicio6());
    }

    // ======================================
    // B. MÉTODOS CON PARÁMETROS
    // ======================================

    @Test
    public void testEjercicio7() {
        assertEquals("HolaJava", ejercicios.ejercicio7());
    }

    @Test
    public void testEjercicio8() {
        assertEquals(4, ejercicios.ejercicio8());
    }

    @Test
    public void testEjercicio9() {
        assertEquals(15, ejercicios.ejercicio9());
    }

    @Test
    public void testEjercicio10() {
        assertEquals("Método básico completado", ejercicios.ejercicio10());
    }

    @Test
    public void testEjercicio11() {
        assertEquals(9, ejercicios.ejercicio11(4, 5));
    }

    @Test
    public void testEjercicio12() {
        assertEquals(3, ejercicios.ejercicio12(8, 5));
    }

    @Test
    public void testEjercicio13() {
        assertEquals(20, ejercicios.ejercicio13(4, 5));
    }

    @Test
    public void testEjercicio14() {
        assertEquals(2, ejercicios.ejercicio14(9, 4));
    }

    @Test
    public void testEjercicio15() {
        assertEquals(4, ejercicios.ejercicio15("Java"));
    }

    @Test
    public void testEjercicio16() {
        assertEquals("JAVA", ejercicios.ejercicio16("java"));
    }

    // ======================================
    // C. MÉTODOS AVANZADOS
    // ======================================

    @Test
    public void testEjercicio17() {
        assertTrue(ejercicios.ejercicio17(8));
    }

    @Test
    public void testEjercicio18() {
        assertEquals(10, ejercicios.ejercicio18(-10));
    }

    @Test
    public void testEjercicio19() {
        assertEquals("Ana Pérez", ejercicios.ejercicio19("Ana", "Pérez"));
    }

    @Test
    public void testEjercicio20() {
        assertTrue(ejercicios.ejercicio20(false));
    }

    @Test
    public void testEjercicio21() {
        assertEquals(120, ejercicios.ejercicio21(5));
    }

    @Test
    public void testEjercicio22() {
        assertTrue(ejercicios.ejercicio22(7));
    }

    @Test
    public void testEjercicio23() {
        assertEquals(8, ejercicios.ejercicio23(6));
    }

    @Test
    public void testEjercicio24() {
        assertEquals(15, ejercicios.ejercicio24(5));
    }

    @Test
    public void testEjercicio25() {
        assertEquals(10, ejercicios.ejercicio25(new int[]{2, 3, 5}));
    }

    @Test
    public void testEjercicio26() {
        assertEquals("HolaMundoJava", ejercicios.ejercicio26(new String[]{"Hola", "Mundo", "Java"}));
    }

    @Test
    public void testEjercicio27_2params() {
        assertEquals(9, ejercicios.ejercicio27(4, 5));
    }

    // ======================================
    // D. MÉTODOS CON OBJETOS
    // ======================================

    @Test
    public void testEjercicio27_3params() {
        assertEquals(12, ejercicios.ejercicio27(3, 4, 5));
    }

    @Test
    public void testEjercicio28() {
        assertEquals(9, ejercicios.ejercicio28(4, 9, 3));
    }

    @Test
    public void testEjercicio29() {
        assertEquals(25.0, ejercicios.ejercicio29(5), 0);
    }

    @Test
    public void testEjercicio30() {
        assertTrue(ejercicios.ejercicio30(15));
    }

    @Test
    public void testEjercicio31() {
        assertEquals("Ana", ejercicios.ejercicio31(p1));
    }

    @Test
    public void testEjercicio32() {
        assertEquals(25, ejercicios.ejercicio32(p1));
    }

    @Test
    public void testEjercicio33() {
        assertEquals("Luis", ejercicios.ejercicio33(p1, p2));
    }

    @Test
    public void testEjercicio34() {
        assertEquals(31.666666666666668, ejercicios.ejercicio34(personas), 0);
    }

    @Test
    public void testEjercicio35() {
        assertEquals("Eva", ejercicios.ejercicio35(personas));
    }

    @Test
    public void testEjercicio36() {
        assertTrue(ejercicios.ejercicio36(personas));
    }

    @Test
    public void testEjercicio37() {
        Clase05Enunciados.Persona nueva = ejercicios.ejercicio37(p1, 5);
        assertNotNull(nueva);
    }

    @Test
    public void testEjercicio38() {
        assertEquals("Hola, Ana", ejercicios.ejercicio38(p1));
    }

    @Test
    public void testEjercicio39() {
        assertTrue(ejercicios.ejercicio39(p1));
    }

    @Test
    public void testEjercicio40() {
        Clase05Enunciados.Persona combinada = ejercicios.ejercicio40(p1, p2);
        assertNotNull(combinada);
    }

    // ======================================
    // E. RETOS COMBINADOS
    // ======================================

    @Test
    public void testEjercicio41() {
        assertEquals("1,2,3,4,5", ejercicios.ejercicio41(5));
    }

    @Test
    public void testEjercicio42() {
        assertEquals(3, ejercicios.ejercicio42("Java es divertido"));
    }

    @Test
    public void testEjercicio43() {
        assertTrue(ejercicios.ejercicio43(15));
    }

    @Test
    public void testEjercicio44() {
        assertEquals(4.0, ejercicios.ejercicio44(new int[]{2, 4, 6, 3}), 0);
    }

    @Test
    public void testEjercicio45() {
        assertEquals("avaJ", ejercicios.ejercicio45("Java"));
    }

    @Test
    public void testEjercicio46() {
        assertEquals(2, ejercicios.ejercicio46("banana", 'a'));
    }

    @Test
    public void testEjercicio47() {
        assertEquals(9, ejercicios.ejercicio47(new int[]{3, 9, 2, 5}));
    }

    @Test
    public void testEjercicio48() {
        String result = ejercicios.ejercicio48(4, 2);
        assertTrue(result.contains("6"));
        assertTrue(result.contains("2"));
    }

    @Test
    public void testEjercicio49() {
        assertEquals("1010", ejercicios.ejercicio49(10));
    }

    @Test
    public void testEjercicio50() {
        assertTrue(ejercicios.ejercicio50("anilina"));
    }
}
