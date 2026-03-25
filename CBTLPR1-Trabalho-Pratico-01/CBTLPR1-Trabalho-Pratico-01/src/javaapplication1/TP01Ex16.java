package javaapplication1;
import java.util.Scanner;

public class TP01Ex16 {
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        double graus = scanner.nextDouble();

        double radianos = Math.toRadians(graus); 

        double seno = Math.sin(radianos);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);
        double secante = 1 / cosseno;


        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);

        scanner.close();
	    }
}

