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
    public void testEjercicio111() {
        assertEquals(9, ejercicios.ejercicio11(9.7));
    }

    @Test
    public void testEjercicio112() {
        assertEquals(9, ejercicios.ejercicio11(9.3));
    }

    @Test
    public void testEjercicio113() {
        assertEquals(4, ejercicios.ejercicio11(4.05));
    }

    @Test
    public void testEjercicio114() {
        assertEquals(7, ejercicios.ejercicio11(7.502));
    }

    @Test
    public void testEjercicio121() {
        assertEquals(15.0, ejercicios.ejercicio12(15), 0);
    }

    @Test
    public void testEjercicio122() {
        assertEquals(2.0, ejercicios.ejercicio12(2), 0);
    }

    @Test
    public void testEjercicio131() {
        assertEquals(8, ejercicios.ejercicio13(8.99f));
    }

    @Test
    public void testEjercicio132() {
        assertEquals(8, ejercicios.ejercicio13(8.1f));
    }

    @Test
    public void testEjercicio133() {
        assertEquals(4, ejercicios.ejercicio13(4.05f));
    }

    @Test
    public void testEjercicio134() {
        assertEquals(7, ejercicios.ejercicio13(7.502f));
    }

    @Test
    public void testEjercicio141() {
        assertEquals(65, ejercicios.ejercicio14('A'));
    }

    @Test
    public void testEjercicio142() {
        assertEquals(32, ejercicios.ejercicio14(' '));
    }

    @Test
    public void testEjercicio143() {
        assertEquals(97, ejercicios.ejercicio14('a'));
    }

    @Test
    public void testEjercicio144() {
        assertEquals(10, ejercicios.ejercicio14('\n'));
    }

    @Test
    public void testEjercicio151() {
        assertEquals('A', ejercicios.ejercicio15(65));
    }

    @Test
    public void testEjercicio152() {
        assertEquals('a', ejercicios.ejercicio15(97));
    }

    @Test
    public void testEjercicio153() {
        assertEquals(' ', ejercicios.ejercicio15(32));
    }

    @Test
    public void testEjercicio154() {
        assertEquals('\n', ejercicios.ejercicio15(10));
    }

    @Test
    public void testEjercicio16() {
        assertEquals(100, ejercicios.ejercicio16(100L));
    }

    @Test
    public void testEjercicio171() {
        assertEquals("3.14", ejercicios.ejercicio17(3.14));
    }

    @Test
    public void testEjercicio172() {
        assertEquals("2.71", ejercicios.ejercicio17(2.71));
    }

    @Test
    public void testEjercicio181() {
        assertEquals("true", ejercicios.ejercicio18(true));
    }

    @Test
    public void testEjercicio182() {
        assertEquals("false", ejercicios.ejercicio18(false));
    }

    @Test
    public void testEjercicio191() {
        assertTrue(ejercicios.ejercicio19("true"));
    }

    @Test
    public void testEjercicio192() {
        assertFalse(ejercicios.ejercicio19("false"));
    }

    @Test
    public void testEjercicio201() {
        assertEquals("123", ejercicios.ejercicio20(123));
    }

    @Test
    public void testEjercicio202() {
        assertEquals("8", ejercicios.ejercicio20(8));
    }

    // ================================
    // C. Strings
    // ================================
    @Test
    public void testEjercicio211() {
        assertEquals(4, ejercicios.ejercicio21("Jose"));
    }

    @Test
    public void testEjercicio212() {
        assertEquals(95, ejercicios.ejercicio21("Hola, muy buenas a todos, " +
                "guapísimos, aquí Vegetta777 en nuevo gameplay en directo de Minecraft"));
    }

    @Test
    public void testEjercicio221() {
        assertEquals("JAVA", ejercicios.ejercicio22("java"));
    }

    @Test
    public void testEjercicio222() {
        assertEquals("ADS", ejercicios.ejercicio22("ads"));
    }

    @Test
    public void testEjercicio231() {
        assertEquals("java", ejercicios.ejercicio23("JAVA"));
    }

    @Test
    public void testEjercicio232() {
        assertEquals("ads", ejercicios.ejercicio23("ADS"));
    }

    @Test
    public void testEjercicio241() {
        assertEquals("HolaMundo", ejercicios.ejercicio24("Hola", "Mundo"));
    }

    @Test
    public void testEjercicio242() {
        assertEquals("MuyBuenas", ejercicios.ejercicio24("Muy", "Buenas"));
    }

    @Test
    public void testEjercicio251() {
        assertEquals("HolaMundo", ejercicios.ejercicio25("Hola", "Mundo"));
    }

    @Test
    public void testEjercicio252() {
        assertEquals("MuyBuenas", ejercicios.ejercicio25("Muy", "Buenas"));
    }

    @Test
    public void testEjercicio26() {
        assertEquals("Pro", ejercicios.ejercicio26("Programacion"));
    }

    @Test
    public void testEjercicio271() {
        assertEquals(1, ejercicios.ejercicio27("Java"));
    }

    @Test
    public void testEjercicio272() {
        assertEquals(7, ejercicios.ejercicio27("Murciélago"));
    }

    @Test
    public void testEjercicio281() {
        assertTrue(ejercicios.ejercicio28("Me gusta Java"));
    }

    @Test
    public void testEjercicio282() {
        assertFalse(ejercicios.ejercicio28("Me gusta ADS"));
    }

    @Test
    public void testEjercicio291() {
        assertEquals("Hola Java", ejercicios.ejercicio29("Hola mundo"));
    }

    @Test
    public void testEjercicio292() {
        assertEquals("Somos ciudadanos de un lugar llamado Java", ejercicios.ejercicio29("Somos ciudadanos de un lugar llamado mundo"));
    }

    @Test
    public void testEjercicio301() {
        assertTrue(ejercicios.ejercicio30("Java", "Java"));
    }

    @Test
    public void testEjercicio302() {
        assertFalse(ejercicios.ejercicio30("JAVA", "Java"));
    }

    @Test
    public void testEjercicio303() {
        assertFalse(ejercicios.ejercicio30("ADS", "ADSoft"));
    }

    // ================================
    // D. Operadores aritméticos
    // ================================
    @Test
    public void testEjercicio311() {
        assertEquals(13, ejercicios.ejercicio31(10, 3));
    }

    @Test
    public void testEjercicio312() {
        assertEquals(-18, ejercicios.ejercicio31(-15, -3));
    }

    @Test
    public void testEjercicio313() {
        assertEquals(-12, ejercicios.ejercicio31(-15, 3));
    }

    @Test
    public void testEjercicio321() {
        assertEquals(7, ejercicios.ejercicio32(10, 3));
    }

    @Test
    public void testEjercicio322() {
        assertEquals(-7, ejercicios.ejercicio32(-10, -3));
    }

    @Test
    public void testEjercicio323() {
        assertEquals(-13, ejercicios.ejercicio32(-10, 3));
    }

    @Test
    public void testEjercicio331() {
        assertEquals(30, ejercicios.ejercicio33(10, 3));
    }

    @Test
    public void testEjercicio332() {
        assertEquals(30, ejercicios.ejercicio33(-10, -3));
    }

    @Test
    public void testEjercicio333() {
        assertEquals(-30, ejercicios.ejercicio33(-10, 3));
    }

    @Test
    public void testEjercicio314() {
        assertEquals(3, ejercicios.ejercicio34(10, 3));
    }

    @Test
    public void testEjercicio342() {
        assertEquals(3, ejercicios.ejercicio34(-10, -3));
    }

    @Test
    public void testEjercicio343() {
        assertEquals(-3, ejercicios.ejercicio34(-10, 3));
    }

    @Test
    public void testEjercicio351() {
        assertEquals(1, ejercicios.ejercicio35(10, 3));
    }

    @Test
    public void testEjercicio352() {
        assertEquals(2, ejercicios.ejercicio35(5, 3));
    }

    @Test
    public void testEjercicio361() {
        assertEquals(11, ejercicios.ejercicio36(10));
    }

    @Test
    public void testEjercicio362() {
        assertEquals(-11, ejercicios.ejercicio36(-10));
    }

    @Test
    public void testEjercicio371() {
        assertEquals(2, ejercicios.ejercicio37(3));
    }

    @Test
    public void testEjercicio372() {
        assertEquals(-4, ejercicios.ejercicio37(-3));
    }

    @Test
    public void testEjercicio381() {
        assertEquals(100, ejercicios.ejercicio38(10));
    }

    @Test
    public void testEjercicio382() {
        assertEquals(9, ejercicios.ejercicio38(-3));
    }

    @Test
    public void testEjercicio391() {
        assertEquals(27, ejercicios.ejercicio39(3));
    }

    @Test
    public void testEjercicio392() {
        assertEquals(-8, ejercicios.ejercicio39(-2));
    }

    @Test
    public void testEjercicio401() {
        assertEquals(6.5, ejercicios.ejercicio40(10, 3), 0);
    }

    @Test
    public void testEjercicio402() {
        assertEquals(-5.5, ejercicios.ejercicio40(17, -28), 0);
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
    public void testEjercicio471() {
        assertTrue(ejercicios.ejercicio47(12));
    }

    @Test
    public void testEjercicio472() {
        assertFalse(ejercicios.ejercicio47(13));
    }

    @Test
    public void testEjercicio473() {
        assertFalse(ejercicios.ejercicio47(10));
    }

    @Test
    public void testEjercicio474() {
        assertFalse(ejercicios.ejercicio47(8));
    }

    @Test
    public void testEjercicio481() {
        assertTrue(ejercicios.ejercicio48(7));
    }

    @Test
    public void testEjercicio482() {
        assertTrue(ejercicios.ejercicio48(13));
    }

    @Test
    public void testEjercicio483() {
        assertTrue(ejercicios.ejercicio48(4));
    }

    @Test
    public void testEjercicio484() {
        assertFalse(ejercicios.ejercicio48(8));
    }

    @Test
    public void testEjercicio491() {
        assertFalse(ejercicios.ejercicio49(true));
    }

    @Test
    public void testEjercicio492() {
        assertTrue(ejercicios.ejercicio49(false));
    }

    @Test
    public void testEjercicio50() {
        assertEquals("Positivo", ejercicios.ejercicio50(10));
    }
}

