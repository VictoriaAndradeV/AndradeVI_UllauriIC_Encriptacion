package org.example;

/*
Clase que implementa el AlgoritmoEncriptador por desplazamiento
Para cadenas de texto (String)
 */
public class EncripPorDesplazamientoS implements AlgoritmoEncriptador<String>{

    @Override
    public String encriptar(String mensaje, int desplazamiento) {
        //variable que almacena el nuevo codigo de cada letra, ya que se le suma su desplazamiento
        int codigoNuevo;
        //variable tipo char que almacena la nueva letra, ya encriptada
        char nuevaLetra;
        //variable que guarda el mensaje final encriptado
        String mensajeEncriptado = "";

        System.out.printf(" Letra Original \t Desplazamiento(+%d)", desplazamiento);
        System.out.println();

        for(int i = 0; i < mensaje.length(); i++){

            //obtiene el codigo de cada letra del String y SUMA el desplazamiento
            //para encriptar el mensaje
            codigoNuevo = (int) mensaje.charAt(i) + desplazamiento;

            //obtiene la nueva letra con el desplazamiento correspondiente
            nuevaLetra = (char) codigoNuevo;
            System.out.printf("%-20c %-20c\n", mensaje.charAt(i), nuevaLetra);

            //guarda en la variable mensajeEncriptado, cada nueva letra encriptada
            mensajeEncriptado += nuevaLetra;
        }
        //retornamos el mensaje encriptado, aplicado el desplazamiento
        return mensajeEncriptado;
    }
}
