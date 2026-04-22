package exercicioCondicionais;

import java.util.Scanner;

public class Exercicio2IfElseParOuImpar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int num;
		String pi;
		String np;
		
		System.out.println("Digite um numero: ");
		num = leia.nextInt();
		
		if (num % 2 == 0) {
			pi = "Par";			
		}else {		
			pi = "Impar"; 
		}
		
		
		
		if (num > 0) {
		np = "Positivo";	
		}else {
		np = "Negativo";}
		
		System.out.println ("O numero " + num + " é "+ pi + " e " + np);
	}
}

		