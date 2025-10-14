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

package es.ads.cursojava.clase03.controlflujo.ejercicios;
/*
    Declarar una variable que guarde el nombre de un mes
    Imprime el numero de dias
 */
public class Meses {

    public static void main(String[] agrs){
        String mes = "Febrero";

//        if(mes.equals("Enero") || mes.equals("Marzo") || mes.equals("Mayo")){
//            System.out.println("31");
//        } else if(mes.equals("Febrero")){
//            System.out.println("28");
//        } else if(mes.equals("Abril")){
//            System.out.println("30");
//        }

        switch (mes) {
            case "Enero":
            case "Marzo":
            case "Mayo":
            case "Julio":
            case "Agosto":
            case "Octubre":
            case "Diciembre":
                System.out.println("31");
                break;
            case "Febrero":
                System.out.println("28");
                break;
            case "Abril":
            case "Junio":
            case "Septiembre":
            case "Noviembre":
                System.out.println("30");
                break;
            default:
                System.out.println("No existe");
        }
    }
}
