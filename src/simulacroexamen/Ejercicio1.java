package simulacroexamen;

import java.util.Scanner;

/**
 *
 * @author Diego-Eloy DAM 1
 */
public class Ejercicio1 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int acumulador = 0;  //Todos los numeros que he introducido
        double numero = 0.0;    //El numero que introduzco
        int acumuladorPar = 0;   //numero de Pares
        int acumulador0 = 0;
        int acumuladorImpar = 0; //numero de Impares
        double acuSumaPar = 0;      //Suma de los numero Pares
        double acuSumaImpar = 0;    //suma de los nuemros Pares

        int opcion;

        do {
            System.out.println("Dime Numeros Mayores o iguales a 0: ");
            numero = teclado.nextDouble();
            acumulador++;

            if (numero >= 0){
                
                        //Numero Par
                if (numero % 2 == 0) {
                    acuSumaPar += numero;
                    acumuladorPar++;
                   
                }
                        //Numero Impar
                if (numero % 2 != 0) {
                    acuSumaImpar += numero;
                    acumuladorImpar++;

                }       //Numero 0
                if (numero == 0) {
                    acumulador0++;
                }
            }
        } while (numero >= 0);

        do {
            System.out.println("");
            System.out.println("1-Suma de los numeros pares introducidos: ");
            System.out.println("2-Media de los numero pares introducidos con dos decimales: ");
            System.out.println("3-Media de los numeros impares introducidos con dos decimales: ");
            System.out.println("4-Cuantos numeros hemos introducido: ");
            System.out.println("5-Cuantos numeros de los introducidos han sido 0, cuantos han sido pares y cuantos impares: ");
            System.out.println("6-Salir");
            System.out.println("");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.printf("Suma de Todos los pares : %.2f \n", acuSumaPar);
                    break;

                case 2:
                    double mediaNPar = acumuladorPar / acumulador;    //media de numeros Pares
                    System.out.println("---------------------------------------------");
                    System.out.printf("Media de los Pares: %.2f \n", mediaNPar);

                    break;

                case 3:
                    double mediaNImpar = acumuladorImpar / acumulador;  //media de numeros Impares
                    System.out.println("---------------------------------------------");
                    System.out.printf("Meida de los Impares: %.2f \n", mediaNImpar);
                    break;

                case 4:
                    System.out.println("---------------------------------------------");
                    System.out.printf("Hemos introducido %d \n", acumulador);
                    break;

                case 5:
                    System.out.println("---------------------------------------------");
                    System.out.printf("Hay %d 0 / Hay %d Pares / Hay %d Impares %n", acumulador0, acumuladorPar, acumuladorImpar);
                    break;

                case 6:
                    System.out.println("SALIDA");
                    break;
            }

        } while (opcion != 6);

    }

}
