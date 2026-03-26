package javaapplication1;
import java.util.Scanner;

/*10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.
Guilherme Postigo
Izadora Santos*/

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
