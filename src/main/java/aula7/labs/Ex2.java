package aula7.labs;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("de o valor da unidade " + i);
            vetorA[i] = scanner.nextInt();

            vetorB[i] = vetorA[i] * 2 ;
        }
        System.out.println("valor do vetor B");
        for (int i = 0; i < vetorA.length; i++){
            System.out.println(vetorB[i]);
        }
        System.out.println("valor do vetor A");
        for (int i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i]);
        }

    }
}
