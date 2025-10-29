package org.example;

// CLASE GENERICA
public class Encriptador <T, K>{

    // variable que almacena el algoritmo de encriptacion seleccionado
    // T = tipo del dato del mensaje
    // K = llave/valor de desplazamiento
    private AlgoritmoEncriptador<T, K> algoritmo;

    // Constructor, recibe como parametro el algoritmo que implementa
    // la interfaz generica //
    public Encriptador(AlgoritmoEncriptador<T, K> algoritmo) {
        this.algoritmo = algoritmo;
    }

    /*
       metodo que ejecuta el algoritmo de encriptacion
       recibe el mensaje a encriptar y la llave correspondiente,
       para cada uno de los algoritmos
     */
    public T encriptar(T dato, K desplazamiento) {
        return algoritmo.encriptar(dato, desplazamiento);
    }

}
