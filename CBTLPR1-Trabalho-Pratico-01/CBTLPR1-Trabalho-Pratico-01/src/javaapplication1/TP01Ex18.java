package javaapplication1;
import java.util.Scanner;

/*18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido
Guilherme Postigo
Izadora Santos*/

public class TP01Ex18 {
	
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Digite o valor do produto 1: ");
	    double P1 = scanner.nextDouble();

	    System.out.print("Digite o valor do produto 2: ");
	    double P2 = scanner.nextDouble();
	    
	    System.out.print("Digite o valor do produto 3: ");
	    double P3 = scanner.nextDouble();

	    System.out.print("Digite o valor do produto 4: ");
	    double P4 = scanner.nextDouble();
	    
	    System.out.print("Digite o valor do produto 5: ");
	    double P5 = scanner.nextDouble();

	    System.out.print("Digite um valor a ser pago: ");
	    double pagamento = scanner.nextDouble();
	    
	    double troco = pagamento - (P1+P2+P3+P4+P5);
	    
	    System.out.print("O seu troco é de : R$" + troco);

	    scanner.close();

}
}
