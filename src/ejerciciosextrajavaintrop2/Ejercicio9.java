package ejerciciosextrajavaintrop2;

import java.util.Scanner;

public class Ejercicio9 {
//Simular la división usando solamente restas. Dados dos números enteros
//mayores que uno, realizar un algoritmo que calcule el cociente y el residuo
//usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado
//menor que el divisor, este resultado es el residuo, y el número de restas realizadas 
//es el cociente.
//Por ejemplo: 50 / 13:
//50 – 13 = 37     una resta realizada
//37 – 13 = 24     dos restas realizadas
//24 – 13 = 11     tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
//¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los valores del dividendo y del divisor respectivamente:");
        int dividendo = sc.nextInt();
        int divisor = sc.nextInt();
        int cociente = 0;
        int resto = dividendo;

        do {
            resto -= divisor;
            cociente++;
        } while (resto > divisor && dividendo > 1 && divisor > 1);

        System.out.println("resto = " + resto);
        System.out.println("cociente = " + cociente);
        System.out.println("dividendo = " + dividendo);
        System.out.println("divisor = " + divisor);
    }

}
