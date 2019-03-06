package br.edu.fapi.poo.aula01;

import java.util.Scanner;

public class Exc06 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float[] numeros = new float[2];

        System.out.println("==========================================");
        System.out.println("          CALCULTDORA");
        System.out.println("Entre com dois numeros inteiros ou 0.\n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Entre com o "+(i+1)+"º numero");
            numeros[i] = ler.nextFloat();
        }

        System.out.println("Código | Operação");
        System.out.println("   1   |   Soma ");
        System.out.println("   2   |   Subtrção ");
        System.out.println("   3   |   Multiplicação ");
        System.out.println("   4   |   Divisão ");

        int opcao = ler.nextInt();
        float result;

        System.out.println("==========================================");
        switch (opcao){
            case 1:
                result= numeros[0]+numeros[1];
                System.out.println("Resultado é = " + (int)result);
                break;
            case 2:
                result= numeros[0]-numeros[1];
                System.out.println("Resultado é = " + (int)result);
                break;
            case 3:
                result= numeros[0]*numeros[1];
                System.out.println("Resultado é = "+ (int)result);
                break;
            case 4:
                if(numeros[1] <= 0){
                    System.out.println("Não é possível dividir por 0");
                }else{
                    System.out.println("Resultado é = "+(numeros[0]/numeros[1]));
                }

                break;
             default:
                 System.out.println("Codico não disponivel");
        }


    }
}
