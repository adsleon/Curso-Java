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

package es.ads.cursojava.clase08.modificadorespaquetes.enunciados;

/**
 * Ejercicios de la Clase 08 - Modificadores y Paquetes
 *
 * Contenido:
 * - Modificadores de acceso
 * - Modificadores de clase, método y atributo
 * - Paquetes y organización modular
 * - Importación y visibilidad entre clases
 */

public class Clase08Enunciados {

    // ======================================================
    // A. MODIFICADORES DE ACCESO (public, private, protected)
    // ======================================================

    // 1. Crea una clase "Persona" con atributos privados: nombre, edad
    // 2. Crea métodos públicos getNombre() y setNombre(String)
    // 3. Crea un método protegido getEdad() y un setter público setEdad(int)
    // 4. Crea un método mostrarInformacion() que devuelva "Nombre: [n], Edad: [e]"
    // 5. Verifica que solo se pueda acceder directamente a los atributos desde la propia clase.

    public class Persona {
        // COMPLETAR: atributos, constructor y métodos
    }


    // ======================================================
    // B. MODIFICADORES STATIC Y FINAL
    // ======================================================

    // 6. Crea una clase "Matematica" con un atributo estático final PI = 3.1416
    // 7. Crea un método estático sumar(int a, int b)
    // 8. Crea un método estático multiplicar(double a, double b)
    // 9. Crea un método no estático que use PI para calcular el área de un círculo
    // 10. Prueba acceder a PI y sumar() sin crear instancia

    public static class Matematica {
        // COMPLETAR: constantes, métodos estáticos y no estáticos
    }


    // ======================================================
    // C. CLASES Y MÉTODOS FINALES
    // ======================================================

    // 11. Crea una clase final "Constantes" que contenga:
    //     - Un atributo final String AUTOR = "Rubén"
    //     - Un método final obtenerAutor() que retorne el autor
    // 12. Intenta heredar de "Constantes" (debe generar error si lo intentas)

    public final class Constantes {
        // COMPLETAR: atributo y método final
    }

    // 13. Crea una clase "Extendida" e intenta sobreescribir obtenerAutor()
    //     (No debe ser posible al ser un método final)

    public class Extendida /* extends Constantes */ {
        // COMPLETAR: demostración de intento de sobreescritura (comentado)
    }


    // ======================================================
    // D. CLASES ABSTRACTAS Y PROTEGIDAS
    // ======================================================

    // 14. Crea una clase abstracta "Empleado" con:
    //     - nombre (String)
    //     - salario (double)
    //     - método abstracto calcularBonus()
    // 15. Crea una clase "Gerente" que extienda Empleado y multiplique su salario * 1.2
    // 16. Crea una clase "Asistente" que extienda Empleado y multiplique su salario * 1.1
    // 17. Agrega un método protegido mostrarDatos() que devuelva el nombre y salario

    public abstract class Empleado {
        // COMPLETAR: atributos, constructor, métodos abstractos y protegidos
    }

    public class Gerente extends Empleado {
        // COMPLETAR: implementación de calcularBonus()
    }

    public class Asistente extends Empleado {
        // COMPLETAR: implementación de calcularBonus()
    }


    // ======================================================
    // E. PAQUETES Y VISIBILIDAD ENTRE ELLOS
    // ======================================================

    // 18. Crea un paquete nuevo "empresa" y dentro una clase "Departamento"
    // 19. Departamento debe tener un atributo "nombre" con visibilidad por defecto (package-private)
    // 20. Crea métodos públicos setNombre() y getNombre()
    // 21. Desde esta clase (Clase08Enunciados) accede a los métodos públicos, no al atributo directamente.
    // 22. Comprueba que desde otro paquete no se puede acceder a nombre sin getter/setter.

    // Simulación: Clase interna que representa "empresa.Departamento"
    public static class Departamento {
        String nombre; // visibilidad por defecto (sin modificador)
        public void setNombre(String n) { this.nombre = n; }
        public String getNombre() { return this.nombre; }
    }

    // ======================================================
    // F. USO DE IMPORTACIONES Y ACCESO ENTRE CLASES
    // ======================================================

    // 23. Crea una clase "Proyecto" en este mismo paquete
    // 24. Declara un atributo privado nombreProyecto
    // 25. Declara un atributo público estático contador
    // 26. Declara un método público asignarNombre(String)
    // 27. Declara un método público obtenerNombre()
    // 28. Declara un método estático aumentarContador()
    // 29. Crea una clase "GestorProyecto" que cree proyectos y aumente el contador
    // 30. Devuelve el número total de proyectos creados

    public static class Proyecto {
        // COMPLETAR: atributos, constructor, métodos y contador estático
    }

    public static class GestorProyecto {
        // COMPLETAR: método crearProyecto() que use Proyecto.aumentarContador()
    }


    // ======================================================
    // G. COMBINANDO MODIFICADORES
    // ======================================================

    // 31. Crea una clase "Configuracion" con atributos:
    //     - final String version = "1.0"
    //     - static int maxUsuarios = 100
    // 32. Crea un método estático cambiarMaxUsuarios(int nuevo)
    // 33. Crea un método mostrarConfiguracion() que devuelva versión y maxUsuarios
    // 34. Haz que el método mostrarConfiguracion() sea final

    public static class Configuracion {
        // COMPLETAR: atributos y métodos
    }


    // ======================================================
    // H. ACCESO ENTRE CLASES ANIDADAS Y PROTEGIDAS
    // ======================================================

    // 35. Crea una clase externa "Universidad"
    // 36. Dentro de ella, crea una clase interna protegida "Alumno"
    // 37. El alumno debe tener nombre y nota
    // 38. Universidad debe tener un método crearAlumno(String, double)
    // 39. Crea un método en Universidad para mostrar la información del alumno
    // 40. Asegúrate de que Alumno no sea accesible fuera de Universidad

    public class Universidad {
        // COMPLETAR: clase interna protegida Alumno y métodos de creación/visualización
    }


    // ======================================================
    // I. MÉTODOS Y ATRIBUTOS ESTÁTICOS ENTRE CLASES
    // ======================================================

    // 41. Crea una clase "ContadorGlobal" con atributo estático totalAccesos
    // 42. Crea un método estático incrementar()
    // 43. Crea un método estático obtenerTotal()
    // 44. Crea una clase "Pagina" que incremente el contador cada vez que se accede
    // 45. Crea un método obtenerVisitas() que devuelva el total del contador

    public static class ContadorGlobal {
        // COMPLETAR: contador y métodos
    }

    public static class Pagina {
        // COMPLETAR: incrementar el contador global y devolver total
    }


    // ======================================================
    // J. RESUMEN DE USO COMBINADO
    // ======================================================

    // 46. Crea una clase abstracta "Documento"
    // 47. Agrega atributos privados titulo y tamaño
    // 48. Crea métodos getter/setter públicos
    // 49. Agrega método abstracto imprimir()
    // 50. Crea una subclase "PDF" con implementación concreta de imprimir()

    public abstract class Documento {
        // COMPLETAR: atributos, métodos y abstract imprimir()
    }

    public class PDF extends Documento {
        // COMPLETAR: implementación de imprimir()
    }
}
