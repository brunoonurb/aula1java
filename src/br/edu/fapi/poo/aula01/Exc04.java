package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc04 {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);
        int [] numero = new int[3];

        System.out.println("\nENTRE COM 3 NUMERO INTEIROS E POSITIVOS\n");
        for (int i = 0; i <3 ; i++) {
            System.out.println("Entre com "+(i+1)+"º numero");
            numero[i]=ler.nextInt();
            System.out.println (numero[i] + " numero");
        }
        for (int i = 0; i <2 ; i++) {
            for (int j =i+1 ; j <3 ; j++) {
                if (numero[i] > numero[j]) {
                    int aux=numero[i];
                    numero[i] = numero[j];
                    numero[j] = aux;
                }
            }
        }



        System.out.println("-------------------------------");
        System.out.println("Numeros em ordem crescente");
        for (int aux1 :numero) {
            System.out.println (aux1 + " numero");
        }



    }
}
