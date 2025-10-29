package org.example;

import java.util.ArrayList;
import java.util.List;


/* Clase que implementa la interfaz generica
   para la encriptacion por bits
 */
public class EncripPorBit implements AlgoritmoEncriptador<List<Integer>, String>{

    /* implementacion del metodo encriptar de la interfaz
        Recibe una lista de enteros (ASCII del mensaje) y la llave
        Retorna una lista con el resultado de la encriptacion
     */
    @Override
    public List<Integer> encriptar(List<Integer> mensaje, String llave) {
        //tabla de mensaje
        System.out.println("  Caracter  \t  ASCII  \t  Binario  ");
        for(int i = 0; i < mensaje.size(); i++){
            // valor ASCII del mensaje
            int ascii = mensaje.get(i);
            // hace de numero a su carácter para imprimirlo
            char ch = (char) ascii;
            // hace el num a binario 7 bits
            String bin = llenaBinarios(Integer.toBinaryString(ascii));
            System.out.printf("%-8c\t      %-5d\t     %s%n", ch, ascii, bin);
        }
        System.out.println();//linea en blanco para separar

        //tabla de la llave
        System.out.println("  Caracter  \t  ASCII  \t  Binario  ");
        int n = mensaje.size();
        int[] asciiKey = new int[n];
        //array para guardar los codigos de la llave
        for (int i = 0; i < n; i++) {
            char k = llave.charAt(i % llave.length());
            // repite la llave segun el tamano
            int a = (int) k;
            //obtiene el ASCII de la letra de la llave
            asciiKey[i] = a;
            String bin = llenaBinarios(Integer.toBinaryString(a));
            //convierte a vinario 7 bits
            System.out.printf("%-8c\t      %-5d\t     %s%n", k, a, bin);
            //imprimimos como en el excel
        }
        System.out.println();

        //XOR bit a bit usando binario de 7 bits

        System.out.println("Proceso\t    \tRESULTADO");
        List<Integer> resultado = new ArrayList<Integer>();
        //lista para guardar los numeros fianles

        for (int i = 0; i < n; i++) {
            int men = mensaje.get(i);
            //consigue el codigo original
            int xor = men ^ asciiKey[i];
            //hace el XOR entre mensaje y llave
            String binXor = llenaBinarios(Integer.toBinaryString(xor));
            //obtiene el resultado en binario

            System.out.printf("%s\t          %d%n", binXor, xor);
            resultado.add(Integer.valueOf(xor));
            //giarda el numero en la lista resultado
        }

        //devuelve la lista final de enteros
        return resultado;
    }

    //metodo que llena a 7 bits con ceros a la izquierda la
    //cadena de binarios
    //si es  mas corta agrega 0s al comienzo
    //si es mas larga quita 0s desde la derecha
    private String llenaBinarios(String bin) {
        while (bin.length() < 7) bin = "0" + bin;
        if (bin.length() > 7) bin = bin.substring(bin.length() - 7);
        return bin;
    }
}
