package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc02B {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero = lerNumero(scan,"Entre como um primeiro numero");
		int numero2 = lerNumero(scan,"Entre como um segundo numero");

		validarMenor(numero, numero2);

	}

private static void validarMenor(int numero, int numero2) {
	int nenor;
	if (numero < numero2) {
		nenor = numero;
	} else {
		nenor = numero2;
	}
		
		System.out.println("O numero menor é  " + nenor);
	}

	private static int lerNumero(Scanner scan,String mensagem) {
		System.out.println(mensagem);
		return scan.nextInt();
	}

}