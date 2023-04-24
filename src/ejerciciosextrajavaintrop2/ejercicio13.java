package ejerciciosextrajavaintrop2;

import java.util.Scanner;

public class ejercicio13 {
//    Crear un programa que dibuje una escalera de números,
//    donde cada línea de números comience en uno y termine en el
//    número de la línea. Solicitar la altura de la escalera al
//    usuario al comenzar. Ejemplo: si se ingresa el número 3:
//    1
//    12
//    123

    public static void main(String[] args) {
        System.out.println("Ingrese un numero:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" " + (j + 1));
            }
            System.out.println(" ");
        }

    }

}
