package org.example;

public class Encriptador <T>{

    private AlgoritmoEncriptador<T> algoritmo;

    public Encriptador(AlgoritmoEncriptador<T> algoritmo) {
        this.algoritmo = algoritmo;
    }

    public T encriptar(T dato, int desplazamiento) {
        return algoritmo.encriptar(dato, desplazamiento);
    }

}
