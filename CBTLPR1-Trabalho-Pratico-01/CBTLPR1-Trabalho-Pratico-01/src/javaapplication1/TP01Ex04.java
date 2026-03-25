package javaapplication1;
import java.util.Scanner;

public class TP01Ex04 {
                public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Insira o valor da base do Triângulo:");
        double base = scanner.nextDouble();
        
        System.out.println("Insira o valor da altura do Triângulo:");
        double altura = scanner.nextDouble();
        
        double Area = (base * altura)/2;
        
        System.out.println("A sua área é: " + Area);        
        scanner.close();
    }
}
