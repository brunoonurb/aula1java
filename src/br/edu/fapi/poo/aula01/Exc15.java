package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite 5 numeros.");
		System.out.println("------------------------");

		int[] numeros = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite " + (i + 1) + "º numero.");
			numeros[i] = ler.nextInt();
		}

		System.out.println("---------------------");
		System.out.println("Numeros guaradado no vetor de 5 posições");

		for (int auxFor : numeros) {
			System.out.println(auxFor);
		}
	}
}
