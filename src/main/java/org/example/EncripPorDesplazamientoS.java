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
        //variable que transforma las letras pasadas a mayuscula
        char letraMayus;
        //variable tipo char que almacena la nueva letra, ya encriptada
        char nuevaLetra;
        //variable que guarda el mensaje final encriptado
        String mensajeEncriptado = "";

        System.out.printf(" Letra Original \t Desplazamiento(+%d)", desplazamiento);
        System.out.println();

        /*variable que, si tenemos un desplazamiento de 57 por ejemplo, no recorre las
        26 letras del abecedario dos veces, sino que obtiene el mod (restante)
        de la division 57/26, restante = 5, entonces recorre unicamente 5 letras
         */
        int desplazamientoEficaz = desplazamiento % 26;

        for(int i = 0; i < mensaje.length(); i++){
            //variable que toma letra por letra del mensaje
            char letra = mensaje.charAt(i);
            //forza que la letra sea mayuscula
            letraMayus = Character.toUpperCase(letra);

            if(letraMayus >= 'A' && letraMayus <= 'Z'){
                //variable que convierte la letra en un numero del 0 al 25
                //sirve cuando colocamos la letra Z y haga el respectivo desplazamiento, contando desde A
                int posicion = letraMayus - 'A';

                int posNueva = (posicion + desplazamientoEficaz) % 26;
                //nos da el codigo ASCII aplicado el desplazamiento
                codigoNuevo = 'A' + posNueva;

                //obtiene la nueva letra con el desplazamiento correspondiente
                nuevaLetra = (char) codigoNuevo;
                System.out.printf("%-20c %-20c\n", mensaje.charAt(i), nuevaLetra);
            }else{
                nuevaLetra = letra;
                System.out.printf("%-20c %-20c\n", mensaje.charAt(i), nuevaLetra);
            }

            //guarda en la variable mensajeEncriptado, cada nueva letra encriptada
            mensajeEncriptado += nuevaLetra;
        }
        //retornamos el mensaje encriptado, aplicado el desplazamiento
        return mensajeEncriptado;
    }
}
