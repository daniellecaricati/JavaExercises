package exerciciosRepeticao;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner (System.in);
		 int numero; // Variavel para alocar cada numero
		 int pares = 0; // contador para numeros pares
		 int impares = 0; // contador para numeros impares
		 
		 //Para repetir 10 vezes
		 for (int i = 1; i < 11; i ++) {
			 System.out.println("Digite o " + i + "º numero");
			 numero = leia.nextInt(); // le o numero
			 
			 if (numero % 2 == 0) {
					pares++; 	// Aumenta numeros no contador
				} else {		
					impares ++; // Auamenta numeros no contador
				}}
		// Mostrar resultado	 
		System.out.println("\nTotal de numeros pares: " + pares);
		System.out.println("Total de numeros impares: " + impares);			
	}
}
