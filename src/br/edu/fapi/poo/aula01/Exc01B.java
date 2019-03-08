package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc01B {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero = lerNumero(ler, "Entre como um primeiro numero");

		int numero2 = lerNumero(ler, "Entre como um segundo numero");

		validarMaior(numero, numero2);
	}

	private static int lerNumero(Scanner ler, String mensagem) {
		System.out.println(mensagem);
		return ler.nextInt();
	}

	private static void validarMaior(int numero, int numero2) {
		int maior;
		if (numero > numero2) {
			maior = numero;
		} else {
			maior = numero2;
		}

		System.out.println("O numero maior é  " + maior);
	}
}
