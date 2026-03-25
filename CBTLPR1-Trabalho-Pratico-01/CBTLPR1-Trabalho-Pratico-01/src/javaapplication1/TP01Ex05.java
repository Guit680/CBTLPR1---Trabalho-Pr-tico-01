package javaapplication1;
import java.util.Scanner;

public class TP01Ex05 {
    public static void main (String [] args){
    Scanner scanner = new Scanner (System.in);
    
    System.out.println("Digite o valor do diametro de uma esfera qualquer:");
    double diametro = scanner.nextDouble();
    double raio = diametro/2;
            
    double volume = (4.0/3.0)* (Math.PI) * Math.pow(raio,3);
    System.out.println("O seu volume é: " + volume);
    scanner.close();
    }
}
