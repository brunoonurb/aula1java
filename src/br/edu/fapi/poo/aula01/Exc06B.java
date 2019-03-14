package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc06B {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("==========================================");
		System.out.println("          CALCULADORA");
		float[] numeros = entradaDeValores(ler);

		int opcao = escolhaOpcao(ler);

		resultadoFinal(numeros, opcao);
	}

	public static float[] entradaDeValores(Scanner ler) {
		System.out.println("Entre com dois numeros inteiros ou 0.\n");

		float[] numeros = new float[2];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=lerNumero(ler,"Digite " + (i + 1) + "º numero.");
		}
		return numeros;
	}

	public static float lerNumero(Scanner ler, String mensagem) {
		System.out.println(mensagem);
		return ler.nextInt();
	}

	public static int escolhaOpcao(Scanner ler) {
		System.out.println("Código | Operação");
		System.out.println("   1   |   Soma ");
		System.out.println("   2   |   Subtração ");
		System.out.println("   3   |   Multiplicação ");
		System.out.println("   4   |   Divisão ");

		return ler.nextInt();
	}

	public static void resultadoFinal(float[] numeros, int opcao) {
		System.out.println("==========================================");
		float result;
		switch (opcao) {
		case 1:
			soma(numeros);
			break;
		case 2:
			subtracao(numeros);
			break;
		case 3:
			multiplicacao(numeros);
			break;
		case 4:
			divisao(numeros);

			break;
		default:
			System.out.println("Codico não disponivel");
		}
	}

	public static void soma(float[] numeros) {
		float result;
		result = numeros[0] + numeros[1];
		System.out.println("Resultado é = " + (int) result);
	}

	public static void subtracao(float[] numeros) {
		float result;
		result = numeros[0] - numeros[1];
		System.out.println("Resultado é = " + (int) result);
	}

	public static void multiplicacao(float[] numeros) {
		float result;
		result = numeros[0] * numeros[1];
		System.out.println("Resultado é = " + (int) result);
	}

	public static void divisao(float[] numeros) {
		if (numeros[1] <= 0) {
			System.out.println("Não é possível dividir por 0");
		} else {
			System.out.println("Resultado é = " + (numeros[0] / numeros[1]));
		}
	}
}
