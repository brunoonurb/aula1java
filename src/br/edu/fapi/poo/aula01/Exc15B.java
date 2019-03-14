package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc15B {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int[] numeros = lerNumeros(ler);

		printarNumeros(numeros);
	}

	public static int[] lerNumeros(Scanner ler) {
		System.out.println("Digite 5 numeros.");
		System.out.println("------------------------");


		int[] numeros = new int[5];
		for (int i = 0; i < 5; i++) {
			numeros[i]=lerNumero(ler,"Digite " + (i + 1) + "º numero.");
		}
		return numeros;
	}

	public static int lerNumero(Scanner ler, String mensagem) {
		System.out.println(mensagem);
		return ler.nextInt();
	}

	public static void printarNumeros(int[] numeros) {
		System.out.println("---------------------");
		System.out.println("Numeros guaradado no vetor de 5 posições");

		for (int auxFor : numeros) {
			System.out.println(auxFor);
		}
	}
}
