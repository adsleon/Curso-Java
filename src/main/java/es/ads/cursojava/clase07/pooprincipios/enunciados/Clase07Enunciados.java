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

package es.ads.cursojava.clase07.pooprincipios.enunciados;

/**
 * Ejercicios de la Clase 07 - Paradigmas de la Programación Orientada a Objetos
 *
 * Contenido:
 * - Abstracción
 * - Encapsulamiento
 * - Herencia
 * - Polimorfismo
 *
 * Cada ejercicio se centra en aplicar uno o más de estos principios.
 */
public class Clase07Enunciados {

    // ===========================================
    // A. ABSTRACCIÓN
    // ===========================================

    // 1. Crea una clase abstracta "Figura" con métodos abstractos:
    //    double calcularArea() y double calcularPerimetro()
    // 2. Crea una clase "Circulo" que extienda de "Figura" y tenga un atributo radio
    // 3. Implementa los métodos calcularArea y calcularPerimetro
    // 4. Crea una clase "Rectangulo" que extienda Figura con base y altura
    // 5. Implementa sus métodos calcularArea y calcularPerimetro
    // 6. Crea un método mostrarTipoFigura() que devuelva el nombre de la clase

    public abstract class Figura {
        // COMPLETAR: atributos, métodos abstractos y método mostrarTipoFigura()
    }

    public class Circulo extends Figura {
        // COMPLETAR: atributos, constructor e implementación de los métodos
    }

    public class Rectangulo extends Figura {
        // COMPLETAR: atributos, constructor e implementación de los métodos
    }


    // ===========================================
    // B. ENCAPSULAMIENTO
    // ===========================================

    // 7. Crea una clase "Cuenta" con atributos privados:
    //    titular (String) y saldo (double)
    // 8. Crea un constructor que inicialice ambos
    // 9. Implementa métodos públicos getSaldo() y depositar(double)
    // 10. Implementa un método privado validarCantidad(double) que asegure que el valor sea > 0
    // 11. Implementa retirar(double) usando el método validarCantidad()
    // 12. Crea un método mostrarDatos() que retorne "Titular: [t], Saldo: [s]"

    public class Cuenta {
        // COMPLETAR: atributos, constructor y métodos
    }


    // ===========================================
    // C. HERENCIA
    // ===========================================

    // 13. Crea una clase "Vehiculo" con atributos: marca, modelo
    // 14. Crea un método describir() que retorne "Vehículo [marca] [modelo]"
    // 15. Crea una clase "Moto" que herede de Vehiculo y añada cilindrada (int)
    // 16. Sobrescribe describir() para incluir la cilindrada
    // 17. Crea una clase "Camion" que herede de Vehiculo y añada capacidad (int toneladas)
    // 18. Sobrescribe describir() para mostrar la capacidad
    // 19. Crea un método en Vehiculo llamado encender() que devuelva "El vehículo está encendido"
    // 20. Crea un método apagar() que devuelva "El vehículo está apagado"

    public class Vehiculo {
        // COMPLETAR: atributos y métodos
    }

    public class Moto extends Vehiculo {
        // COMPLETAR: atributos, constructor y métodos sobrescritos
    }

    public class Camion extends Vehiculo {
        // COMPLETAR: atributos, constructor y métodos sobrescritos
    }


    // ===========================================
    // D. POLIMORFISMO
    // ===========================================

    // 21. Crea una clase abstracta "Animal" con método abstracto sonido()
    // 22. Crea una clase "Perro" que sobrescriba sonido() -> "Guau"
    // 23. Crea una clase "Gato" que sobrescriba sonido() -> "Miau"
    // 24. Crea una clase "Vaca" que sobrescriba sonido() -> "Muu"
    // 25. Crea un método reproducirSonido(Animal a) que retorne el sonido del animal recibido
    // 26. Usa polimorfismo para probar varios animales
    // 27. Crea un array de tipo Animal con Perro, Gato y Vaca
    // 28. Crea un método recorrerSonidos(Animal[] animales) que retorne los sonidos concatenados
    // 29. Añade un método tipoAnimal() que devuelva el nombre de la clase
    // 30. Usa polimorfismo para invocar métodos específicos según el tipo

