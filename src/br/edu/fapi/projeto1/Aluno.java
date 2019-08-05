package br.edu.fapi.projeto1;

public class Aluno {
	String nome;
	int idade;
	private String matricula;
	double nota1;
	double nota2;
	private float credito;
	
	public String getMatricula() {
		return matricula;
	}
	
	public float getCredito(String nome) {
		if ("Savio".equalsIgnoreCase(nome)) {
			return 0.00f;
		}else if ("Bruno".equalsIgnoreCase(nome)){	
			return 2.00f;
		}else if("Erica".equalsIgnoreCase(nome)) {
			return credito / 2;
		}else {
			System.out.println("cai fora não conheço");
		}
		return 0.00f;
	}
	
	public void setCredito(float credito) {
		this.credito = credito;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double mediaAluno(double nota1 , double nota2) {
		System.out.println(" Sua media é");
		
	return nota1 + nota2 / 2;	
	}
	
	public void falarNome (String nome) {
		System.out.println("meu nome é " + nome);
	}
	
	
	
	
}



