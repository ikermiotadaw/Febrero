/*
El objetivo de este ejercicio es practicar el uso de operadores aritméticos mediante una aplicación
sencilla que realice diferentes operaciones aritméticas con variables. Dado el siguiente código:


Programa las instrucciones necesarias para que sobre la variable resultado se hagan las siguientes
transformaciones en el siguiente orden:
Restar10
Multiplicar por  el valor de la variable m
Mostrar su valor actual por consola
Dividir por el valor de la variable n
Mostrar su valor actual por consola

 */

public class Ejercicio5S01C01{
    public static void main(String[] args) {
        double m = 50;
        double n = 23;
        double resultado = m+n;
        System.out.println(resultado);
        /*insert code here*/
        resultado-=10;
        System.out.println(resultado);
        resultado*= m;
        System.out.println(resultado);
        resultado/= n;
        System.out.println(resultado);

    }
}

