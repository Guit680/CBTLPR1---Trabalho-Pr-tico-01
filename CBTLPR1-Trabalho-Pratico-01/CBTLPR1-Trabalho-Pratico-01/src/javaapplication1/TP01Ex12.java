package javaapplication1;
import java.util.Scanner;

public class TP01Ex12 {
	public static void main (String [] args){
	    Scanner scanner = new Scanner (System.in);
	    
	    System.out.println("Digite o valor da altura de um cone qualquer: ");
	    double altura = scanner.nextDouble();
	    
	    System.out.println("Digite o valor do raio: ");
	    double raio = scanner.nextDouble();
	    
	    double volume = (Math.PI * Math.pow(raio, 2) * altura)/3;
	            
	    System.out.println("O volume de seu cone é: " + volume);
	    scanner.close();
	    }
}
