package ejerciciosextrajavaintrop2;

import java.util.Scanner;

public class ejercicio11 {
//    Escribir un programa que lea un número entero y devuelva el número
//    de dígitos que componen ese número. Por ejemplo, si introducimos el
//    número 12345, el programa deberá devolver 5. Calcular la cantidad de
//    dígitos matemáticamente utilizando el operador de división. Nota: 
//    recordar que las variables de tipo entero truncan los números o resultados.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = sc.nextInt();
        System.out.println("numero:" + num);
        int cont = 0;
        int resultado = num;
        while (resultado > 0) {
            resultado = num / 10;
            num = resultado;
            cont++;
        }
        System.out.println("cantidad de digitos del numero: " + cont);

    }

}
