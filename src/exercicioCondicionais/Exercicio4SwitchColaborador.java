package exercicioCondicionais;

import java.util.Scanner;

public class Exercicio4SwitchColaborador {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String nome, cargo = "";
		int codigo;
		double reajuste = 0;
		double salario;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Qual é o seu cargo?");
		System.out.println("Digite 1 para Gerente");
		System.out.println("Digite 2 para Vendedor");
		System.out.println("Digite 3 para Supervisor");
		System.out.println("Digite 4 para Motorista");
		System.out.println("Digite 5 para Estoquista");
		System.out.println("Digite 6 para Técnico de TI");
		
		codigo = leia.nextInt();
		
		System.out.println("Qual é o valor do seu salário? ");
		salario = leia.nextDouble();
		
		switch (codigo) {
			case 1:
				cargo = "Gerente";
				reajuste = 0.10;
				break;
			case 2:
				cargo = "Vendedor";
				reajuste = 0.07;
				break;
			case 3:
				cargo = "Supervisor";
				reajuste = 0.09;
				break;
			case 4:
				cargo = "Motorista";
				reajuste = 0.06;
				break;
			case 5:
				cargo = "Estoquista";
				reajuste = 0.05;
				break;
			case 6:
				cargo = "Técnico de TI";
				reajuste = 0.08;
				break;
			default:
				System.out.println("Código Inválido!");
		}
		
		salario = salario + (reajuste * salario);
		
		System.out.println("Nome do Colaborador: " + nome);
		System.out.println("Cargo:" + cargo);
		System.out.println("Novo Salário: R$ " + salario);					
	}
}
