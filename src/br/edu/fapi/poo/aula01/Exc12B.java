package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc12B {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com 2 numero diferentes que sejam maior que 0 e menores que 11.\n");

		int[] numero = new int[2];
		numero[0] = lerNumero(ler, "Entre com o primeiro numero.");
		numero[1] = lerNumero(ler, "Entre com o segundo numero.");
		
		verificarMultiplos(numero);
	}


	private static int lerNumero(Scanner ler, String mensagem) {
		int numero = -1;
		while (numero < 0 || numero > 11) {
			System.out.println(mensagem);
			numero = ler.nextInt();
		}
		return numero;
	}

	private static void verificarMultiplos(int[] numero) {
		for (int i = 0; i < 1000; i++) {
			if ((i % numero[0] == 0) && (i % numero[1] == 0)) {
				System.out.println("-----------------------------------------------");
				System.out.println("O número " + i + " é multiplo por " + numero[0] + " e por " + numero[1]);
			}
		}
	}
	
}
