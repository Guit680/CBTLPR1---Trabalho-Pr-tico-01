package javaapplication1;
import java.util.Scanner;

/*
14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados. 
*/

public class TP01Ex14 {
	public static void main (String [] args){
	    Scanner scanner = new Scanner (System.in);
	    
	    System.out.println("Digite o valor da aresta do cubo (a):");
        double aresta = scanner.nextDouble();

        System.out.println("Digite o valor do raio da esfera (r):");
        double raio = scanner.nextDouble();

        double volCubo = Math.pow(aresta, 3);
        double volEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        double volLivre = volCubo - volEsfera;

        System.out.printf("O volume livre no ambiente é: " + volLivre);

        scanner.close();
	    }
}
