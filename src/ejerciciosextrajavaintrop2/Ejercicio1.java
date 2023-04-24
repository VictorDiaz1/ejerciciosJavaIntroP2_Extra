package ejerciciosextrajavaintrop2;

import java.util.Scanner;

public class Ejercicio1 {
//    Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
//    ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
//    equivalente: 1 día, 2 horas.

    public static void main(String[] args) {

        int minutosInciales, min, horas, dias;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de minutos a convertir:");
        minutosInciales = sc.nextInt();

        horas = minutosInciales / 60;
        min = minutosInciales % 60;
        dias = horas / 24;
        horas = horas % 24;

        System.out.println(minutosInciales + " minutos son: " + dias + " dias, "
                + horas + " horas, " + min + " minutos.");

    }
}
