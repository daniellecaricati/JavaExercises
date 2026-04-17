package exerciciosAulas;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Insira nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Insira nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Insira nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Insira nota 4: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println ("Média final: " + media);

	}

}
