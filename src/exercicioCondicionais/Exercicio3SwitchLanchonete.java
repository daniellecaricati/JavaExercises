package exercicioCondicionais;

import java.util.Scanner;

public class Exercicio3SwitchLanchonete {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int codigo, quant;
		String produto = "";
		double preco = 0;
		
		System.out.println("--------Menu Lanchonete-------");
		System.out.println("Digite 1 para escolher Cachorro Quente - Preço R$ 10.00");
		System.out.println("Digite 2 para escolher X-Salada - Preço R$ 15.00");
		System.out.println("Digite 3 para escolher X-Bacon - Preço R$ 18.00");
		System.out.println("Digite 4 para escolher Bauru - Preço R$ 12.00");
		System.out.println("Digite 5 para escolher Refrigerante - Preço R$ 8.00");
		System.out.println("Digite 6 para escolher Suco de Laranja - Preço R$ 13.00");
		codigo = leia.nextInt();
		
		System.out.println("Digite a quantidade necessária: ");
		quant = leia.nextInt();
		
		switch (codigo) { 
			case 1:
				produto = "Cachorro Quente";
				preco = 10.00;
				break;
			case 2:
				produto = "X-Salda";
				preco = 15.00;
				break;
			case 3:
				produto = "X-Bacon";
				preco = 18.00;
				break;
			case 4:
				produto = "Bauru";
				preco = 12.00;
				break;
			case 5:
				produto = "Refrigerante";
				preco = 8.00;
				break;
			case 6:
				produto = "Suco de laranja";
				preco = 13.00;
				break;
		}
		
		double total = quant * preco;
		
		System.out.println("\nProduto: " + produto);
		System.out.println("Valor total: R$ " + total);
	}
}
