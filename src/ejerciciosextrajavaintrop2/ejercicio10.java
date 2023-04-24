package ejerciciosextrajavaintrop2;

import java.util.Scanner;

public class ejercicio10 {
//    Realice un programa para que el usuario adivine el resultado
//    de una multiplicación entre dos números generados aleatoriamente
//    entre 0 y 10. El programa debe indicar al usuario si su respuesta
//    es o no correcta. En caso que la respuesta sea incorrecta se debe
//    permitir al usuario ingresar su respuesta nuevamente. Para realizar
//    este ejercicio investigue como utilizar la función Math.random() de Java.

    public static void main(String[] args) {
        int numero1 = (int) (Math.random() * 10);
        int numero2 = (int) (Math.random() * 10);//metodo random genera numero al azar
        System.out.println("Escriba el resultado de la multiplicacion de los siguientes numeros:");
        System.out.println("numero al azar: " + numero1);
        System.out.println("numero al azar: " + numero2);
        Scanner sc = new Scanner(System.in);
        int resultado = sc.nextInt();
        while (resultado != (numero1 * numero2)) {
            System.out.println("respuesta incorrecta, ingrese una nueva respuesta:");
            resultado = sc.nextInt();
        }
        System.out.println("Respuesta correcta");

    }

}
