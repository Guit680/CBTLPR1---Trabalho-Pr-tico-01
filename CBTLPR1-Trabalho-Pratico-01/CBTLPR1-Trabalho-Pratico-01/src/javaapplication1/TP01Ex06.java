package javaapplication1;
import java.util.Scanner;

public class TP01Ex06 {
	public static void main (String [] args){
	    Scanner scanner = new Scanner (System.in);
	    
	    System.out.println("Digite o valor 1: ");
	    double N1 = scanner.nextDouble();
	    System.out.println("Digite o valor 2: ");
	    double N2 = scanner.nextDouble();
	    System.out.println("Digite o valor 3: ");
	    double N3 = scanner.nextDouble();
	    System.out.println("Digite o valor 4: ");
	    double N4 = scanner.nextDouble();
	    
	    double MediaA = (N1+N2+N3+N4)/4;
	            
	    System.out.println("Sua média é: " + MediaA);
	    scanner.close();
	    }
}
