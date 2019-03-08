package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc18 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite 10 numeros.");
		System.out.println("------------------------");

		int[] numeros = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite " + (i + 1) + "º numero.");
			numeros[i] = ler.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < i; j++) {
				if (numeros[j] > numeros[i]) {
					int aux = numeros[j];
					numeros[j] = numeros[i];
					numeros[i] = aux;
				}
			}
		}

		System.out.println("VETOR EM ORDEM CRESCENTE");
		System.out.println("---------------------");
		
		for (int auxFor : numeros) {
			System.out.println(auxFor);
		}
	}
}
