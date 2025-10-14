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

package es.ads.cursojava.clase08.modificadorespaquetes;

import es.ads.cursojava.clase08.modificadorespaquetes.enunciados.Clase08Enunciados;

public class Clase08Tests {

    Clase08Enunciados clase = new Clase08Enunciados();

    // ======================================================
    // A. MODIFICADORES DE ACCESO
    // ======================================================

//    @Test
//    public void testPersonaGettersSetters() {
//        Clase08Enunciados.Persona p = clase.new Persona();
//        p.setNombre("Laura");
//        p.setEdad(22);
//        assertEquals("Laura", p.getNombre(), "Debe poder obtener el nombre con getNombre()");
//        assertEquals("Nombre: Laura, Edad: 22", p.mostrarInformacion(),
//                "Debe mostrar la información completa con formato correcto");
//    }
//
//    @Test
//    public void testAtributosPrivados() {
//        Clase08Enunciados.Persona p = clase.new Persona();
//        // Este test no puede acceder directamente a los atributos; si compila, el alumno erró.
//        assertDoesNotThrow(() -> p.getNombre(),
//                "Los atributos deben ser privados; acceso solo mediante métodos.");
//    }
//
//
//    // ======================================================
//    // B. STATIC Y FINAL
//    // ======================================================
//
//    @Test
//    public void testConstantePI() {
//        assertEquals(3.1416, Clase08Enunciados.Matematica.PI, 0.0001,
//                "La constante PI debe tener el valor 3.1416");
//    }
//
//    @Test
//    public void testSumarEstatico() {
//        assertEquals(9, Clase08Enunciados.Matematica.sumar(4, 5),
//                "El método sumar() debe funcionar sin instancia");
//    }
//
//    @Test
//    public void testAreaCirculoConPI() {
//        Clase08Enunciados.Matematica m = new Clase08Enunciados.Matematica();
//        assertEquals(12.5664, m.calcularAreaCirculo(2), 0.0001,
//                "Debe usar PI * r^2 para calcular el área");
//    }
//
//
//    // ======================================================
//    // C. FINAL (clases y métodos)
//    // ======================================================
//
//    @Test
//    public void testConstantesAutor() {
//        Clase08Enunciados.Constantes c = new Clase08Enunciados.Constantes();
//        assertEquals("Rubén", c.obtenerAutor(),
//                "El método final obtenerAutor() debe devolver 'Rubén'");
//    }
//
//    @Test
//    public void testClaseFinalNoHereda() {
//        // No se puede instanciar Extendida que herede de Constantes (comentado en enunciado)
//        assertTrue(true, "La clase Constantes no debe poder heredarse");
//    }
//
//
//    // ======================================================
//    // D. ABSTRACTAS Y PROTEGIDAS
//    // ======================================================
//
//    @Test
//    public void testGerenteBonus() {
//        Clase08Enunciados.Gerente g = clase.new Gerente("Ana", 1000);
//        assertEquals(1200, g.calcularBonus(), 0.01,
//                "El gerente debe recibir salario * 1.2");
//    }
//
//    @Test
//    public void testAsistenteBonus() {
//        Clase08Enunciados.Asistente a = clase.new Asistente("Luis", 1000);
//        assertEquals(1100, a.calcularBonus(), 0.01,
//                "El asistente debe recibir salario * 1.1");
//    }
//
//    @Test
//    public void testMostrarDatosProtegido() {
//        Clase08Enunciados.Gerente g = clase.new Gerente("Ana", 2000);
//        assertTrue(g.mostrarDatos().contains("Ana"),
//                "El método protegido mostrarDatos() debe mostrar el nombre");
//    }
//
//
//    // ======================================================
//    // E. PAQUETES Y VISIBILIDAD ENTRE ELLOS
//    // ======================================================
//
//    @Test
//    public void testDepartamentoNombre() {
//        Clase08Enunciados.Departamento d = new Clase08Enunciados.Departamento();
//        d.setNombre("Recursos Humanos");
//        assertEquals("Recursos Humanos", "El nombre del departamento debe poder obtenerse solo con getter",
//                d.getNombre());
//    }
//
//
//    // ======================================================
//    // F. IMPORTACIONES Y ACCESO ENTRE CLASES
//    // ======================================================
//
//    @Test
//    public void testProyectoContador() {
//        Clase08Enunciados.Proyecto p1 = new Clase08Enunciados.Proyecto();
//        Clase08Enunciados.Proyecto.aumentarContador();
//        assertTrue(Clase08Enunciados.Proyecto.contador >= 1,
//                "Debe aumentar el contador estático de proyectos");
//    }
//
//    @Test
//    public void testGestorCreaProyecto() {
//        Clase08Enunciados.GestorProyecto g = new Clase08Enunciados.GestorProyecto();
//        g.crearProyecto("Sistema Interno");
//        assertTrue(Clase08Enunciados.Proyecto.contador > 0,
//                "El gestor debe incrementar el contador al crear proyectos");
//    }
//
//
//    // ======================================================
//    // G. COMBINACIÓN DE MODIFICADORES
//    // ======================================================
//
//    @Test
//    public void testConfiguracionVersion() {
//        Clase08Enunciados.Configuracion c = new Clase08Enunciados.Configuracion();
//        assertEquals("1.0", c.getVersion(),
//                "La versión debe ser final e inmutable");
//    }
//
//    @Test
//    public void testCambiarMaxUsuarios() {
//        Clase08Enunciados.Configuracion.cambiarMaxUsuarios(250);
//        assertEquals(250, Clase08Enunciados.Configuracion.maxUsuarios,
//                "Debe poder cambiar el valor estático de maxUsuarios");
//    }
//
//    @Test
//    public void testMostrarConfiguracion() {
//        Clase08Enunciados.Configuracion c = new Clase08Enunciados.Configuracion();
//        assertTrue(c.mostrarConfiguracion().contains("1.0"),
//                "Debe mostrar la versión y el número de usuarios");
//    }
//
//
//    // ======================================================
//    // H. CLASES ANIDADAS Y PROTEGIDAS
//    // ======================================================
//
//    @Test
//    public void testUniversidadCreaAlumno() {
//        Clase08Enunciados.Universidad u = clase.new Universidad();
//        u.crearAlumno("Mario", 8.5);
//        assertTrue(u.mostrarAlumno().contains("Mario"),
//                "Debe mostrar los datos del alumno creado");
//    }
//
//
//    // ======================================================
//    // I. ATRIBUTOS Y MÉTODOS ESTÁTICOS ENTRE CLASES
//    // ======================================================
//
//    @Test
//    public void testContadorGlobal() {
//        int inicial = Clase08Enunciados.ContadorGlobal.obtenerTotal();
//        Clase08Enunciados.ContadorGlobal.incrementar();
//        assertEquals(inicial + 1, Clase08Enunciados.ContadorGlobal.obtenerTotal(),
//                "El contador global debe incrementarse");
//    }
//
//    @Test
//    public void testPaginaIncrementaContador() {
//        Clase08Enunciados.Pagina p = new Clase08Enunciados.Pagina();
//        p.acceder();
//        assertTrue(p.obtenerVisitas() > 0,
//                "Cada acceso debe incrementar el contador global");
//    }
//
//
//    // ======================================================
//    // J. DOCUMENTOS Y RESUMEN DE MODIFICADORES
//    // ======================================================
//
//    @Test
//    public void testPDFImprimir() {
//        Clase08Enunciados.PDF pdf = clase.new PDF("Manual de Usuario", 5.2);
//        assertTrue(pdf.imprimir().contains("Manual de Usuario"),
//                "Debe imprimir el título del documento");
//    }
//
//    @Test
//    public void testPDFHeredaDeDocumento() {
//        Clase08Enunciados.Documento doc = clase.new PDF("Informe", 3.1);
//        assertEquals("Imprimiendo PDF: Informe", doc.imprimir(),
//                "Debe cumplir con el polimorfismo del método abstracto imprimir()");
//    }
//
//    @Test
//    public void testEncapsulamientoDocumento() {
//        Clase08Enunciados.PDF pdf = clase.new PDF("Contrato", 2.5);
//        pdf.setTitulo("Contrato Final");
//        assertEquals("Contrato Final", pdf.getTitulo(),
//                "Los atributos deben ser privados y accesibles mediante getters/setters");
//    }
//
//    @Test
//    public void testTamanioDocumento() {
//        Clase08Enunciados.PDF pdf = clase.new PDF("Informe", 10.5);
//        assertEquals(10.5, pdf.getTamanio(), 0.001,
//                "Debe permitir obtener el tamaño correctamente");
//    }
//
//    @Test
//    public void testImprimirPolimorfismo() {
//        Clase08Enunciados.Documento doc = clase.new PDF("Prueba", 1.0);
//        assertEquals("Imprimiendo PDF: Prueba", doc.imprimir(),
//                "Debe aplicar correctamente el polimorfismo en imprimir()");
//    }

}
