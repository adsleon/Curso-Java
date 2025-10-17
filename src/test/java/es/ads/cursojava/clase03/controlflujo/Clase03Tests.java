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

import static org.junit.Assert.*;

public class Clase03Tests {

    final Clase03Enunciados ejercicios = new Clase03Enunciados();

    // ================================
    // A. Condicionales simples (if / else)
    // ================================
    @Test
    public void testEjercicio011() {
        assertEquals("Positivo", ejercicios.ejercicio1(10));
    }

    @Test
    public void testEjercicio012() {
        assertEquals("Negativo", ejercicios.ejercicio1(-10));
    }

    @Test
    public void testEjercicio013() {
        assertEquals("Negativo", ejercicios.ejercicio1(0));
    }

    @Test
    public void testEjercicio021() {
        assertEquals("Par", ejercicios.ejercicio2(8));
    }

    @Test
    public void testEjercicio022() {
        assertEquals("Impar", ejercicios.ejercicio2(13));
    }

    @Test
    public void testEjercicio031() {
        assertEquals("Mayor de edad", ejercicios.ejercicio3(20));
    }

    @Test
    public void testEjercicio032() {
        assertEquals("Mayor de edad", ejercicios.ejercicio3(18));
    }

    @Test
    public void testEjercicio033() {
        assertEquals("Menor de edad", ejercicios.ejercicio3(17));
    }

    @Test
    public void testEjercicio041() {
        assertEquals(8, ejercicios.ejercicio4(5, 8));
    }

    @Test
    public void testEjercicio042() {
        assertEquals(8, ejercicios.ejercicio4(-15, 8));
    }

    @Test
    public void testEjercicio043() {
        assertEquals(-5, ejercicios.ejercicio4(-5, -8));
    }

    @Test
    public void testEjercicio051() {
        assertEquals(3, ejercicios.ejercicio5(3, 10));
    }

    @Test
    public void testEjercicio052() {
        assertEquals(-15, ejercicios.ejercicio4(-15, 8));
    }

    @Test
    public void testEjercicio053() {
        assertEquals(-8, ejercicios.ejercicio4(-5, -8));
    }

    @Test
    public void testEjercicio061() {
        assertEquals("Aprobado", ejercicios.ejercicio6(5.5));
    }

    @Test
    public void testEjercicio062() {
        assertEquals("Aprobado", ejercicios.ejercicio6(5.0));
    }

    @Test
    public void testEjercicio063() {
        assertEquals("Suspenso", ejercicios.ejercicio6(4.999));
    }

    @Test
    public void testEjercicio071() {
        assertEquals("Cero", ejercicios.ejercicio7(0));
    }

    @Test
    public void testEjercicio072() {
        assertEquals("Positivo", ejercicios.ejercicio7(1));
    }

    @Test
    public void testEjercicio073() {
        assertEquals("negativo", ejercicios.ejercicio7(-1));
    }

    @Test
    public void testEjercicio081() {
        assertEquals("Múltiplo de 3", ejercicios.ejercicio8(9));
    }

    @Test
    public void testEjercicio082() {
        assertEquals("No múltiplo de 3", ejercicios.ejercicio8(7));
    }

    @Test
    public void testEjercicio091() {
        assertTrue(ejercicios.ejercicio9(20));
    }

    @Test
    public void testEjercicio092() {
        assertTrue(ejercicios.ejercicio9(18));
    }

    @Test
    public void testEjercicio093() {
        assertFalse(ejercicios.ejercicio9(17));
    }

    @Test
    public void testEjercicio101() {
        assertEquals("Número dentro de rango", ejercicios.ejercicio10(5));
    }

    @Test
    public void testEjercicio102() {
        assertEquals("Número dentro de rango", ejercicios.ejercicio10(1));
    }

    @Test
    public void testEjercicio103() {
        assertEquals("Número dentro de rango", ejercicios.ejercicio10(10));
    }

