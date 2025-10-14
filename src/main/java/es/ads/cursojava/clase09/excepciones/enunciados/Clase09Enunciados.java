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

package es.ads.cursojava.clase09.excepciones.enunciados;

public class Clase09Enunciados {

    // ==================================================
    // A. Excepciones básicas (try - catch - finally)
    // ==================================================

    // 1. Divide dos números, manejando la excepción de división por cero.
    public int ejercicio1(int a, int b) {
        return 1;
    }

    // 2. Convierte un String a entero, atrapando NumberFormatException.
    public int ejercicio2(String texto) {
        return 1;
    }

    // 3. Accede a una posición de un array, manejando IndexOutOfBoundsException.
    public int ejercicio3(int[] arr, int pos) {
        return 0;
    }

    // 4. Muestra un mensaje en finally aunque ocurra una excepción.
    public String ejercicio4() {
        return "";
    }

    // 5. Captura una NullPointerException y devuelve un mensaje claro.
    public String ejercicio5(String texto) {
        return "";
    }

    // 6. Simula una excepción al intentar dividir un número negativo.
    public double ejercicio6(int valor) {
        return 0;
    }

    // 7. Intenta abrir un archivo inexistente y captura la excepción.
    public String ejercicio7(String nombreArchivo) {
        return "";
    }

    // 8. Usa múltiples bloques catch para distintos tipos de error (Arithmetic y NullPointer).
    public String ejercicio8(String texto, int divisor) {
        return "";
    }

    // 9. Utiliza finally para retornar un mensaje siempre ejecutado.
    public String ejercicio9() {
        return "";
    }

    // 10. Lanza manualmente una ArithmeticException si el divisor es 0.
    public int ejercicio10(int a, int b) {
        return 0;
    }


    // ==================================================
    // B. Excepciones personalizadas
    // ==================================================

    // 11. Crea una excepción personalizada EdadInvalidaException si la edad es menor que 0.
    public void ejercicio11(int edad) throws Exception {
    }

    // 12. Crea una excepción personalizada SaldoInsuficienteException si saldo < retiro.
    public void ejercicio12(double saldo, double retiro) throws Exception {
    }

    // 13. Crea una excepción personalizada TemperaturaFueraRangoException (0–100).
    public void ejercicio13(int temp) throws Exception {
    }

    // 14. Lanza una excepción personalizada si el usuario es null.
    public void ejercicio14(String usuario) throws Exception {
    }

    // 15. Crea una excepción de tipo checked llamada ArchivoNoEncontradoPersonalizadoException.
    public void ejercicio15(String nombre) throws Exception {
    }

    // 16. Crea una excepción Runtime personalizada para errores de conexión.
    public void ejercicio16(boolean conexionActiva) {
    }

    // 17. Lanza una excepción personalizada si la contraseña tiene menos de 6 caracteres.
    public void ejercicio17(String password) throws Exception {
    }

    // 18. Define una excepción personalizada para validar un número par.
    public void ejercicio18(int numero) throws Exception {
    }

    // 19. Crea una excepción personalizada para nombres vacíos.
    public void ejercicio19(String nombre) throws Exception {
    }

    // 20. Crea una excepción personalizada para un valor fuera del rango 1–10.
    public void ejercicio20(int valor) throws Exception {
    }


    // ==================================================
    // C. Múltiples catch, throw y throws
    // ==================================================

    // 21. Usa múltiples catch: NumberFormatException y ArithmeticException.
    public String ejercicio21(String texto, int divisor) {
        return "";
    }

    // 22. Lanza y propaga una excepción al método principal usando throws.
    public void ejercicio22(int numero) throws Exception {
    }

    // 23. Usa try-with-resources con un recurso simulado.
    public String ejercicio23() {
        return "";
    }

    // 24. Captura IOException simulada.
    public String ejercicio24() {
        return "";
    }

    // 25. Usa throw para lanzar IllegalArgumentException si el valor es negativo.
    public void ejercicio25(int valor) {
    }

    // 26. Usa múltiples catch para diferenciar tipos de errores.
    public String ejercicio26(String valor) {
        return "";
    }

    // 27. Crea una función que intente parsear un número y devuelva “Error” si falla.
    public String ejercicio27(String texto) {
        return "";
    }

    // 28. Lanza una excepción si una cadena es nula o vacía.
    public void ejercicio28(String texto) throws Exception {
    }

    // 29. Usa un bloque finally para registrar un mensaje en consola.
    public String ejercicio29() {
        return "";
    }

    // 30. Captura una excepción general y retorna el mensaje del error.
    public String ejercicio30() {
        return "";
    }


    // ==================================================
    // D. Jerarquía y control de excepciones
    // ==================================================

    // 31. Crea una jerarquía de excepciones: BaseException -> HijaException.
    public void ejercicio31(boolean error) throws Exception {
    }

    // 32. Usa catch con la clase base para capturar ambas.
    public String ejercicio32(boolean errorBase) {
        return "";
    }

    // 33. Crea una excepción que extienda RuntimeException y otra Exception.
    public void ejercicio33(boolean tipo) throws Exception {
    }

    // 34. Simula una excepción lanzada desde un método privado.
    public String ejercicio34() {
        return "";
    }

    // 35. Captura y relanza una excepción.
    public void ejercicio35() throws Exception {
    }

    // 36. Usa una excepción checked personalizada dentro de un método con throws.
    public void ejercicio36() throws Exception {
    }

    // 37. Crea una excepción personalizada con mensaje detallado.
    public void ejercicio37(String operacion) throws Exception {
    }

    // 38. Captura una excepción dentro de otra (anidada).
    public String ejercicio38() {
        return "";
    }

    // 39. Lanza manualmente una excepción y captura su tipo.
    public String ejercicio39() {
        return "";
    }

    // 40. Crea una excepción que contenga otro objeto Exception dentro.
    public void ejercicio40() throws Exception {
    }


    // ==================================================
    // E. Prácticas finales (manejo robusto)
    // ==================================================

    // 41. Divide dos números con verificación manual antes de la división.
    public double ejercicio41(double a, double b) {
        return 1;
    }

    // 42. Crea una función que devuelva “Operación exitosa” si no hay error.
    public String ejercicio42(boolean error) {
        return "";
    }

    // 43. Captura cualquier excepción e imprime su stack trace.
    public String ejercicio43() {
        return "";
    }

    // 44. Lanza una excepción si una lista está vacía.
    public void ejercicio44(java.util.List<String> lista) throws Exception {
    }

    // 45. Lanza una excepción si el número es mayor que 100.
    public void ejercicio45(int valor) throws Exception {
    }

    // 46. Captura NumberFormatException al convertir cadena a número.
    public int ejercicio46(String texto) {
        return Integer.getInteger(texto);
    }

    // 47. Usa finally para devolver un texto siempre igual.
    public String ejercicio47() {
        return "";
    }

    // 48. Lanza una excepción si el objeto pasado es null.
    public void ejercicio48(Object obj) throws Exception {
    }

    // 49. Crea una excepción personalizada “OperacionNoSoportadaException”.
    public void ejercicio49(String operacion) throws Exception {
    }

    // 50. Combina todo: validación, lanzamiento y captura en una sola función.
    public String ejercicio50(int valor) {
        return "";
    }
}
