package br.edu.fapi.poo.aula01;

public class Exc08B {
	public static void main(String[] args) {
		repitindo15Vezes();
	}

	public static void repitindo15Vezes() {
		int cont = 0;
		while (cont < 15) {
			System.out.println("ola eu sou uma estrutura de repetição (" + (++cont) + "º)");
		}
	}
}
