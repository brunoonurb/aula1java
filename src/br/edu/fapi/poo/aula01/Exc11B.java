package br.edu.fapi.poo.aula01;

public class Exc11B {
	public static void main(String[] args) {
		Printarnumeros();
	}

	public static void Printarnumeros() {
		for (int i = 0; i < 1000; i++) {
			if ((i % 2 == 0) && (i % 3 == 0)) {
				System.out.println("O número " + i + " é par e multiplo por três\n");
			}
		}
	}
}