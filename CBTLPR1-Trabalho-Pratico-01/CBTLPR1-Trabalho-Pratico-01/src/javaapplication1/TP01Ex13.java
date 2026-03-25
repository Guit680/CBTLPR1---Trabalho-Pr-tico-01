package javaapplication1;
import java.util.Scanner;

public class TP01Ex13 {
	public static void main (String [] args){
	    Scanner scanner = new Scanner (System.in);
	    
	    System.out.println("Digite a velocidade incial em m/s: ");
	    double V_Inicial = scanner.nextDouble();
	    
	    System.out.println("Digite o valor da aceleração em m/s: ");
	    double Aceleracao = scanner.nextDouble();
	    
	    System.out.println("Digite o tempo do percurso em segundos: ");
	    double Tempo = scanner.nextDouble();
	    
	    double V_Final = (V_Inicial + (Aceleracao * Tempo)) *3.6;
	            
	    System.out.println("Sua velocidade final em KM/h é: " + V_Final);
	    scanner.close();
	    }
}
