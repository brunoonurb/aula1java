package br.edu.fapi.poo.aula01;

public class Exc09B {
	public static void main(String[] args) {
		int soma = somaDe1a10();

		resultadoSoma(soma);
	}

	public static int somaDe1a10() {
		int soma = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Soma " + soma + "+" + i + "=" + (soma += i));
		}
		return soma;
	}

	public static void resultadoSoma(int soma) {
		System.out.println("------------------------------------------");
		System.out.println("Soma total dos nomeros de 1 a 10 é " + soma);
	}
}
