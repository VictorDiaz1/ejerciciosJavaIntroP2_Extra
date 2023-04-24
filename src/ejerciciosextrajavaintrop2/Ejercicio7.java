package ejerciciosextrajavaintrop2;

import java.util.Scanner;

public class Ejercicio7 {
//    Realice un programa que calcule y visualice el valor máximo, el valor
//    mínimo y el promedio de n números (n>0). El valor de n se solicitará al
//    principio del programa y los números serán introducidos por el usuario.
//    Realice dos versiones del programa, una usando el bucle “while” y otra
//    con el bucle “do - while”.

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de N numeros:");
        int numN = sc.nextInt();
        System.out.println("ingrese el primer numero");
        int num = sc.nextInt();
        int numMax = num;
        int numMin = num;
        int suma = num;
        int cont = 0;
        while (cont < (numN-1)) {
            System.out.println("Ingrese el siguiente numero:");
            num = sc.nextInt();
            cont++;

            if (num > numMax) {
                numMax = num;
            }
            if (num <= numMin) {
                numMin = num;
            }
            suma+=num;
        }
//        do {
//            System.out.println("Ingrese el siguiente numero:");
//            num = sc.nextInt();
//            cont++;
//
//            if (num > numMax) {
//                numMax = num;
//            }
//            if (num <= numMin) {
//                numMin = num;
//            }
//            suma += num;
//        } while (cont < (numN-1));

        double promedio = suma / numN;
        System.out.println("numMax = " + numMax);
        System.out.println("numMin = " + numMin);
        System.out.println("promedio: " + promedio);
        System.out.println("numN = " + numN);

    }

}
