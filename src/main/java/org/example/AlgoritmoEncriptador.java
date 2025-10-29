package org.example;

// Interfaz generica, usada para ambos algoritmos
// de encriptacion
public interface AlgoritmoEncriptador <T, K>{

    // metodo generico, en el que se aplican los algoritmos de encriptacion
    // T = mensaje a encriptar
    // K = llave o parametro usado en los algoritmos
    // retorna el mensaje encriptado, tipo T
    T encriptar(T mensaje, K llave);


}
