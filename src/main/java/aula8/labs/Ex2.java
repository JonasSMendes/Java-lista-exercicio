package aula8.labs;

import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Random numeroRandom = new Random();
        int[][] matrizA = new int[10][10];


        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = numeroRandom.nextInt(100);
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.println(matrizA[i][j] + " ");
            }
            System.out.println();
        }

        int maiorL5 = 0;
        int menorL5 = 101;
        int linha5 = 5;

        for (int i = 0; i < matrizA[5].length; i++) {
            if (matrizA[linha5][i] > maiorL5){
                maiorL5 = matrizA[linha5][i];
            }
            if (matrizA[linha5][i] < menorL5){
                menorL5 = matrizA[linha5][i];
            }
        }

        System.out.println("maior valor da linha 5 = " + maiorL5);
        System.out.println("menor valor da linha 5 = " + menorL5);

        int maiorC7 = 0;
        int menorC7 = 101;
        int col7 = 7;

        for (int i = 0; i < matrizA.length; i++) {
            if (matrizA[i][col7] > maiorC7){
                maiorC7 = matrizA[i][col7];
            }
            if (matrizA[i][col7] < menorC7){
                menorC7 = matrizA[i][col7];
            }
        }

        System.out.println("maior valor da coluna 5 = " + maiorC7);
        System.out.println("menor valor da coluna 5 = " + menorC7);
    }
}
