package javaapplication1;
import java.util.Scanner;

public class TP01Ex09 {
	public static void main (String [] args){
	    Scanner scanner = new Scanner (System.in);
	    
	    System.out.println("Calculadora de Tensão");
	    System.out.println("");
	    System.out.println("Digite o valor da corrente do circuito: ");
	    double corrente = scanner.nextDouble();
	    System.out.println("Digite o valor da resistência do circuito: ");
	    double resistencia = scanner.nextDouble();

	    double tensao = corrente * resistencia;
	            
	    System.out.println("Sua tensão é: " + tensao);
	    scanner.close();
	    }
}
