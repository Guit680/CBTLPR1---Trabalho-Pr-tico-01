package javaapplication1;
import java.util.Scanner;

public class TP01Ex10 {
	public static void main (String [] args){
	    Scanner scanner = new Scanner (System.in);
	    
	    System.out.println("Digite o valor em celsius: ");
	    double celsius = scanner.nextDouble();
	    
	    double Fahrenheit = (celsius*1.8)+32;
	            
	    System.out.println("Sua temperatura em Fahrenheit é: " + Fahrenheit);
	    scanner.close();
	    }
    
}
