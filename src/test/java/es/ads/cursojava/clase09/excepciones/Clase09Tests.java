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

package es.ads.cursojava.clase09.excepciones;

import es.ads.cursojava.clase09.excepciones.enunciados.Clase09Enunciados;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Clase09Tests {

    final Clase09Enunciados ejercicios = new Clase09Enunciados();

    // ==================================================
    // A. Excepciones básicas
    // ==================================================

    @Test
    public void testEjercicio1() {
        assertEquals(5, ejercicios.ejercicio1(10, 2));
    }

    @Test
    public void testEjercicio1DivCero() {
        assertEquals(0, ejercicios.ejercicio1(10, 0));
    }

    @Test
    public void testEjercicio2() {
        assertEquals(123, ejercicios.ejercicio2("123"));
    }

    @Test
    public void testEjercicio2Error() {
        assertEquals(0, ejercicios.ejercicio2("abc"));
    }

    @Test
    public void testEjercicio3() {
        assertEquals(3, ejercicios.ejercicio3(new int[]{1, 2, 3, 4}, 2));
    }

    @Test
    public void testEjercicio3OutOfBounds() {
        assertEquals(-1, ejercicios.ejercicio3(new int[]{1, 2}, 5));
    }

    @Test
    public void testEjercicio4() {
        assertEquals("Bloque finally ejecutado", ejercicios.ejercicio4());
    }

    @Test
    public void testEjercicio5() {
        assertEquals("Error: texto nulo", ejercicios.ejercicio5(null));
    }

    @Test
    public void testEjercicio6() {
        assertEquals(2.0, ejercicios.ejercicio6(-4), 0);
    }

    @Test
    public void testEjercicio7() {
        assertEquals("Archivo no encontrado", ejercicios.ejercicio7("no_existe.txt"));
    }

    @Test
    public void testEjercicio8() {
        assertEquals("Error aritmético", ejercicios.ejercicio8("texto", 0));
    }

    @Test
    public void testEjercicio9() {
        assertEquals("Ejecución finalizada", ejercicios.ejercicio9());
    }

    @Test
    public void testEjercicio10() {
        assertEquals(5, ejercicios.ejercicio10(10, 2));
    }


    // ==================================================
    // B. Excepciones personalizadas
    // ==================================================

    @Test
    public void testEjercicio11() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio11(-5));
    }

    @Test
    public void testEjercicio12() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio12(100, 200));
    }

    @Test
    public void testEjercicio13() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio13(150));
    }

    @Test
    public void testEjercicio14() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio14(null));
    }

    @Test
    public void testEjercicio15() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio15("archivoInexistente.txt"));
    }

    @Test(expected = RuntimeException.class)
    public void testEjercicio16() {
        assertThrows(RuntimeException.class, () -> ejercicios.ejercicio16(true));
    }

    @Test
    public void testEjercicio17() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio17("123"));
    }

    @Test
    public void testEjercicio18() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio18(3));
    }

    @Test
    public void testEjercicio19() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio19(""));
    }

    @Test
    public void testEjercicio20() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio20(15));
    }


    // ==================================================
    // C. Múltiples catch, throw y throws
    // ==================================================

    @Test
    public void testEjercicio21() {
        assertEquals("Error de formato", ejercicios.ejercicio21("abc", 2));
    }

    @Test
    public void testEjercicio22() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio22(-10));
    }

    @Test
    public void testEjercicio23() {
        assertEquals("Recurso cerrado correctamente", ejercicios.ejercicio23());
    }

    @Test
    public void testEjercicio24() {
        assertEquals("Error de IO capturado", ejercicios.ejercicio24());
    }

    @Test
    public void testEjercicio25() {
        assertThrows(IllegalArgumentException.class, () -> ejercicios.ejercicio25(-5));
    }

    @Test
    public void testEjercicio26() {
        assertEquals("Error general", ejercicios.ejercicio26("error"));
    }

    @Test
    public void testEjercicio27() {
        assertEquals("Error", ejercicios.ejercicio27("abc"));
    }

    @Test
    public void testEjercicio28() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio28(null));
    }

    @Test
    public void testEjercicio29() {
        assertEquals("Registro completado", ejercicios.ejercicio29());
    }

    @Test
    public void testEjercicio30() {
        assertTrue(ejercicios.ejercicio30().contains("Error detectado"));
    }


    // ==================================================
    // D. Jerarquía y control de excepciones
    // ==================================================

    @Test
    public void testEjercicio31() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio31(true));
    }

    @Test
    public void testEjercicio32() {
        assertEquals("Error base capturado", ejercicios.ejercicio32(true));
    }

    @Test
    public void testEjercicio33() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio33(true));
    }

    @Test
    public void testEjercicio34() {
        assertEquals("Excepción interna capturada", ejercicios.ejercicio34());
    }

    @Test
    public void testEjercicio35() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio35());
    }

    @Test
    public void testEjercicio36() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio36());
    }

    @Test
    public void testEjercicio37() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio37("login"));
    }

    @Test
    public void testEjercicio38() {
        assertEquals("Excepción anidada detectada", ejercicios.ejercicio38());
    }

    @Test
    public void testEjercicio39() {
        assertEquals("Tipo capturado correctamente", ejercicios.ejercicio39());
    }

    @Test
    public void testEjercicio40() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio40());
    }


    // ==================================================
    // E. Prácticas finales
    // ==================================================

    @Test
    public void testEjercicio41() {
        assertEquals(5.0, ejercicios.ejercicio41(10, 2), 0);
    }

    @Test
    public void testEjercicio41DivZero() {
        assertEquals(0, ejercicios.ejercicio41(10, 0), 0);
    }

    @Test
    public void testEjercicio42() {
        assertEquals("Operación exitosa", ejercicios.ejercicio42(false));
    }

    @Test
    public void testEjercicio43() {
        assertTrue(ejercicios.ejercicio43().contains("StackTrace"));
    }

    @Test
    public void testEjercicio44() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio44(new ArrayList<>()));
    }

    @Test
    public void testEjercicio45() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio45(200));
    }

    @Test
    public void testEjercicio46() {
        assertEquals(0, ejercicios.ejercicio46("abc"));
    }

    @Test
    public void testEjercicio47() {
        assertEquals("Siempre se ejecuta", ejercicios.ejercicio47());
    }

    @Test
    public void testEjercicio48() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio48(null));
    }

    @Test
    public void testEjercicio49() {
        assertThrows(Exception.class, () -> ejercicios.ejercicio49("Eliminar archivo"));
    }

    @Test
    public void testEjercicio50() {
        assertEquals("Correcto", ejercicios.ejercicio50(5));
    }
}
