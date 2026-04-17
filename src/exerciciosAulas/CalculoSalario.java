package exerciciosAulas;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salario, abono, novosalario;
		
		System.out.println("Qual é o valor do seu salário? ");
		salario = leia.nextFloat();
		
		System.out.println("Qual é o valor do seu abono? ");
		abono = leia.nextFloat();
		
		novosalario = salario + abono;
		
		System.out.println("O valor do Novo Salario é : " + novosalario);

	}

}
