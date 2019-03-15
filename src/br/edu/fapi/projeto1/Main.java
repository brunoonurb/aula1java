package br.edu.fapi.projeto1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		aluno.getCredito("Bruno");
		
		System.out.println("Entre com seu nome");
		aluno.nome=scan.nextLine();
		
		System.out.println("Entre com seu nome");
		aluno.idade = scan.nextInt();
		
		System.out.println("Entre com sua matricula");
		aluno.matricula = scan.nextLine();
		
		System.out.println("Entre com sua primera nota");
		aluno.nota1=scan.nextDouble();
		
		System.out.println("Entre com sua segunda nota!");
		aluno.nota2=scan.nextDouble();
		
		
		
	}

}
