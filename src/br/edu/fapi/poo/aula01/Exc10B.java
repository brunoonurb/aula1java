package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc10B {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int soma = entradaConjuntoDeNumeros(ler);

		resultado(soma);

	}

	public static int entradaConjuntoDeNumeros(Scanner ler) {
		System.out.println("Digite um conjunto de numeros desejado.");
		System.out.println("  Para FINALIZAR DIGITE |0|");

		int soma = 0;
		int numero = 0;
		do {
			System.out.println("--------------------");
			numero = lerNumeros(ler,"Digite um numero -> ");
			soma += numero;
		} while (numero != 0);
		return soma;
	}

	public static int lerNumeros(Scanner ler , String mensagen) {
		System.out.print(mensagen);
		return ler.nextInt();
	}

	public static void resultado(int soma) {
		System.out.println("----------------------------------------");
		System.out.println("A soma dos numeros digitados foi -> " + soma);
		System.out.println("----------------------------------------");
	}
}
