package simulacroexamen;
import java.util.Scanner;
/**
 *
 * @author Dieguito
 */
public class Ejercicio2 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        int notas = 20;
        double resultados = 0;
        double acumuladorNotas = 0;
        int acumuladorAlu = 0;
        
        for (int i = 0; i < 20 -1; i++) {
                System.out.println("Dime una nota: ");
                resultados = teclado.nextDouble();
                acumuladorNotas +=resultados;
            
            if(resultados < 5 ){
                
                System.out.println("Estas suspenso");
                System.out.println("");
                acumuladorAlu++;
            }else if(resultados >=11){
                System.out.println("Las notas tienen que estar entre 0 y 10");
            }
        }
        
        double media = acumuladorNotas / notas;
        System.out.printf("La nota media de los alumnos es: %.2f \n",media);
        System.out.printf("Han suspendido %d alumnos \n",acumuladorAlu);
                
    }
}
