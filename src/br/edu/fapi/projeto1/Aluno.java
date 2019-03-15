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

	v
	
	
	
}



