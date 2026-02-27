/*
Escribe el código Java que permita calcular la nota final del curso, teniendo en cuenta que ésta se
calcula como la media aritmética de la nota obtenida en las asignaturas de matemáticas, lengua castellana,
inglés, ciencias naturales y ciencias sociales.
La nota obtenida en las asignaturas será un número entero (por ejemplo en matemáticas un 9) y la nota final
será un número decimal.
 */

public class Ejercicio3S01C01 {
    public static void main(String[] args) {
        int matematicas = 5;
        int lengua = 7;
        int ingles = 8;
        int ccnn = 7;
        int ccss= 9;
        float media = (float)(matematicas+lengua+ingles+ccnn+ccss)/5;
        System.out.println("La nota media del curso es "+media+".");
    }
}
