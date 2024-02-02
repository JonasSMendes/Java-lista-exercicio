package aula8.labs;

import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        Random numeroRandom = new Random();
        int[][] matrizA = new int[4][4];


        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = numeroRandom.nextInt(100);
            }
        }

        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int col = 0;

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                if (matrizA[i][j] > maior){
                    maior = matrizA[i][j];
                    linha = i;
                    col = j;
                }
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.println(matrizA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior valor = " + maior );
        System.out.println("Linha = " + linha );
        System.out.println("coluna = " + col );
    }
}
