package aula7.labs;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtt = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("coloque o valor");
            vetorA[i] = scanner.nextInt();


            if (vetorA[i] % 2 == 0 ){
                qtt++;
            }
        }

        System.out.println("vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }

        System.out.println("quantidade de numeros pares: " + qtt);
    }
}
