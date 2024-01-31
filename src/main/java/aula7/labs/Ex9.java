package aula7.labs;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;
        int media = 0;
        int qtt = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("digite seu valor");
            vetorA[i] = scanner.nextInt();

            if (vetorA[i] % 2 != 0){
                soma += vetorA[i];
                qtt++;
            }
        }

        media = soma / qtt;

        System.out.println("vator A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }
        System.out.println(soma);
        System.out.println("a media dos numeros impars é de: " + media);
    }

}
