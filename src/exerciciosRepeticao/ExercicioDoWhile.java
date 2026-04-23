package exerciciosRepeticao;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num;
		int soma = 0;
		
		do {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			
			if (num > 0) {
				soma += num;
			}
		} while (num != 0); {
			System.out.println("\nA soma dos numeros positivos é: " + soma); 
		}
	}
}
