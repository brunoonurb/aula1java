package br.edu.fapi.poo.aula01;

public class Exc14 {
	public static void main(String[] args) {
		System.out.println("Numeros em ordem CREXCENTE de -1000 a 0 e IMPAR e MULTIPLOS por 9");
		System.out.println("----------------------------");

		for (int i = -1000; i <= 0; i++) {
			if (i % 2 != 0 && i % 9 == 0) {
				System.out.println("O numero " + i + " é IMPAR MULTIPLO por 9\n");
			}
		}

	}

}
