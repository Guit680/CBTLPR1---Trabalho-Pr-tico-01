package javaapplication1;
import java.util.Scanner;

public class TP01Ex01 {

/*1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.
Guilherme Postigo
Izadora Santos
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a base do retângulo:");
        double Base = scanner.nextDouble();
        
        System.out.println("Insira a altura do retângulo:");
        double Altura = scanner.nextDouble();
        
        double Area = Base * Altura;
        
        System.out.println("A sua área é :" + Area);        
        scanner.close();
    }
    
}
