package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc16B {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int[] numeros = lerNumeros(ler);

		printarNumeros(numeros);
	}

	public static int[] lerNumeros(Scanner ler) {
		System.out.println("Digite 10 numeros.");
		System.out.println("------------------------");

		int[] numeros = new int[10];
		for (int i = 0; i < 10; i++) {
			numeros[i]=lerNumero(ler,"Digite " + (i + 1) + "º numero.");
		}
		return numeros;
	}

	public static int lerNumero(Scanner ler, String mensagem) {
		System.out.println(mensagem);
		return ler.nextInt();
	}

	public static void printarNumeros(int[] numeros) {
		System.out.println("--------------------------------------");

		for (int i = 9; i >= 0; i--) {
			System.out.println((i + 1) + "º numero guardado no vetor -> " + numeros[i]);

		}
	}
}
