package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc16 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 numeros.");
        System.out.println("------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite "+(i+1)+"º numero.");
            numeros[i] = ler.nextInt();
        }
        System.out.println("--------------------------------------");
        for (int i = 9; i >=0 ; i--) {
            System.out.println( (i+1) +"º numero guardado no vetor -> "+numeros[i]);

        }
    }
}
