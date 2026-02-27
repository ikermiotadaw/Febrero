/*
Escribe el código Java que declare una variable de tipo char y la inicialice con una
letra mayúscula (A-Z). Calcula su letra minúscula y muestra por consola ambas.
 */

public class Ejercicio4S01C01 {
    public static void main(String[] args) {
        char mayuscula = 'A';                 // Variable tipo char con una letra mayúscula
        char minuscula = (char) (mayuscula + 32); // Conversión a minúscula usando código ASCII

        System.out.println("Mayúscula: " + mayuscula);
        System.out.println("Minúscula: " + minuscula);
    }
}
