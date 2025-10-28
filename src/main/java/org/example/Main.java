package org.example;

public class Main {

    public static void main(String[] args) {
        testEncriptarPorDesplazamientoString();
    }

    public static void testEncriptarPorDesplazamientoString() {
        Encriptador<String> mensajeEncriptado = new Encriptador(new EncripPorDesplazamientoS());
        System.out.println("\n ALGORITMO POR DESPLAZAMIENTO \n");
        System.out.println("1- Datos de entrada");

        String cadenaOriginal = "HELLO";
        System.out.println("Texto original: \t\t" + "\"" +cadenaOriginal +"\"");

        int desplazamiento = 3;
        System.out.println("Desplazamiento: \t\t" + desplazamiento);
        System.out.println();

        System.out.println("2- Proceso \n");

        String cadenaEncriptada = mensajeEncriptado.encriptar(cadenaOriginal, desplazamiento);
        System.out.println("\n3- Salida");
        System.out.println("\"" +cadenaEncriptada +"\"");
    }
}