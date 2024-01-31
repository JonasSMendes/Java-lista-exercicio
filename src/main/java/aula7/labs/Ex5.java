package aula7.labs;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("digite seu valor");
            vetorA[i] = scanner.nextInt();

            vetorB[i] = vetorA[i] * i;
        }

        System.out.println("vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }


        System.out.println("vetor B");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }

    }
}
