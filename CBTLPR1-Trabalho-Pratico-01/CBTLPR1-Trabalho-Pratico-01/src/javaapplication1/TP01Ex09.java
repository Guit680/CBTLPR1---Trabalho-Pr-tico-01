package javaapplication1;
import java.util.Scanner;

/*9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
Guilherme Postigo
Izadora Santos*/

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
