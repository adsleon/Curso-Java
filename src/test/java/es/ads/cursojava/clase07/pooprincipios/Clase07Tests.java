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

package es.ads.cursojava.clase07.pooprincipios;

import es.ads.cursojava.clase07.pooprincipios.enunciados.Clase07Enunciados;

public class Clase07Tests {

    final Clase07Enunciados clase = new Clase07Enunciados();

    // ============================================================
    // A. ABSTRACCIÓN
    // ============================================================

//    @Test
//    public void testCirculoArea() {
//        Clase07Enunciados.Circulo c = clase.new Circulo(2.0);
//        assertEquals(12.5664, c.calcularArea(), 0.0001,
//                "El área del círculo debe ser PI * radio^2");
//    }
//
//    @Test
//    public void testCirculoPerimetro() {
//        Clase07Enunciados.Circulo c = clase.new Circulo(2.0);
//        assertEquals(12.5664, c.calcularPerimetro(), 0.0001,
//                "El perímetro debe ser 2 * PI * radio");
//    }
//
//    @Test
//    public void testRectanguloArea() {
//        Clase07Enunciados.Rectangulo r = clase.new Rectangulo(4, 2);
//        assertEquals(8.0, r.calcularArea(), 0.01,
//                "El área del rectángulo debe ser base * altura");
//    }
//
//    @Test
//    public void testRectanguloPerimetro() {
//        Clase07Enunciados.Rectangulo r = clase.new Rectangulo(4, 2);
//        assertEquals(12.0, r.calcularPerimetro(), 0.01,
//                "El perímetro debe ser 2 * (base + altura)");
//    }
//
//    @Test
//    public void testMostrarTipoFigura() {
//        Clase07Enunciados.Circulo c = clase.new Circulo(3);
//        assertEquals("Circulo", c.mostrarTipoFigura(),
//                "Debe devolver el nombre de la clase");
//    }
//
//    // ============================================================
//    // B. ENCAPSULAMIENTO
//    // ============================================================
//
//    @Test
//    public void testCuentaDeposito() {
//        Clase07Enunciados.Cuenta cuenta = clase.new Cuenta("Ana", 100);
//        cuenta.depositar(50);
//        assertEquals(150, cuenta.getSaldo(), 0.01,
//                "El saldo debe aumentar con el depósito");
//    }
//
//    @Test
//    public void testCuentaRetiro() {
//        Clase07Enunciados.Cuenta cuenta = clase.new Cuenta("Ana", 200);
//        cuenta.retirar(50);
//        assertEquals(150, cuenta.getSaldo(), 0.01,
//                "El saldo debe disminuir con el retiro");
//    }
//
//    @Test
//    public void testMostrarDatosCuenta() {
//        Clase07Enunciados.Cuenta cuenta = clase.new Cuenta("Juan", 500);
//        assertTrue(cuenta.mostrarDatos().contains("Titular: Juan"),
//                "Debe incluir el titular en el texto");
//    }
//
//    // ============================================================
//    // C. HERENCIA
//    // ============================================================
//
//    @Test
//    public void testMotoDescribir() {
//        Clase07Enunciados.Moto moto = clase.new Moto("Yamaha", "XTZ", 250);
//        assertEquals("Vehículo Yamaha XTZ - Cilindrada: 250cc", moto.describir());
//    }
//
//    @Test
//    public void testCamionDescribir() {
//        Clase07Enunciados.Camion camion = clase.new Camion("Volvo", "FH", 18);
//        assertEquals("Vehículo Volvo FH - Capacidad: 18 toneladas", camion.describir());
//    }
//
//    @Test
//    public void testVehiculoEncender() {
//        Clase07Enunciados.Vehiculo v = clase.new Vehiculo("Ford", "Focus");
//        assertEquals("El vehículo está encendido", v.encender());
//    }
//
//    @Test
//    public void testVehiculoApagar() {
//        Clase07Enunciados.Vehiculo v = clase.new Vehiculo("Ford", "Focus");
//        assertEquals("El vehículo está apagado", v.apagar());
//    }
//
//    // ============================================================
//    // D. POLIMORFISMO
//    // ============================================================
//
//    @Test
//    public void testPerroSonido() {
//        Clase07Enunciados.Perro p = clase.new Perro();
//        assertEquals("Guau", p.sonido());
//    }
//
//    @Test
//    public void testGatoSonido() {
//        Clase07Enunciados.Gato g = clase.new Gato();
//        assertEquals("Miau", g.sonido());
//    }
//
//    @Test
//    public void testVacaSonido() {
//        Clase07Enunciados.Vaca v = clase.new Vaca();
//        assertEquals("Muu", v.sonido());
//    }
//
//    @Test
//    public void testReproducirSonido() {
//        Clase07Enunciados.Animal a = clase.new Perro();
//        assertEquals("Guau", clase.reproducirSonido(a));
//    }
//
//    @Test
//    public void testRecorrerSonidos() {
//        Clase07Enunciados.Animal[] animales = {
//                clase.new Perro(), clase.new Gato(), clase.new Vaca()
//        };
//        assertEquals("Guau Miau Muu", clase.recorrerSonidos(animales));
//    }
//
//    // ============================================================
//    // E. INTERFACES Y COMBINACIÓN DE PILARES
//    // ============================================================
//
//    @Test
//    public void testOperableCirculo() {
//        Clase07Enunciados.Operable o = clase.new Circulo(2);
//        assertEquals(12.5664, o.operar(), 0.0001);
//    }
//
//    @Test
//    public void testCalculadoraFigurasTotal() {
//        Clase07Enunciados.Operable[] figuras = {
//                clase.new Circulo(1),
//                clase.new Rectangulo(2, 3)
//        };
//        Clase07Enunciados.CalculadoraFiguras calc = clase.new CalculadoraFiguras();
//        assertEquals(9.1416, calc.calcularTotal(figuras), 0.01);
//    }
//
//    @Test
//    public void testContarFigurasGrandes() {
//        Clase07Enunciados.Operable[] figuras = {
//                clase.new Circulo(2),
//                clase.new Rectangulo(1, 1),
//                clase.new Circulo(3)
//        };
//        Clase07Enunciados.CalculadoraFiguras calc = clase.new CalculadoraFiguras();
//        assertEquals(2, calc.contarFigurasGrandes(figuras, 5));
//    }
//
//    @Test
//    public void testEmpleadoPresentar() {
//        Clase07Enunciados.Empleado e = clase.new Empleado("Laura", 2000);
//        assertTrue(e.presentar().contains("Laura"));
//    }
//
//    @Test
//    public void testProgramadorPresentar() {
//        Clase07Enunciados.Programador p = clase.new Programador("Ana", 2500, "Java");
//        assertTrue(p.presentar().contains("Java"));
//    }
//
//    @Test
//    public void testDisenadorPresentar() {
//        Clase07Enunciados.Disenador d = clase.new Disenador("Pablo", 2200, "Photoshop");
//        assertTrue(d.presentar().contains("Photoshop"));
//    }
//
//    @Test
//    public void testMostrarEquipo() {
//        Clase07Enunciados.Empleado[] equipo = {
//                clase.new Programador("Ana", 2500, "Java"),
//                clase.new Disenador("Pablo", 2200, "Photoshop")
//        };
//        assertTrue(clase.mostrarEquipo(equipo).contains("Java"));
//        assertTrue(clase.mostrarEquipo(equipo).contains("Photoshop"));
//    }
//
//    // ============================================================
//    // F. POLIMORFISMO Y JERARQUÍAS AVANZADAS
//    // ============================================================
//
//    @Test
//    public void testInstrumentoSonido() {
//        Clase07Enunciados.Instrumento i = clase.new Guitarra();
//        assertEquals("Sonido de guitarra", i.tocar());
//    }
//
//    @Test
//    public void testTocarInstrumento() {
//        Clase07Enunciados.Instrumento i = clase.new Piano();
//        assertEquals("Sonido de piano", clase.tocarInstrumento(i));
//    }
//
//    @Test
//    public void testOrquesta() {
//        Clase07Enunciados.Instrumento[] lista = {
//                clase.new Guitarra(), clase.new Piano(), clase.new Tambor()
//        };
//        assertEquals("Sonido de guitarra Sonido de piano Sonido de tambor", clase.orquesta(lista));
//    }
//
//    @Test
//    public void testCuboVolumen() {
//        Clase07Enunciados.Cubo c = clase.new Cubo(3);
//        assertEquals(27.0, c.calcularVolumen(), 0.01);
//    }
//
//    @Test
//    public void testCilindroVolumen() {
//        Clase07Enunciados.Cilindro ci = clase.new Cilindro(2, 3);
//        assertEquals(37.699, ci.calcularVolumen(), 0.01);
//    }
//
//    @Test
//    public void testMostrarInformacion3D() {
//        Clase07Enunciados.Cilindro ci = clase.new Cilindro(2, 3);
//        assertTrue(clase.mostrarInformacion3D(ci).contains("Cilindro"));
//        assertTrue(clase.mostrarInformacion3D(ci).contains("37.7"));
//    }
}
