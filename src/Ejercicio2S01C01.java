/*
 Escribe el código Java que permita definir una variable de tipo double celsius e inicialízala a un valor
 entre -50.5 y 50.5. Luego crea otra variable de tipo double kelvin, calcula su valor teniendo en cuenta la
 siguiente fórmula de conversión entre grados celsius y kelvin e imprime su valor por pantalla.
 TK=TC+273.15
 */

public class Ejercicio2S01C01 {
    public static void main(String[] args) {
        final double FACTOR = 273.15;
        double celsius = 22.5;
        double kelvin = celsius+FACTOR;
        System.out.println("La temperatura en "+celsius+" es "+kelvin+" grados kelvin.");

    }
}