    @Test
    public void testEjercicio104() {
        assertEquals("Número fuera de rango", ejercicios.ejercicio10(0));
    }

    @Test
    public void testEjercicio105() {
        assertEquals("Número fuera de rango", ejercicios.ejercicio10(11));
    }

    // ================================
    // B. Condicionales compuestos (if / else if / else)
    // ================================
    @Test
    public void testEjercicio111() {
        assertEquals("Sobresaliente", ejercicios.ejercicio11(9.5));
    }

    @Test
    public void testEjercicio112() {
        assertEquals("Notable", ejercicios.ejercicio11(8.8));
    }

    @Test
    public void testEjercicio113() {
        assertEquals("Aprobado", ejercicios.ejercicio11(6.9));
    }

    @Test
    public void testEjercicio114() {
        assertEquals("Suspenso", ejercicios.ejercicio11(0.2));
    }

    @Test
    public void testEjercicio121() {
        assertEquals(9, ejercicios.ejercicio12(3, 9, 5));
    }

    @Test
    public void testEjercicio122() {
        assertEquals(5, ejercicios.ejercicio12(3, -9, 5));
    }

    @Test
    public void testEjercicio123() {
        assertEquals(-3, ejercicios.ejercicio12(-3, -9, -5));
    }

    @Test
    public void testEjercicio131() {
        assertEquals("Negativo", ejercicios.ejercicio13(-5));
    }

    @Test
    public void testEjercicio132() {
        assertEquals("Cero", ejercicios.ejercicio13(0));
    }

    @Test
    public void testEjercicio133() {
        assertEquals("Positivo", ejercicios.ejercicio13(5));
    }

    @Test
    public void testEjercicio141() {
        assertEquals("Adolescente", ejercicios.ejercicio14(13));
    }

    @Test
    public void testEjercicio142() {
        assertEquals("Niño", ejercicios.ejercicio14(12));
    }

    @Test
    public void testEjercicio143() {
        assertEquals("Adulto", ejercicios.ejercicio14(18));
    }

    @Test
    public void testEjercicio151() {
        assertEquals("Divisible entre 2 y 3", ejercicios.ejercicio15(6));
    }

    @Test
    public void testEjercicio152() {
        assertEquals("No divisible entre 2 y 3", ejercicios.ejercicio15(5));
    }

    @Test
    public void testEjercicio153() {
        assertEquals("No divisible entre 2 y 3", ejercicios.ejercicio15(9));
    }

    @Test
    public void testEjercicio154() {
        assertEquals("No divisible entre 2 y 3", ejercicios.ejercicio15(8));
    }

    @Test
    public void testEjercicio161() {
        assertTrue(ejercicios.ejercicio16(2010));
    }

    @Test
    public void testEjercicio162() {
        assertFalse(ejercicios.ejercicio16(2072));
    }

    @Test
    public void testEjercicio163() {
        assertTrue(ejercicios.ejercicio16(2100));
    }

    @Test
    public void testEjercicio171() {
        assertEquals("Capricornio", ejercicios.ejercicio17(1));
    }

    @Test
    public void testEjercicio172() {
        assertEquals("Tauro", ejercicios.ejercicio17(5));
    }

    @Test
    public void testEjercicio173() {
        assertEquals("Sagitario", ejercicios.ejercicio17(12));
    }

    @Test
    public void testEjercicio181() {
        assertEquals("Vocal", ejercicios.ejercicio18('a'));
    }

    @Test
    public void testEjercicio182() {
        assertEquals("Consonante", ejercicios.ejercicio18('N'));
    }

    @Test
    public void testEjercicio191() {
        assertTrue(ejercicios.ejercicio19("admin123"));
    }

    @Test
    public void testEjercicio192() {
        assertFalse(ejercicios.ejercicio19("pass"));
    }

    @Test
    public void testEjercicio193() {
        assertFalse(ejercicios.ejercicio19("admin1234"));
    }

    @Test
    public void testEjercicio201() {
        assertEquals("Dentro del rango", ejercicios.ejercicio20(150));
    }

