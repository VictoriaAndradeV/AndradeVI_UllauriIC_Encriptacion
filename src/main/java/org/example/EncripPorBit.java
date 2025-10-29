package org.example;

import java.util.List;


/* Clase generica que implementa la interfaz generica
   para la encriptacion por bits
 */
public class EncripPorBit <T> implements AlgoritmoEncriptador<List<T>, String>{

    /* implementacion del metodo encriptar de la interfaz
        Recibe una lista generica con los caracteres del texto ingresado y la llave
        Retorna una lista con el resultado de la encriptacion
     */
    @Override
    public List<T> encriptar(List<T> mensaje, String llave) {
        // declaracion de variables //
        // cada elemento de la lista del mensaje
        T elemento;
        // caracter actual
        char letra;
        // valor ascii de cada caracter
        int codigoAscii;

        //impresion del proceso
        System.out.println("  Caracter  \t  ASCII  \t  Binario  ");
        for(int i = 0; i < mensaje.size(); i++){
            elemento = mensaje.get(i);
            //
            letra = elemento.toString().charAt(0);
            // obtiene el valor ascii del caracter
            codigoAscii = (int) letra;
            // convierte el codigo ascii a numero binario
            String binario = Integer.toBinaryString(codigoAscii);
            //impresion de resultados, SOLO DEL MENSAJE, no la llave
            System.out.printf("%-15c\t%-11d\t%s\n",letra,codigoAscii,binario);
        }
        /* Parte isa
        if(llave.length() == mensaje.size()){

        }*/

        return null;
    }
}
