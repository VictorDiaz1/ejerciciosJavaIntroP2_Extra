package ejerciciosextrajavaintrop2;

import java.util.Scanner;

public class Ejercicio8 {
//    Escriba un programa que lea números enteros. Si el número es múltiplo
//    de cinco debe detener la lectura y mostrar la cantidad de números
//    leídos, la cantidad de números pares y la cantidad de números impares.
//    Al igual que en el ejercicio anterior los números negativos no deben
//    sumarse. Nota: recordar el uso de la sentencia break.

    public static void main(String[] args) {
        
        int num, contPar = 0, contImpar = 0, contTotal = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los numeros: ");
        do {            
            num = sc.nextInt();
            if (num > 0) {
                contTotal++;                
                
                if (num % 2 == 0) {
                    contPar++;
                } else {
                    contImpar++;
                }
            }
        } while (num % 5 != 0);
        
        System.out.println("contTotal = " + contTotal);        
        System.out.println("contPar = " + contPar);
        System.out.println("contImpar = " + contImpar);
        
    }
    
}
