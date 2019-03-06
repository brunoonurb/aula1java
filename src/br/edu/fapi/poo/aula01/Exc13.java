package br.edu.fapi.poo.aula01;

import jdk.swing.interop.SwingInterOpUtils;

public class Exc13 {
    public static void main(String[] args) {
        System.out.println("Numeros em ordem DECREXCENTE de 100 a 0 e PAR");
        System.out.println("----------------------------");
        for (int i = 100; i >= 0; i--) {
            if (i % 2 == 0) System.out.println("O numero "+ i +"é PAR\n");
        }
    }
}
