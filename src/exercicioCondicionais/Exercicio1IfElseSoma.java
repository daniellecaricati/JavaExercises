package exercicioCondicionais;

import java.util.Scanner;

public class Exercicio1IfElseSoma {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3, soma;
		
		System.out.println("Digite o número A: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		n3 = leia.nextInt();
		
		soma = n1 + n2;
		
		if (soma > n3){
			System.out.println("A Soma de A + B é Maior do que C.");		
		} else if  (soma < n3){
			System.out.println("A Soma de A + B é Menor do que C.");
		} else if (soma == n3) {
			System.out.println("A Soma de A + B é Igual a C.");
		}
		}

	}

