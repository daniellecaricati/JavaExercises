package exerciciosCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollectionSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		//Repetição para pedir 10 numeros
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número inteiro: ");
			int num = leia.nextInt();
			
			// adiciona numero ao collection
			numeros.add(num); 
		}
		//Usar iterator para percorrer valores
		System.out.println("\nListar dados do Set: ");
		Iterator<Integer> iterator = numeros.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//Procurar o numero 
		System.out.println("\nDigite o número que você deseja encontrar: ");
		int busca = leia.nextInt();
		
		//Verificar se o numero existe
		if(numeros.contains(busca)) {
			System.out.println("O número " + busca + " foi encontrado!");
		}else {
			System.out.println("O número " + busca + " não foi encontrado!");
		}
		leia.close();
	}
}
