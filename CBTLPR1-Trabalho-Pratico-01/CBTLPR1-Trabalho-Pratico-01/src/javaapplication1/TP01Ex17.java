package javaapplication1;
import java.util.Scanner;

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
