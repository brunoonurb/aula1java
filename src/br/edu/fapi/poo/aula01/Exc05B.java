package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc05B {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int opcao = lerOpcao(ler);

		saidaDeDados(opcao);

		System.out.println("-----------------------------------------");
	}

	private static int lerOpcao(Scanner ler) {
		System.out.println("-----------------------------------------");
		System.out.println("CODIGO |       OPÇAO     ");
		System.out.println("-----------------------------------------");
		System.out.println("  1    | Venda a Vista no dinheiro ");
		System.out.println("  2    | Venda a Vista no debito");
		System.out.println("  3    | 1x No no cartão de credito ");
		System.out.println("  4    | 3x Vezes com juros no cartão de creditos ");
		System.out.println("  5    | 6x No cartão de credito ");

		return ler.nextInt();
	}

	public static void saidaDeDados(int opcao) {
		System.out.println("-----------------------------------------");

		switch (opcao) {
		case 1:
			System.out.println("Desconto de 12%!");
			break;
		case 2:
			System.out.println("Desconto de 3%!");
			break;
		case 3:
			System.out.println("Mesmo preço");
			break;
		case 4:
			System.out.println("Acrescimo de 5%!");
			break;
		case 5:
			System.out.println("Acrescimo de 10%!");
			break;
		default:
			break;
		}
	}
}
