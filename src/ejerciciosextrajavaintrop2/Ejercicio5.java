package ejerciciosextrajavaintrop2;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicio5 {
//    Una obra social tiene tres clases de socios:
//    _Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento
//    en todos los tipos de tratamientos.
//    _Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
//    para los mismos tratamientos que los socios del tipo A.
//    _Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
//    dichos tratamientos.
//    _Solicite una letra (carácter) que representa la clase de un socio, y luego un
//    valor real que represente el costo del tratamiento
//    (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

    public static void main(String[] args) {
        double valorDesc;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor del tratamiento:");
        int valorTR = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese la categoria de socio A,B o C:");
        String socio = toUpperCase(sc.nextLine());
        //String socio = sc.nextLine();

        switch (socio) {
            case "A":
                //case "a":
                valorDesc = valorTR / 2;
                System.out.println("El importe a pagar es:$ " + valorDesc);
                break;
            case "B":
                //case "b":
                valorDesc = (valorTR * 0.65);
                System.out.println("El importe a pagar es:$ " + valorDesc);
                break;
            case "C":
                //case "c":
                valorDesc = valorTR;
                System.out.println("El importe a pagar es:$ " + valorDesc);
                break;
            default:
                System.out.println("ingreso un valor incorrecto");
                break;
        }

    }

}
