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

package es.ads.cursojava.clase04.arrays;

import es.ads.cursojava.clase04.arrays.enunciados.Clase04Enunciados;
import org.junit.Test;

import static org.junit.Assert.*;

public class Clase04Tests {

    final Clase04Enunciados ejercicios = new Clase04Enunciados();

    // ======================================
    // A. ARRAYS SIMPLES
    // ======================================
    final Clase04Enunciados.Persona[] personas = {
            new Clase04Enunciados.Persona("Ana", 25),
            new Clase04Enunciados.Persona("Luis", 40),
            new Clase04Enunciados.Persona("Eva", 30)
    };

    @Test
    public void testEjercicio1() {
        assertEquals(15, ejercicios.ejercicio1(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testEjercicio2() {
        assertEquals(9, ejercicios.ejercicio2(new int[]{2, 5, 9, 1, 3}));
    }

    @Test
    public void testEjercicio3() {
        assertEquals(1, ejercicios.ejercicio3(new int[]{2, 5, 9, 1, 3}));
    }

    @Test
    public void testEjercicio4() {
        assertEquals(4.0, ejercicios.ejercicio4(new int[]{2, 4, 6, 4}), 0);
    }

    @Test
    public void testEjercicio5() {
        assertEquals(3, ejercicios.ejercicio5(new int[]{2, 5, 8, 11, 6}));
    }

    @Test
    public void testEjercicio6() {
        assertEquals(2, ejercicios.ejercicio6(new int[]{2, 5, 8, 11, 6}));
    }

    @Test
    public void testEjercicio7() {
        assertArrayEquals(new int[]{2, 4, 6}, ejercicios.ejercicio7(new int[]{1, 2, 3}));
    }

    @Test
    public void testEjercicio8() {
        assertEquals(2, ejercicios.ejercicio8(new int[]{1, 2, 3, 2, 5}, 2));
    }

    @Test
    public void testEjercicio9() {
        assertTrue(ejercicios.ejercicio9(new int[]{1, 2, 3, 4}));
    }

    // ======================================
    // B. STRINGS EN ARRAYS
    // ======================================

    @Test
    public void testEjercicio10() {
        assertTrue(ejercicios.ejercicio10(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testEjercicio11() {
        assertEquals(15, ejercicios.ejercicio11(new String[]{"Hola", "Mundo", "Java"}));
    }

    @Test
    public void testEjercicio12() {
        assertEquals("Programacion", ejercicios.ejercicio12(new String[]{"Java", "Programacion", "C"}));
    }

    @Test
    public void testEjercicio13() {
        assertEquals("C", ejercicios.ejercicio13(new String[]{"Java", "Programacion", "C"}));
    }

    @Test
    public void testEjercicio14() {
        assertEquals(2, ejercicios.ejercicio14(new String[]{"Ana", "Pedro", "Oscar", "Luis"}));
    }

    @Test
    public void testEjercicio15() {
        assertEquals("Hola,Mundo,Java", ejercicios.ejercicio15(new String[]{"Hola", "Mundo", "Java"}));
    }

    @Test
    public void testEjercicio16() {
        assertTrue(ejercicios.ejercicio16(new String[]{"Hola", "Adios", "Java"}, "Java"));
    }

    @Test
    public void testEjercicio17() {
        assertArrayEquals(new String[]{"HOLA", "MUNDO"}, ejercicios.ejercicio17(new String[]{"Hola", "Mundo"}));
    }

    @Test
    public void testEjercicio18() {
        assertEquals(1, ejercicios.ejercicio18(new String[]{"Hola", "Mundo", "Java"}, "Mundo"));
    }

    @Test
    public void testEjercicio19() {
        assertEquals(2, ejercicios.ejercicio19(new String[]{"Hola", "Programacion", "Sol", "Casa"}));
    }

    // ======================================
    // C. ARRAYS BIDIMENSIONALES
    // ======================================

    @Test
    public void testEjercicio20() {
        assertEquals("Hola,Java", ejercicios.ejercicio20(new String[]{"Hola", "Mundo", "Java"}));
    }

    @Test
    public void testEjercicio21() {
        assertEquals(10, ejercicios.ejercicio21(new int[][]{{1, 2}, {3, 4}}));
    }

    @Test
    public void testEjercicio22() {
        assertArrayEquals(new int[]{3, 7}, ejercicios.ejercicio22(new int[][]{{1, 2}, {3, 4}}));
    }

    @Test
    public void testEjercicio23() {
        assertArrayEquals(new int[]{4, 6}, ejercicios.ejercicio23(new int[][]{{1, 2}, {3, 4}}));
    }

    @Test
    public void testEjercicio24() {
        assertEquals(9, ejercicios.ejercicio24(new int[][]{{1, 9}, {3, 4}}));
    }

    @Test
    public void testEjercicio25() {
        assertEquals(1, ejercicios.ejercicio25(new int[][]{{1, 9}, {3, 4}}));
    }

    @Test
    public void testEjercicio26() {
        assertEquals(5, ejercicios.ejercicio26(new int[][]{{1, 2}, {3, 4}}));
    }

    @Test
    public void testEjercicio27() {
        assertEquals(5, ejercicios.ejercicio27(new int[][]{{1, 2}, {3, 4}}));
    }

    @Test
    public void testEjercicio28() {
        assertTrue(ejercicios.ejercicio28(new int[][]{{1, 2}, {3, 4}}));
    }

    @Test
    public void testEjercicio29() {
        int[][] input = {{1, 2}, {3, 4}};
        int[][] expected = {{1, 3}, {2, 4}};
        assertArrayEquals(expected, ejercicios.ejercicio29(input));
    }

    // ======================================
    // D. ARRAYS DE OBJETOS
    // ======================================

    @Test
    public void testEjercicio30() {
        int[][] input = {{1, 2, 3}, {4, 5, 6}};
        int[][] expected = {{3, 2, 1}, {6, 5, 4}};
        assertArrayEquals(expected, ejercicios.ejercicio30(input));
    }

    @Test
    public void testEjercicio31() {
        assertEquals(95, ejercicios.ejercicio31(personas));
    }

    @Test
    public void testEjercicio32() {
        assertEquals("Ana", ejercicios.ejercicio32(personas));
    }

    @Test
    public void testEjercicio33() {
        assertEquals("Luis", ejercicios.ejercicio33(personas));
    }

    @Test
    public void testEjercicio34() {
        assertEquals(31.666666666666668, ejercicios.ejercicio34(personas), 0);
    }

    @Test
    public void testEjercicio35() {
        assertEquals(3, ejercicios.ejercicio35(personas));
    }

    @Test
    public void testEjercicio36() {
        assertTrue(ejercicios.ejercicio36(personas, "Luis"));
    }

    @Test
    public void testEjercicio37() {
        assertEquals("Ana,Luis,Eva", ejercicios.ejercicio37(personas));
    }

    @Test
    public void testEjercicio38() {
        Clase04Enunciados.Persona[] mayores = ejercicios.ejercicio38(personas);
        assertEquals(2, mayores.length);
    }

    @Test
    public void testEjercicio39() {
        assertEquals(27.5, ejercicios.ejercicio39(personas), 0);
    }

    @Test
    public void testEjercicio40() {
        Clase04Enunciados.Persona p = ejercicios.ejercicio40(personas);
        assertEquals("Luis", p.nombre);
    }

    // ======================================
    // E. COMBINADOS Y RETOS
    // ======================================

    @Test
    public void testEjercicio41() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ejercicios.ejercicio41(new int[]{1, 2, 3}, new int[]{4, 5}));
    }

    @Test
    public void testEjercicio42() {
        assertArrayEquals(new int[]{2, 3}, ejercicios.ejercicio42(new int[]{1, 2, 3, 4}, new int[]{2, 3, 5}));
    }

    @Test
    public void testEjercicio43() {
        assertArrayEquals(new int[]{1, 2, 3}, ejercicios.ejercicio43(new int[]{1, 2, 2, 3, 3}));
    }

    @Test
    public void testEjercicio44() {
        assertTrue(ejercicios.ejercicio44(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
    }

    @Test
    public void testEjercicio45() {
        assertArrayEquals(new int[]{3, 2, 1}, ejercicios.ejercicio45(new int[]{1, 2, 3}));
    }

    @Test
    public void testEjercicio46() {
        assertEquals(6, ejercicios.ejercicio46(new int[][]{{1, 2}, {3, 4}, {5, 6}}));
    }

    @Test
    public void testEjercicio47() {
        int[][] input = {{1, 2}, {3, 4}};
        int[][] expected = {{2, 4}, {6, 8}};
        assertArrayEquals(expected, ejercicios.ejercicio47(input));
    }

    @Test
    public void testEjercicio48() {
        assertTrue(ejercicios.ejercicio48(new int[][]{{1, -2}, {3, 4}}));
    }

    @Test
    public void testEjercicio49() {
        assertEquals(2, ejercicios.ejercicio49(new int[][]{{1, 2, 3}, {5, 7, 9}, {2, 4, 6}}));
    }

    @Test
    public void testEjercicio50() {
        int[][] input = {{1, 2}, {3, 4}};
        int[][] expected = {{2, 3}, {4, 5}};
        assertArrayEquals(expected, ejercicios.ejercicio50(input));
    }
}
