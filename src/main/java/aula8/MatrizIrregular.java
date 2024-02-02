package aula8;

import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre o numero de pessoas entrevistadas");
        int numeroIntrevistado = scanner.nextInt();

        String[][] nomesFilhos = new String[numeroIntrevistado][];

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("quantos filhos você tem?");
            int qttFilhod = scanner.nextInt();

            nomesFilhos[i] = new String[qttFilhod];

            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println("Digite o nome do filho " + (j+1));
                nomesFilhos[i][j] = scanner.next();
            }
        }

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Pessoa " + (i + 1) + " tem " + nomesFilhos[i].length + "Filhos" );
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
}
