package javaapplication1;
import java.util.Scanner;

/*17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
Guilherme Postigo
Izadora Santos*/

public class TP01Ex17 {
	public static void main (String [] args){
	Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor de X: ");
    double x = scanner.nextDouble();

    System.out.print("Digite o valor de Y: ");
    double y = scanner.nextDouble();

    double exponenciacao = Math.pow(x, y);
    
    System.out.print("O resultado de X elevado a Y é: " + exponenciacao);

    scanner.close();
    
    /*
    Exp: É a função Math.exp(n), que calcula e^n.
    Ln: É a função Math.log(n), que calcula o logaritmo natural de n (base e).
    */
}
	}
