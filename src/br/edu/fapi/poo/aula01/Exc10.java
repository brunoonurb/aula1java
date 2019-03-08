package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um conjunto de numeros desejado.");
		System.out.println("  Para FINALIZAR DIGITE |0|");

		int soma = 0;
		int numero = 0;
		do {
			System.out.println("--------------------");
			System.out.print("Digite um numero -> ");
			numero = ler.nextInt();
			soma += numero;
		} while (numero != 0);

		System.out.println("----------------------------------------");
		System.out.println("A soma dos numeros digitados foi -> " + soma);
		System.out.println("----------------------------------------");

	}
}
