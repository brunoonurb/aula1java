package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc18B {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int[] numeros = lerNumeros(ler);

		ordenarNumeros(numeros);

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

	public static void ordenarNumeros(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < i; j++) {
				if (numeros[j] > numeros[i]) {
					int aux = numeros[j];
					numeros[j] = numeros[i];
					numeros[i] = aux;
				}
			}
		}
	}

	public static void printarNumeros(int[] numeros) {
		System.out.println("VETOR EM ORDEM CRESCENTE");
		System.out.println("---------------------");

		for (int auxFor : numeros) {
			System.out.println(auxFor);
		}
	}
}
