package aula7.labs;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int maior = vetorA[0];
        int indexMaior = 0;
        int menos = vetorA[0];
        int indexMenor = 0;

        for (int i = 1; i < vetorA.length; i++) {
            System.out.println("digite seu valor");
            vetorA[i] = scanner.nextInt();

            if ( vetorA[i] > maior){
                maior = vetorA[i];
                indexMaior = i;
            }else if ( vetorA[i] <  menos){
                menos = vetorA[i];
                indexMenor = i;
            }
        }

        System.out.println("vator A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }

        System.out.println("A maior idade é " + maior + " que está na posição " + indexMaior);
        System.out.println("o menor idade é " + menos + " que está na posição " + indexMenor);
    }
}
