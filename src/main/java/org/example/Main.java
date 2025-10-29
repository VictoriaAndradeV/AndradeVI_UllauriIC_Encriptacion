package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // prueba del algoritmo de encriptacion por desplazamiento
        testEncriptarPorDesplazamientoString();

        testEncriptacionPorBits();
    }

    //              TEST EJERCICIO 1
    //     ENCRIPTACIÓN POR DESPLAZAMIENTO //
    public static void testEncriptarPorDesplazamientoString() {
        // creacion del encriptador generico, algoritmo por desplazamiento //
        Encriptador<String, Integer> mensajeEncriptado = new Encriptador(new EncripPorDesplazamientoS());

        System.out.println("\n ALGORITMO POR DESPLAZAMIENTO \n");
        System.out.println("1- Datos de entrada");

        // Dato de entrada, cadena de texto que va a ser encriptada //
        String cadenaOriginal = "ZAPATO";
        System.out.println("Texto original: \t\t" + "\"" +cadenaOriginal +"\"");

        // Variable desplazamiento, indica el numero de letras
        // que se desplazara cada letra de la palabra //
        int desplazamiento = 3;
        System.out.println("Desplazamiento: \t\t" + desplazamiento);
        System.out.println();

        System.out.println("2- Proceso \n");
        //Se llama al metodo encriptar, del algoritmo seleccionado,
        // en este caso, encriptacion por desplazamiento //
        String cadenaEncriptada = mensajeEncriptado.encriptar(cadenaOriginal, desplazamiento);

        System.out.println("\n3- Salida");
        //Impresion del Resultado final //
        System.out.println("\"" +cadenaEncriptada +"\"");
    }

    //              Test Ejercicio 2
    //           ENCRIPTACIÓN POR BITS
    public static void testEncriptacionPorBits(){
        // Se crea un encriptador generico, usa el algoritmo por bits
        Encriptador<List<Character>, String> encriptador = new Encriptador(new EncripPorBit());

        System.out.println("\n ALGORITMO POR BITS \n");
        System.out.println("1- Datos de entrada");

        // Lista de caracteres que contiene el mensaje a encriptar
        List<Character> mensaje = Arrays.asList('H', 'E', 'L', 'L', 'O');
        System.out.printf("%-20s\"%s\"%n", "Texto original:", mensaje);

        // variable que representa la llave (palabra clave)
        // usada para encriptar el mensaje //
        String llave = "KEY";
        System.out.printf("%-20s\"%s\"%n", "Llave:", llave);
        System.out.println();

        // Seccion en el que se muestra el proceso de encriptacion
        System.out.println("2- Proceso \n");

        // llamada del metodo encriptar de la clase generica
        encriptador.encriptar(mensaje, llave);
    }
}