    @Test
    public void testEjercicio202() {
        assertEquals("Dentro del rango", ejercicios.ejercicio20(100));
    }

    @Test
    public void testEjercicio203() {
        assertEquals("Dentro del rango", ejercicios.ejercicio20(200));
    }

    @Test
    public void testEjercicio204() {
        assertEquals("Fuera del rango", ejercicios.ejercicio20(99));
    }

    @Test
    public void testEjercicio205() {
        assertEquals("Fuera del rango", ejercicios.ejercicio20(201));
    }

    // ================================
    // C. Switch
    // ================================
    @Test
    public void testEjercicio211() {
        assertEquals("Lunes", ejercicios.ejercicio21(1));
    }

    @Test
    public void testEjercicio212() {
        assertEquals("Domingo", ejercicios.ejercicio21(7));
    }

    @Test
    public void testEjercicio221() {
        assertEquals("Enero", ejercicios.ejercicio22(1));
    }

    @Test
    public void testEjercicio222() {
        assertEquals("Diciembre", ejercicios.ejercicio22(12));
    }

    @Test
    public void testEjercicio231() {
        assertEquals("Círculo", ejercicios.ejercicio23(1));
    }

    @Test
    public void testEjercicio232() {
        assertEquals("Cuadrado", ejercicios.ejercicio23(2));
    }

    @Test
    public void testEjercicio233() {
        assertEquals("Triángulo", ejercicios.ejercicio23(3));
    }

    @Test
    public void testEjercicio241() {
        assertEquals("Vocal", ejercicios.ejercicio24('e'));
    }

    @Test
    public void testEjercicio242() {
        assertEquals("Consonante", ejercicios.ejercicio24('R'));
    }

    @Test
    public void testEjercicio251() {
        assertEquals("Aprobado", ejercicios.ejercicio25('B'));
    }

    @Test
    public void testEjercicio252() {
        assertEquals("Suspenso", ejercicios.ejercicio25('F'));
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
    public void testEjercicio291() {
        assertEquals(120, ejercicios.ejercicio29(5));
    }

    @Test
    public void testEjercicio292() {
        assertEquals(362800, ejercicios.ejercicio29(10));
    }

    @Test
    public void testEjercicio30() {
        assertEquals("12345", ejercicios.ejercicio30());
    }

    @Test
    public void testEjercicio311() {
        assertEquals(9, ejercicios.ejercicio31(6));
    }

    @Test
    public void testEjercicio312() {
        assertEquals(2916, ejercicios.ejercicio31(107));
    }

    @Test
    public void testEjercicio321() {
        assertEquals(3, ejercicios.ejercicio32("Hola Java"));
    }

    @Test
    public void testEjercicio322() {
        assertEquals(10, ejercicios.ejercicio32("¡¡Esto son demasiados test ya!!"));
    }


    @Test
    public void testEjercicio331() {
        assertEquals(8, ejercicios.ejercicio33(2, 3));
    }

    @Test
    public void testEjercicio332() {
        assertEquals(1977326743, ejercicios.ejercicio33(7, 11));
    }

    @Test
    public void testEjercicio34() {
        assertEquals(275, ejercicios.ejercicio34(5));
    }

    @Test
    public void testEjercicio35() {
        assertEquals(99, ejercicios.ejercicio35(20));
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
        assertEquals(30, ejercicios.ejercicio40(10));
    }

    // ================================
    // F. Bucles do-while
    // ================================
    @Test
    public void testEjercicio41() {
        assertEquals(55,ejercicios.ejercicio41());
    }

    @Test
    public void testEjercicio42() {
        assertEquals("12345", ejercicios.ejercicio42());
    }

    @Test
    public void testEjercicio431() {
        assertEquals(3, ejercicios.ejercicio43(789));
    }@Test
    public void testEjercicio432() {
        assertEquals(7, ejercicios.ejercicio43(7896482));
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
