package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc17B {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int[] numeros = lerNumeros(ler);

		printarNumeros(numeros);
	}

	public static int[] lerNumeros(Scanner ler) {
		int[] numeros = new int[10];

		System.out.println("Digite 10 numeros.");
		System.out.println("------------------------");

		for (int i = 0; i < 10; i++) {
			lerNumero(ler, numeros, i,"Digite " + (i + 1) + "º numero.");
			for (int j = 0; j < i; j++) {
				i = validarNumeros(numeros, i, numeros[i] == numeros[j]);
			}
		}
		return numeros;
	}

	public static void lerNumero(Scanner ler, int[] numeros, int i,String mensagem) {
		System.out.println(mensagem);
		numeros[i] = ler.nextInt();
	}

	public static int validarNumeros(int[] numeros, int i, boolean b) {
		if (b) {
			System.out.println("------------------\n    ERRO!! \nJa existe esse numero no seu vetor");
			System.out.println("NUMEROS JA DIGITADOS NO VETOR");

			i--;
			listarNumeros(numeros, i);

			System.out.println(".");
			System.out.println("DIGITE NOVAMENTE");
		}
		return i;
	}

	public static void listarNumeros(int[] numeros, int i) {
		for (int k = 0; k <= i; k++) {
			System.out.print(numeros[k] + "|");
		}
	}

	public static void printarNumeros(int[] numeros) {
		System.out.println("--------------------------------------");
		System.out.println("Numeros que foram colocado no seu vetor.");
		System.out.println("---------------------------------------");

		for (int auxFor : numeros) {
			System.out.println(auxFor);
		}
	}
}