    public abstract class Animal {
        // COMPLETAR: método abstracto sonido() y método tipoAnimal()
    }

    public class Perro extends Animal {
        // COMPLETAR: implementación de sonido()
    }

    public class Gato extends Animal {
        // COMPLETAR: implementación de sonido()
    }

    public class Vaca extends Animal {
        // COMPLETAR: implementación de sonido()
    }

    public String reproducirSonido(Animal a) {
        // COMPLETAR: retornar el sonido del animal usando polimorfismo
        return "";
    }

    public String recorrerSonidos(Animal[] animales) {
        // COMPLETAR: concatenar los sonidos de todos los animales
        return "";
    }


    // ===========================================
    // E. COMBINANDO LOS PILARES
    // ===========================================

    // 31. Crea una interfaz "Operable" con método operar()
    // 32. Haz que Figura implemente Operable
    // 33. Implementa operar() en Circulo y Rectangulo (que retorne el área)
    // 34. Crea una clase "CalculadoraFiguras" con un método calcularTotal(Operable[] lista)
    //     que sume los resultados de operar()
    // 35. Crea un método contarFigurasGrandes(Operable[] lista, double limite)
    //     que cuente cuántas tienen área mayor a ese límite
    // 36. Crea una clase "Empleado" con nombre y salario
    // 37. Crea una clase "Programador" que herede de Empleado y añada lenguaje
    // 38. Crea una clase "Diseñador" que herede de Empleado y añada herramienta
    // 39. Sobrescribe presentar() en cada uno con sus datos específicos
    // 40. Crea un método mostrarEquipo(Empleado[] equipo) que liste sus presentaciones

    public interface Operable {
        // COMPLETAR: método operar()
    }

    public class CalculadoraFiguras {
        // COMPLETAR: métodos calcularTotal() y contarFigurasGrandes()
    }

    public class Empleado {
        // COMPLETAR: atributos, constructor y método presentar()
    }

    public class Programador extends Empleado {
        // COMPLETAR: atributos, constructor y método presentar()
    }

    public class Disenador extends Empleado {
        // COMPLETAR: atributos, constructor y método presentar()
    }

    public String mostrarEquipo(Empleado[] equipo) {
        // COMPLETAR: concatenar presentaciones de los empleados
        return "";
    }


    // ===========================================
    // F. EJERCICIOS EXTRA DE POLIMORFISMO Y JERARQUÍAS
    // ===========================================

    // 41. Crea una clase abstracta "Instrumento" con método tocar()
    // 42. Crea subclases "Guitarra", "Piano" y "Tambor"
    // 43. Implementa tocar() en cada una
    // 44. Crea un método tocarInstrumento(Instrumento i)
    // 45. Crea un método orquesta(Instrumento[] lista) que concatene todos los sonidos
    // 46. Crea una clase "Figura3D" que extienda Figura e incluya altura
    // 47. Implementa calcularVolumen()
    // 48. Crea subclases "Cubo" y "Cilindro"
    // 49. Implementa sus métodos según la fórmula correspondiente
    // 50. Crea un método mostrarInformacion3D() que devuelva tipo y volumen

    public abstract class Instrumento {
        // COMPLETAR: método abstracto tocar()
    }

    public class Guitarra extends Instrumento {
        // COMPLETAR: implementación de tocar()
    }

    public class Piano extends Instrumento {
        // COMPLETAR: implementación de tocar()
    }

    public class Tambor extends Instrumento {
        // COMPLETAR: implementación de tocar()
    }

    public String tocarInstrumento(Instrumento i) {
        // COMPLETAR: retornar el sonido según el instrumento
        return "";
    }

    public String orquesta(Instrumento[] lista) {
        // COMPLETAR: concatenar sonidos
        return "";
    }

    public abstract class Figura3D extends Figura {
        // COMPLETAR: incluir atributo altura y método calcularVolumen()
    }

    public class Cubo extends Figura3D {
        // COMPLETAR: implementación de volumen y métodos
    }

    public class Cilindro extends Figura3D {
        // COMPLETAR: implementación de volumen y métodos
    }

    public String mostrarInformacion3D(Figura3D f) {
        // COMPLETAR: retornar tipo y volumen
        return "";
    }
}
