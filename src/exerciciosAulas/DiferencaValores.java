package exerciciosAulas;

import java.util.Scanner;

public class DiferencaValores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Insira o numero 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Insira o numero 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Insira o numero 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Insira o numero 4: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println ("A diferença é: " + diferenca);
	}

}
