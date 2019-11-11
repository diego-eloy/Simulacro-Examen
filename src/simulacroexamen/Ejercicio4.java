package simulacroexamen;

import java.util.Scanner;

/**
 *
 * @author Dieguito
 */
public class Ejercicio4 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Dime una palabra sin TILDES: ");
        String palabra = teclado.next();

        int longitud = palabra.length();
        String palabraInversa = "";

        if (longitud < 4) {
            palabra = palabra.toUpperCase();
            System.out.println(palabra);
        } else if (longitud >= 4 && longitud < 8) {
            palabra = palabra.toLowerCase();
            System.out.println(palabra);
        } else if (longitud >= 8 && longitud < 11) {
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
            
            System.out.println(palabra);

        } else {
            for (int i = longitud - 1; i >= 0; i--) {
                palabraInversa += palabra.charAt(i);
            }
            System.out.println(palabraInversa);
        }
    }

}
