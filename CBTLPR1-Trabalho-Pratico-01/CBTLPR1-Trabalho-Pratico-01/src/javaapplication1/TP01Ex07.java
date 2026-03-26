package javaapplication1;
import java.util.Scanner;

/*7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.
Guilherme Postigo
Izadora Santos*/

public class TP01Ex07 {
	public static void main (String [] args){
	    Scanner scanner = new Scanner (System.in);
	    
	    System.out.println("Digite o valor 1: ");
	    double N1 = scanner.nextDouble();
	    System.out.println("Digite o valor 2: ");
	    double N2 = scanner.nextDouble();

	    double Produto = N1*N2;
	    
	    double MediaG = Math.sqrt(Produto);
	            
	    System.out.println("Sua média geométrica é: " + MediaG);
	    scanner.close();
	    }
}
