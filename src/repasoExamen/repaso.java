package repasoExamen;

import java.util.Scanner;

/**
 *
 * @author Dieguito
 */
public class repaso {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;
        String palabraMayus;
        String palabraInversa = "";
        int numero;
        int multi;

        do {
            System.out.println("1-Dame la vuelta a la palabra");
            System.out.println("2-Convierteme esa palabra en mayusculas");
            System.out.println("3-Ponme todas las vocales con tilde");
            System.out.println("4-Dime un numero y te hago su tabla de multiplicar");
            System.out.println("5-Salir");
            System.out.println("");
            System.out.println("DIME LA OPCION QUE QUIERES ESCOGER --> ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Dime una palabra: ");
                    String palabra = teclado.next();

                    int longitud = palabra.length();

                    for (int i = longitud - 1; i >= 0; i--) {
                        palabraInversa += palabra.charAt(i);
                    }
                    System.out.println("");
                    System.out.println(palabraInversa);
                    System.out.println("");
                    System.out.println("-----------------------------------");
                    break;

                case 2:
                    System.out.println("Dime una palabra: ");
                    palabra = teclado.next();
                    palabraMayus = palabra.toUpperCase();

                    System.out.println("");
                    System.out.println(palabraMayus);
                    System.out.println("");
                    System.out.println("-----------------------------------");
                    break;

                case 3:
                    System.out.println("Dime una palabra: ");
                    palabra = teclado.next();

                    palabra = palabra.replace('a', 'á');
                    palabra = palabra.replace('e', 'é');
                    palabra = palabra.replace('i', 'í');
                    palabra = palabra.replace('o', 'ó');
                    palabra = palabra.replace('u', 'ú');
                    palabra = palabra.replace('A', 'Á');
                    palabra = palabra.replace('E', 'É');
                    palabra = palabra.replace('I', 'Í');
                    palabra = palabra.replace('O', 'Ó');
                    palabra = palabra.replace('u', 'Ú');

                    System.out.println("");
                    System.out.println(palabra);
                    System.out.println("");
                    System.out.println("-----------------------------------");
                    break;

                case 4:
                    System.out.println("Dime un numero: ");
                    numero = teclado.nextInt();

                    if (numero > 0 && numero < 11) {

                        for (int i = 0; i < 10 + 1; i++) {
                            multi = numero * i;
                            System.out.println("");
                            System.out.printf("%d x %d = %d", numero, i, multi);
                            System.out.println("");
                            System.out.println("-----------------------------------");
                        }
                    }
                    break;
            }

        } while (opcion < 6 || opcion < 1);

    }

}
