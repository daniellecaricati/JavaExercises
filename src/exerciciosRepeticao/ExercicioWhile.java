package exerciciosRepeticao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0; //Variavel para guardar idade
		int menores21 = 0; // Contador < 21
		int maiores50 = 0; // contador > 50
				
		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if (idade >= 0) {
				menores21 ++;
			}
			if (idade > 50) {
				maiores50++;
			}
		}
	System.out.println("\nTotal de pessoas menores de 21 anos: " + menores21);
	System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);
	}
}
