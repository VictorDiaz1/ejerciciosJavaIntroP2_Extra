package ejerciciosextrajavaintrop2;

import java.util.Scanner;

public class ejercicio14 {
//    Se dispone de un conjunto de N familias, cada una de las cuales
//    tiene una M cantidad de hijos. Escriba un programa que pida la cantidad
//    de familias y para cada familia la cantidad de hijos para averiguar la
//    media de edad de los hijos de todas las familias.
//
  public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese la cantidad de familias:");
//        int cantFamilia = sc.nextInt();
//        int cantHijos;
//        int cont = 0;
//        int edad;
//        int suma = 0;
//        for (int i = 0; i < cantFamilia; i++) {
//            System.out.println("cuantos niños hay en su familia?");
//            cantHijos = sc.nextInt();
//            System.out.println("de que edades?");
//            while (cantHijos > cont) {
//                edad = sc.nextInt();
//                System.out.println(edad);
//                cont++;
//                suma = suma + edad;
//                //double prom1= suma/cont;
//
//            }
//            
//
//        }
//            System.out.println(suma);
//            System.out.println(cont);
//            System.out.println(suma / cont);
//
//    }
        Scanner ing = new Scanner(System.in);

        // Pedir cantidad de familias
        System.out.print("Ingrese la cantidad de familias: ");
        int numFamilias = ing.nextInt();

        // Pedir cantidad de hijos por familia
        System.out.print("Ingrese la cantidad de hijos por familia: ");
        int numHijos = ing.nextInt();

        // Crear matriz para almacenar edades de los hijos
        int[][] edades = new int[numFamilias][numHijos];

        // Pedir la edad de cada hijo y almacenarla en la matriz
        for (int i = 0; i < numFamilias; i++) {
            System.out.println("Familia " + (i+1));
            for (int j = 0; j < numHijos; j++) {
                System.out.print("Edad del hijo " + (j+1) + ": ");
                edades[i][j] = ing.nextInt();
            }
        }

        // Calcular la media de edad de los hijos
        int totalHijos = numFamilias * numHijos;
        int sumaEdades = 0;
        for (int i = 0; i < numFamilias; i++) {
            for (int j = 0; j < numHijos; j++) {
                sumaEdades += edades[i][j];
            }
        }
        double mediaEdad = (double) sumaEdades / totalHijos;

        // Mostrar resultado
        System.out.println("La media de edad de los hijos es: " + mediaEdad);
    }
}

