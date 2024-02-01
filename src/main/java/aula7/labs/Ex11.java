package aula7.labs;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;
        int qttIguais = 0;
        int somaAlto = 0;
        int media = 0;
        int qttSomaAlta = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("digite seu valor");
            vetorA[i] = scanner.nextInt();

            if (vetorA[i] < 15){
                soma += vetorA[i];
            } else if (vetorA[i] == 15) {
                qttIguais++;
            } else if (vetorA[i] > 15) {
                somaAlto += vetorA[i];
                qttSomaAlta++;
            }

        }

        media = somaAlto / qttSomaAlta;

        System.out.println("vator A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }

        System.out.println("A soma de numeros menores que 15 é de: " + soma);
        System.out.println("A quantidade de numeros iguais a 15 é de " + qttIguais);
        System.out.println("A media dos numeros maiores que 15 é de " + media);
    }
}
