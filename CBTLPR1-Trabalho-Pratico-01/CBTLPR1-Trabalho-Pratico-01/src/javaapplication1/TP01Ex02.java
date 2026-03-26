package javaapplication1;
import java.util.Scanner;

/*2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado.
Guilherme Postigo
Izadora Santos
*/

public class TP01Ex02 {
    
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Insira o valor da aresta do quadrado:");
        double aresta = scanner.nextDouble();
        
        double Area = Math.pow(aresta, 2);
        
        System.out.println("A sua área é: " + Area);        
        scanner.close();
    }
}
