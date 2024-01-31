package aula7.labs;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("digite seu valor");
            vetorA[i] = scanner.nextInt();

            soma = soma + vetorA[i];
        }

        System.out.println("vator A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }

        System.out.println("a soma dos valores do vetor A: " + soma);
    }
}
