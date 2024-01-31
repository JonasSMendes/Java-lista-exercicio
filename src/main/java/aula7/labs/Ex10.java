package aula7.labs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qttPar = 0;
        int qttImpar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("digite seu valor");
            vetorA[i] = scanner.nextInt();

            if (vetorA[i] % 2 != 0){
                qttImpar++;
            }else {
                qttPar++;
            }

        }

        int porcentoImpar = qttImpar * vetorA.length;
        int porcentoPar = qttPar * vetorA.length;

        System.out.println("vator A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }

        System.out.println("quantidade de numero impar: " + porcentoImpar + "%");
        System.out.println("quantidade de numero par: " + porcentoPar + "%");

    }
}
