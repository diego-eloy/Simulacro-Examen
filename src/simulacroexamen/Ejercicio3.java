package simulacroexamen;

import java.util.Scanner;

/**
 *
 * @author Dieguito
 */
public class Ejercicio3 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;
        int pin = 1111;
        double saldo = 0;
        double cuenta = 0;

        do {
            System.out.println("            BUENOS DIAS");
            System.out.println("INTRODUCE LA OPCION QUE QUIERE HACER");
            System.out.println("");
            System.out.println("1-Ingresar Dinero");
            System.out.println("2-Sacar Dinero");
            System.out.println("3-Consultar el Estado de la Cuenta");
            System.out.println("4-Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Dime el PIN");
                    int pinIntro = teclado.nextInt();

                    if (pin == pinIntro) {
                        System.out.println("Dime el Saldo a Introducir");
                        double saldoIntro = teclado.nextDouble();
                        saldo += saldoIntro;
                        System.out.println("SALDO INTRODUCIDO CON EXITO");
                        System.out.println("-----------------------------");
                    } else {
                        System.out.println("PIN ERRONEO");
                        System.out.println("-----------------------------");
                    }
                    break;

                case 2:
                    System.out.println("Dime el PIN");
                    pinIntro = teclado.nextInt();

                    if (pin == pinIntro) {
                        System.out.println("DIME EL DINERO QUE QUIERES SACAR");
                        double sacarSaldo = teclado.nextDouble();

                        if (saldo < sacarSaldo) {
                            System.out.println("IMPOSIBLE SACAR DINERO");
                            System.out.println("-----------------------------");
                        } else {
                            cuenta = saldo - sacarSaldo;
                            System.out.println("SALDO SACADO CON EXITO");
                            System.out.println("-----------------------------");
                        }
                    } else {
                        System.out.println("PIN ERRONEO");
                        System.out.println("-----------------------------");
                    }
                    break;

                case 3:
                    System.out.println("DIME EL PIN");
                    pinIntro = teclado.nextInt();
                    
                    if (pin == pinIntro) {
                        System.out.printf("EL SALDO ACTUAL DE SU CUENTA ES %.2f \n", cuenta);
                        System.out.println("-----------------------------");
                    } else {
                        System.out.println("PIN ERRONEO");
                        System.out.println("-----------------------------");
                    }
                    break;
            }

        } while (opcion < 4 && opcion > 0);

        System.out.println("SALISTE");

    }
}
