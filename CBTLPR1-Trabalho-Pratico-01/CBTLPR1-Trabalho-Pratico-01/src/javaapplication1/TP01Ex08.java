package javaapplication1;
import java.util.Scanner;

/*8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.
Guilherme Postigo
Izadora Santos*/

public class TP01Ex08 {
	public static void main (String [] args){
	    Scanner scanner = new Scanner (System.in);
	    
	    System.out.println("Digite a distância em milhas marítimas para conversão em KM: ");
	    double milhas = scanner.nextDouble();
	
	    double KM = milhas * 1.852;
	            
	    System.out.println("Seu valor é : " + KM + " Km");
	    scanner.close();
	    }
}
