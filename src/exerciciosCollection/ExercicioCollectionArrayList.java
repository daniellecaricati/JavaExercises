package exerciciosCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioCollectionArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	
		//Para criar ArrayList
		ArrayList<String> cores = new ArrayList<String>();
		
		// Repetição para pedir as 5 cores
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			String cor = leia.next();
			
			// adicionar cor na lista	
			cores.add(cor); 
		}
		// Mostrar todas as cores 
		System.out.println("\nListar todas as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		//Ordenar lista em ordem alfabética
		Collections.sort(cores);
		
		//Mostrar cores
		System.out.println("\nOrdenar as cores: ");
		for (String cor: cores) {
			System.out.println(cor);
		}
		leia.close();
	}
}
