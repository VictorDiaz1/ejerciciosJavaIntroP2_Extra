
package ejerciciosextrajavaintrop2;

import java.util.Scanner;

public class Ejercicio4 {
//    Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
//    muestre su equivalente en romano.

    public static void main(String[] args) {
        
        int num;
        String rom = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 10:");
        num = sc.nextInt();
        
        switch (num) {
            case 1:
                rom = "I";          
                break;
            case 2:
                rom = "II";          
                break;
            case 3:
                rom = "III";          
                break;
            case 4:
                rom = "IV";          
                break;
            case 5:
                rom = "V";          
                break;
            case 6:
                rom = "VI";          
                break;
            case 7:
                rom = "VII";          
                break;
            case 8:
                rom = "VIII";          
                break;
            case 9:
                rom = "IX";          
                break; 
            case 10:
                rom = "X";          
                break;   
//            default:
//                rom = "numero incorrecto";
//                break;
        }if (num>10||num<=0) {
            System.out.println("ha ingresado un numero incorrecto");
        } else {        
        System.out.println(num + " en numero romano es: " + rom);
        }
        }
    }
    

