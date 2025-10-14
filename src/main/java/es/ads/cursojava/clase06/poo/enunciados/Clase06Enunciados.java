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

package es.ads.cursojava.clase06.poo.enunciados;

/**
 * Clase de ejercicios para practicar los fundamentos de la Programación Orientada a Objetos (POO).
 *
 * Los ejercicios cubren:
 * - Atributos
 * - Constructores
 * - Métodos
 * - Encapsulamiento (getters/setters)
 * - Relaciones entre clases
 * - Herencia
 * - Uso de objetos
 */
public class Clase06Enunciados {

    // ====================================
    // A. Atributos y creación de objetos
    // ====================================

    // 1. Declara una clase interna "Persona" con atributos: nombre (String), edad (int)
    // 2. Crea un constructor que inicialice ambos atributos
    // 3. Crea un método getNombre()
    // 4. Crea un método getEdad()
    // 5. Crea un método setNombre()
    // 6. Crea un método setEdad()
    // 7. Crea un método saludar() que retorne "Hola, soy [nombre]"
    // 8. Crea un método esMayorEdad() que devuelva true si la edad >= 18
    // 9. Crea un método cumplirAnios() que incremente la edad en 1
    // 10. Crea un método presentar() que retorne "Nombre: [nombre], Edad: [edad]"

    public class Persona {
        // COMPLETAR: atributos, constructor y métodos según el enunciado
    }


    // ====================================
    // B. Constructores y sobrecarga
    // ====================================

    // 11. Crea una clase interna "Rectangulo" con base y altura
    // 12. Crea un constructor que inicialice ambos valores
    // 13. Crea un constructor vacío que asigne base=1 y altura=1
    // 14. Crea un método area() que retorne base * altura
    // 15. Crea un método perimetro() que retorne 2*(base+altura)
    // 16. Sobrecarga el constructor para aceptar un solo valor (cuadrado)
    // 17. Crea un método esCuadrado() que devuelva true si base==altura
    // 18. Crea un método mostrarDatos() que retorne "Base: [b], Altura: [h]"
    // 19. Crea un método setBase(double base)
    // 20. Crea un método setAltura(double altura)

    public class Rectangulo {
        // COMPLETAR: atributos, constructores y métodos
    }


    // ====================================
    // C. Relaciones entre objetos
    // ====================================

    // 21. Crea una clase "CuentaBancaria" con atributos: titular (Persona) y saldo (double)
    // 22. Crea un constructor con ambos parámetros
    // 23. Crea métodos depositar(double cantidad) y retirar(double cantidad)
    // 24. Crea un método getSaldo()
    // 25. Crea un método getTitularNombre()
    // 26. Crea un método transferir(CuentaBancaria destino, double monto)
    // 27. Evita transferencias con saldo insuficiente
    // 28. Crea un método mostrarDatos() con el nombre del titular y el saldo
    // 29. Crea un método tieneSaldoPositivo() que devuelva true si saldo > 0
    // 30. Crea un método cerrarCuenta() que ponga saldo a 0

    public class CuentaBancaria {
        // COMPLETAR: atributos, constructor y métodos
    }


    // ====================================
    // D. Herencia
    // ====================================

    // 31. Crea una clase "Empleado" que herede de "Persona"
    // 32. Añade un atributo salario (double)
    // 33. Crea un constructor que inicialice nombre, edad y salario
    // 34. Crea un método getSalario()
    // 35. Crea un método aumentarSalario(double porcentaje)
    // 36. Sobrescribe el método presentar() para incluir el salario
    // 37. Crea una clase "Gerente" que herede de "Empleado"
    // 38. Añade un atributo departamento (String)
    // 39. Sobrescribe presentar() para mostrar también el departamento
    // 40. Crea un método dirigir() que retorne "Dirigiendo el departamento [departamento]"

    public class Empleado extends Persona {
        // COMPLETAR: atributos, constructores y métodos
    }

    public class Gerente extends Empleado {
        // COMPLETAR: atributos, constructores y métodos
    }


    // ====================================
    // E. POO aplicada
    // ====================================

    // 41. Crea una clase "Coche" con marca, modelo y velocidad
    // 42. Crea un método acelerar(int cantidad) que aumente la velocidad
    // 43. Crea un método frenar(int cantidad) que disminuya la velocidad sin ser negativa
    // 44. Crea un método mostrarDatos()
    // 45. Crea un método esRapido() si velocidad > 120
    // 46. Crea una clase "Garaje" que tenga un array de Coche
    // 47. Crea un método agregarCoche(Coche c)
    // 48. Crea un método contarCochesRapidos()
    // 49. Crea un método obtenerMasRapido()
    // 50. Crea un método mostrarTodos() que retorne los datos de todos los coches

    public class Coche {
        // COMPLETAR: atributos, constructor y métodos
    }

    public class Garaje {
        // COMPLETAR: atributos, constructor y métodos
    }
}
