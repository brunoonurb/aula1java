package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc03B {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numeroMes = lerNumeros(ler,"Entre com um numero de 1 a 12 .");

		validarMes(numeroMes);

	}

	private static int lerNumeros(Scanner ler, String mensagem) {
		System.out.println(mensagem);
		return ler.nextInt();
	}
	
	private static void validarMes(int numeroMes) {
		System.out.println("-----------------------------------");
		System.out.println("N     MES");
		
		switch (numeroMes) {
		case 1:
			System.out.println(numeroMes + "      Janeiro");
			break;
		case 2:
			System.out.println(numeroMes + "      Feverreiro");
			break;
		case 3:
			System.out.println(numeroMes + "      Marcio");
			break;
		case 4:
			System.out.println(numeroMes + "      Abril");
			break;
		case 5:
			System.out.println(numeroMes + "      Maio");
			break;
		case 6:
			System.out.println(numeroMes + "      Junho");
			break;
		case 7:
			System.out.println(numeroMes + "      Julho");
			break;
		case 8:
			System.out.println(numeroMes + "      Agosto");
			break;
		case 9:
			System.out.println(numeroMes + "      Setembro");
			break;
		case 10:
			System.out.println(numeroMes + "      Outubro");
			break;
		case 11:
			System.out.println(numeroMes + "      Novembro");
			break;
		case 12:
			System.out.println(numeroMes + "      Dezembro");
			break;
		default:
			System.out.println("Esse numero não representa nenhum mes no nosso calendario");
			break;
		}
	}

}
