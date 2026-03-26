package javaapplication1;
import java.util.Scanner;

/*15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
Guilherme Postigo
Izadora Santos
*/

public class TP01Ex15 {
	public static void main (String [] args){
		
	    Scanner scanner = new Scanner (System.in);
	    
	    System.out.println("Digite a cotação atual do dólar: ");
        double cotacao = scanner.nextDouble();

        System.out.println("Digite uma quantia qualquer em USD a ser convertida em reais: ");
        double USD = scanner.nextDouble();

        double real = cotacao * USD;

        System.out.printf("O seu valor em reais é de: " + real);

        scanner.close();
	    }
}

