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

package es.ads.cursojava.clase06.poo;


import es.ads.cursojava.clase06.poo.enunciados.Clase06Enunciados;

public class Clase06Tests {

    Clase06Enunciados ejercicios = new Clase06Enunciados();

    // ===============================
    // A. ATRIBUTOS Y CREACIÓN DE OBJETOS
    // ===============================

//    @Test
//    public void testEjercicio1_10() {
//        Clase06Enunciados.Persona p = ejercicios.new Persona("Juan", 20);
//        assertEquals("Juan", p.getNombre());
//        assertEquals(20, p.getEdad());
//
//        p.setNombre("Pedro");
//        p.setEdad(30);
//        assertEquals("Pedro", p.getNombre());
//        assertEquals(30, p.getEdad());
//
//        assertEquals("Hola, soy Pedro", p.saludar());
//        assertTrue(p.esMayorEdad());
//
//        p.cumplirAnios();
//        assertEquals(31, p.getEdad());
//        assertEquals("Nombre: Pedro, Edad: 31", p.presentar());
//    }
//
//    // ===============================
//    // B. CONSTRUCTORES Y SOBRECARGA
//    // ===============================
//
//    @Test
//    public void testEjercicio11_20() {
//        Clase06Enunciados.Rectangulo r1 = ejercicios.new Rectangulo(5, 10);
//        Clase06Enunciados.Rectangulo r2 = ejercicios.new Rectangulo();
//        Clase06Enunciados.Rectangulo r3 = ejercicios.new Rectangulo(4);
//
//        assertEquals(50, r1.area());
//        assertEquals(30, r1.perimetro());
//        assertFalse(r1.esCuadrado());
//        assertEquals("Base: 5.0, Altura: 10.0", r1.mostrarDatos());
//
//        assertEquals(1, r2.area());
//        assertTrue(r3.esCuadrado());
//
//        r1.setBase(8);
//        r1.setAltura(8);
//        assertTrue(r1.esCuadrado());
//    }
//
//    // ===============================
//    // C. RELACIONES ENTRE OBJETOS
//    // ===============================
//
//    @Test
//    public void testEjercicio21_30() {
//        Clase06Enunciados.Persona p = ejercicios.new Persona("Ana", 25);
//        Clase06Enunciados.CuentaBancaria c1 = ejercicios.new CuentaBancaria(p, 1000);
//        Clase06Enunciados.CuentaBancaria c2 = ejercicios.new CuentaBancaria(ejercicios.new Persona("Luis", 30), 500);
//
//        c1.depositar(500);
//        assertEquals(1500, c1.getSaldo());
//
//        c1.retirar(200);
//        assertEquals(1300, c1.getSaldo());
//
//        c1.transferir(c2, 300);
//        assertEquals(1000, c1.getSaldo());
//        assertEquals(800, c2.getSaldo());
//
//        assertEquals("Ana", c1.getTitularNombre());
//        assertTrue(c1.tieneSaldoPositivo());
//        c1.cerrarCuenta();
//        assertEquals(0, c1.getSaldo());
//        assertTrue(c2.mostrarDatos().contains("Luis"));
//    }
//
//    // ===============================
//    // D. HERENCIA
//    // ===============================
//
//    @Test
//    public void testEjercicio31_40() {
//        Clase06Enunciados.Empleado e = ejercicios.new Empleado("Carlos", 35, 2000);
//        assertEquals("Carlos", e.getNombre());
//        assertEquals(2000, e.getSalario());
//        e.aumentarSalario(10);
//        assertEquals(2200, e.getSalario());
//        assertTrue(e.presentar().contains("Salario"));
//
//        Clase06Enunciados.Gerente g = ejercicios.new Gerente("Lucía", 40, 3000, "Ventas");
//        assertTrue(g.presentar().contains("Ventas"));
//        assertEquals("Dirigiendo el departamento Ventas", g.dirigir());
//    }
//
//    // ===============================
//    // E. POO APLICADA
//    // ===============================
//
//    @Test
//    public void testEjercicio41_50() {
//        Clase06Enunciados.Coche c1 = ejercicios.new Coche("Toyota", "Corolla", 100);
//        Clase06Enunciados.Coche c2 = ejercicios.new Coche("Ford", "Mustang", 130);
//        Clase06Enunciados.Coche c3 = ejercicios.new Coche("Tesla", "Model 3", 150);
//
//        c1.acelerar(20);
//        assertEquals(120, c1.getVelocidad());
//        c1.frenar(50);
//        assertEquals(70, c1.getVelocidad());
//        assertFalse(c1.esRapido());
//        assertTrue(c3.esRapido());
//        assertTrue(c3.mostrarDatos().contains("Tesla"));
//
//        Clase06Enunciados.Garaje g = ejercicios.new Garaje(5);
//        g.agregarCoche(c1);
//        g.agregarCoche(c2);
//        g.agregarCoche(c3);
//
//        assertEquals(2, g.contarCochesRapidos());
//        assertEquals("Tesla", g.obtenerMasRapido().getMarca());
//        assertTrue(g.mostrarTodos().contains("Toyota"));
//        assertTrue(g.mostrarTodos().contains("Ford"));
//        assertTrue(g.mostrarTodos().contains("Tesla"));
//    }
}