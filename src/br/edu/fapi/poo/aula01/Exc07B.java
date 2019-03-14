package br.edu.fapi.poo.aula01;

public class Exc07B {
	public static void main(String[] args) {
		repitindo15Vezes();
	}

	public static void repitindo15Vezes() {
		int i = 0;
		while (i < 10) {
			System.out.println("-----------------------------------------------");
			System.out.println("Ola eu sou uma estruturar de repetição |" + (++i));
		}
	}
}
