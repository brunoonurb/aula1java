package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc12B {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);



		int[] numero = lerNumeros(ler);

		printarNumeros(numero);
	}

	public static int[] lerNumeros(Scanner ler) {
		System.out.println("Entre com 2 numero diferentes que sejam maior que 0 e menores que 11.\n");

		int[] numero = new int[2];
		for (int i = 0; i < 2; i++) {
			numero[i]=lerNumero(ler,"Digite " + (i + 1) + "º numero.");

			i = validarNumero(numero, i);
		}
		return numero;
	}

	public static int lerNumero(Scanner ler, String mensagem) {
		System.out.println(mensagem);
		return ler.nextInt();
	}

	public static int validarNumero(int[] numero, int i) {
		if (numero[i] <= 0 || numero[i] >= 11 || numero[0] == numero[1]) {
			i--;
		}
		return i;
	}

	public static void printarNumeros(int[] numero) {
		for (int i = 0; i < 1000; i++) {
			if ((i % numero[0] == 0) && (i % numero[1] == 0)) {
				System.out.println("-----------------------------------------------");
				System.out.println("O número " + i + " é multiplo por " + numero[0] + " e por " + numero[1]);
			}
		}
	}
}

