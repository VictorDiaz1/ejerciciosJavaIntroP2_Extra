package ejerciciosextrajavaintrop2;

import java.util.Scanner;

public class Ejercicio6 {
//    Leer la altura de N personas y determinar el promedio de estaturas que se
//    encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura;
        int personas = 0;
        int cont = 0;
        double suma = 0;
        double suma2 = 0;
        System.out.println("Ingrese la altura");
        do {
            altura = sc.nextDouble();
            personas++;
            suma = suma + altura;
            if (altura < 1.6) {
                cont = cont + 1;
                suma2 = suma2 + altura;
            }
        } while (altura != 0);
        System.out.println("personas = " + (personas - 1));
        System.out.println("El promedio de altura general es: " + suma / (personas - 1));
        System.out.println("personas por debajo de 1,60: " + (cont - 1));
        System.out.println("El promedio de las personas por debajo de 1,60 es: " + suma2 / (cont - 1));
    }
}
