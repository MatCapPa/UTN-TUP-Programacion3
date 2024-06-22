package Logica;
//todo esta funcion es para reescribir la cuenta que escribimos en la calculadora, pero aqui vamos a verificar:
//1. que no haya dos signos matematicos juntos. (ej: "5+/2" )
//2. que la cuenta no termine con un signo matematico. (ej: "2+2/" )
//3. que no se pueda dividir por cero.
public class Verification {

    public String verificarCuentaBienEscrita(String texto) {
        String nuevoTexto = "";
        for (int i = 0; i < texto.length(); i++) {
            char unidad = texto.charAt(i);
            char unidadPosterior = ' ';
            if (i < texto.length() - 1) {
                unidadPosterior = texto.charAt(i + 1);
            }

            if (unidad == '1' || unidad == '2' || unidad == '3' || unidad == '4' || unidad == '5' || unidad == '6' || unidad == '7' || unidad == '8' || unidad == '9' || unidad == '0') {
                if (unidadPosterior == '1' || unidadPosterior == '2' || unidadPosterior == '3' || unidadPosterior == '4' || unidadPosterior == '5' || unidadPosterior == '6' ||
                        unidadPosterior == '7' || unidadPosterior == '8' || unidadPosterior == '9' || unidadPosterior == '0') {
                    for (int j = i; j < texto.length(); j++) {
                        char c = texto.charAt(j);
                        if (c == '+' || c == '/' || c == '-' || c == '*') {
                            i = j - 1; //continuo el ciclo desde la posicion del ultimo numero encadenado
                            break;
                        }
                        nuevoTexto = nuevoTexto + c;
                        i = j;
                    }
                } else {
                    nuevoTexto = nuevoTexto + unidad;
                }

            }

            if (unidad == '+' || unidad == '/' || unidad == '-' || unidad == '*') {
                if (unidadPosterior == '+' || unidadPosterior == '/' || unidadPosterior == '-' || unidadPosterior == '*') { //verifico que no haya dos signos seguidos
                    return null;//"error. dos signos seguidos";
                }
                if (unidadPosterior == ' ') {
                    return null;//"error. la expresion no pueder terminar con un signo";
                }
                if (unidadPosterior == '0'){
                    return null;// no se puede dividir por cero.
                }
                nuevoTexto = nuevoTexto + unidad;
            }
        }
        return nuevoTexto;
    }
}
