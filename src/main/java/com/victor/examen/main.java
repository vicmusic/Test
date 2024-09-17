package com.victor.examen;

public class main {
    public static void main(String[] args) {

        /*
        ALUMNO: Gimenez Victor Andres.
          EJERCICIO 01
          Realizar un programa que simule una calculadora
         
          EJERCICIO 02 (OPCIONAL)
          Investigar qué sucede cuando la operación a realizar es una división y tiene como divisor un 0 (cero).

          Ejercicio 03
           Se necesita modelar los personajes de un juego
         */
        CalculadoraJava operaciones = new CalculadoraJava();

        Integer num1 = 10;
        Integer num2 = 30;

        Integer suma = operaciones.sumar(num1, num2);
        Integer resta = operaciones.restar(num1, num2);
        Integer multiplicar = operaciones.multiplicar(num1, num2);
        Integer dividir = operaciones.dividir(num1, num2);

        if (suma > 0) {
            System.out.println("\n El resultado de la suma es positivo \n" + "[ " + suma + " ]");
        } else {
            System.out.println(
                    "\n El resultado de la suma es negatvo \n" + "[ " + suma + " ]" + " Error, resultado muy grande");
        }

        System.out.println(" ");

        if (resta > 0) {
            System.out.println("\n El resultado de la resta es positivo \n" + "[ " + resta + " ]");
        } else {
            System.out.println(
                    "\n El resultado de la resta es negatvo \n" + "[ " + resta + " ]" + " Error, resultado muy grande");
        }

        System.out.println(" ");

        if (multiplicar > 0) {
            System.out.println("\n El resultado de la multiplicación es positivo \n" + "[ " + multiplicar + " ]");
        } else {
            System.out.println(
                    "\n El resultado de la multiplicación es negatvo \n" + "[ " + multiplicar + " ]"
                            + " Error, resultado muy grande");
        }

        System.out.println(" ");

        if (dividir > 0) {
            System.out.println("\n El resultado de la división es positivo \n" + "[ " + dividir + " ]");
        } else {
            System.out.println(
                    "\n El resultado de la división es negatvo \n" + "[ " + dividir + " ]"
                            + " Error, resultado muy grande");
        }

        System.out.println(" ");
    }
}
