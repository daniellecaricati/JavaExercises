package exerciciosAulas;

import java.util.Scanner;

public class CalculoSalarioLiquido {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float salariobruto, adicionalnoturno, horasextras, descontos, salarioliquido;
		
		System.out.println("Qual é o valor do seu salário bruto? ");
		salariobruto = leia.nextFloat();
		
		System.out.println("Qual é o valor do seu adicional noturno? ");
		adicionalnoturno = leia.nextFloat();
		
		System.out.println("Qual é o valor das horas extras? ");
		horasextras = leia.nextFloat();
		
		System.out.println("Qual é o valor dos descontos? ");
		
		descontos = leia.nextFloat();
		
		salarioliquido = salariobruto + adicionalnoturno + (horasextras * 5) - descontos;
		
		
		System.out.println("O valor do seu Salário Líquido é : " + salarioliquido);


	}

}
