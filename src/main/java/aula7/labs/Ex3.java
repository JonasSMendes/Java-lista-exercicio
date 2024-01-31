package aula7.labs;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("digite os valores:");
            vetorA[i] = scanner.nextInt();

            vetorB[i] = (vetorA[i] * vetorA[i]);
        }

        System.out.println("valor de A");
        for (int i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i]);
        }

        System.out.println("valor de B");
        for (int i = 0; i < vetorB.length; i++){
            System.out.println(vetorB[i]);
        }
    }
}
