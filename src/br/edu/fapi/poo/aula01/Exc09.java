package br.edu.fapi.poo.aula01;

public class Exc09 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Soma "+soma + "+" + i + "=" +(soma+=i));
        }
        System.out.println("------------------------------------------");
        System.out.println("Soma total dos nomeros de 1 a 10 é "+soma);
    }
}
