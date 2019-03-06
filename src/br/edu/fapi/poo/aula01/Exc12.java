package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com 2 numero difernte que seja maior que 0 e menos 11.\n" );

        int[] numero = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Entre com o " + (i + 1) + "º numero." );
            numero[i] = ler.nextInt();

            if (numero[i] <= 0 || numero[i] >= 11 || numero[0] == numero[1]) {
                i--;
            }
        }
        for (int i = 0; i < 1000; i++) {
            if ((i % numero[0] == 0) && (i % numero[1] == 0)) {
                System.out.println("-----------------------------------------------");
                System.out.println("O número " + i + " é multiplo por " + numero[0] + " e por " + numero[1]);
            }

        }

    }
}
