/*
 * Copyright (c) 2025 Rubén Bécares Álvarez
 *
 * Licencia: CC BY-NC 4.0
 * Uso permitido solo para fines personales o educativos.
 * Prohibido el uso comercial sin autorización expresa del autor.
 * Última modificación: 30/9/2025
 *
 *
 */

package clase06_poo.explicativos;

import java.util.Objects;

/**
 * Clase PersonaBasica
 * ----------------------------------------
 * Una clase es un "molde" o plantilla.
 * Los objetos son instancias creadas a partir de esa clase.
 * <p>
 * Esta clase define:
 * - Atributos: nombre y edad
 * - Métodos: presentarse
 */
public class PersonaCompleta {
    // Atributos (características)
    String nombre;
    int edad;

    // Constructor sin parámetros
    public PersonaCompleta() {
        this.setNombre("Sin nombre");
        this.setEdad(0);
    }

    // Constructor con parámetros
    public PersonaCompleta(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    // Método (comportamiento)
    public void presentarse() {
        System.out.println("Hola, me llamo " + this.nombre + " y tengo " + this.edad + " años.");
    }

    // Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Sobreescribir toString
    @Override
    public String toString() {
        return "Persona [nombre=" + this.nombre + ", edad=" + this.edad + "]";
    }

//    // Comparar dos personas por nombre y edad
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof PersonaCompleta)) return false;
//        PersonaCompleta persona = (PersonaCompleta) o;
//        return edad == persona.edad && Objects.equals(nombre, persona.nombre);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nombre, edad);
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        PersonaCompleta that = (PersonaCompleta) o;
        return this.edad == that.edad && Objects.equals(this.nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nombre, this.edad);
    }

    public static void main(String[] args) {
        // Crear objetos (instancias de PersonaBasica)
        PersonaCompleta p1 = new PersonaCompleta();
        p1.nombre = "Ana";
        p1.edad = 20;

        PersonaCompleta p2 = new PersonaCompleta();
        p2.nombre = "Luis";
        p2.edad = 25;

        // Usar métodos
        p1.presentarse();
        p2.presentarse();
    }
}
