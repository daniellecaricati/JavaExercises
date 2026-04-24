package exerciciosCollection;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		
		
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		boolean encontrado = false;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o numero que você deseja encontrar: ");
		int numero = leia.nextInt();
		
		for (int i = 0; i < 10; i++) {
			
			if (vetor[i] == numero) {
				System.out.println("O número " + numero + "está localizado na posição: " + i);
				encontrado = true;
				break;
			}
		}
		
		if (!encontrado) {
			System.out.println("O número " + numero + " não foi encontrado!");	
		}
		leia.close();
	}
}
