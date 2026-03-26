package javaapplication1;
import java.util.Scanner;

/*3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
Guilherme Postigo
Izadora Santos
*/


public class TP01Ex03 {
            public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Insira o valor da diagonal do quadrado:");
        double diagonal = scanner.nextDouble();
        
        double Area = Math.pow(diagonal, 2)/2;
        
        System.out.println("A sua área é: " + Area);        
        scanner.close();
    }
}
