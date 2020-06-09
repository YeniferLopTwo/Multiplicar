package tablasmultiplicar;

import java.util.Scanner;
/**
 * 
 * @author YENIFER LOPEZ
 */
public class TablasMultiplicar {
/**
 * 
 * @param num le pasa una variable número
 */
    public static void multiplicar(int num) {
        for (int i = 1; i <= num; i++) { //necesitamos hacer una matriz
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println("");
        }
    }
/**
 * 
 * @param args comprueba de que no introduzcas una letra
 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        boolean seguir = true;
        while (seguir) {
            try {
                seguir = true;
                System.out.println("¿Qué tabla quieres multiplicar?");
                num = teclado.nextInt();
                multiplicar(num); //procedimiento
                seguir = false;
            } catch (Exception letra) {
                System.out.println("Solo números");
                seguir = true;
                teclado.next();
            }
        }
    }
}
