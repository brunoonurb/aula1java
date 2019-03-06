package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc02 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Entre como  primeiro numero");
        int numero = ler.nextInt();
        System.out.println("Entre como segundo numero");
        int numero2 = ler.nextInt();

        int nenor;
        if(numero<numero2) nenor=numero;
        else nenor=numero2;
        System.out.println("O numero menor é  "+ nenor);

    }

}
