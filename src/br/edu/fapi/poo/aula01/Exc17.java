package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc17 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] numeros = new int[10];

		System.out.println("Digite 10 numeros.");
		System.out.println("------------------------");

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite " + (i + 1) + "º numero.");
			numeros[i] = ler.nextInt();
			for (int j = 0; j < i; j++) {
				if (numeros[i] == numeros[j]) {
					System.out.println("------------------\n    ERRO!! \nJa existe esse numero no seu vetor");
					System.out.println("NUMEROS JA DIGITADOS NO VETOR");
					
					i--;
					for (int k = 0; k <= i; k++) {
						System.out.print(numeros[k] + "|");
					}
					
					System.out.println(".");
					System.out.println("DIGITE NOVAMENTE");
				}
			}
		}

		System.out.println("--------------------------------------");
		System.out.println("Numeros que foram colocado no seu vetor.");
		System.out.println("---------------------------------------");
		
		for (int auxFor : numeros) {
			System.out.println(auxFor);
		}
	}
}
