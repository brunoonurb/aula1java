package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc01 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Entre como um primeiro numero");
		int numero = ler.nextInt();

		System.out.println("Entre como um primeiro numero");
		int numero2 = ler.nextInt();

		int maior;
		if (numero > numero2) {
			maior = numero;
		} else {
			maior = numero2;
		}
	
		System.out.println("O numero maior é  " + maior);

	}

}
