package aula8;

public class matrizes {
    public static void main(String[] args) {
        double[][] listasMatrizes = new double[3][2];

        listasMatrizes[0][0] = 9;
        listasMatrizes[0][1] = 8;

        listasMatrizes[1][0] = 6;
        listasMatrizes[1][1] = 4;

        listasMatrizes[2][0] = 5;
        listasMatrizes[2][1] = 9;

        for (int i = 0; i < listasMatrizes.length; i++) {
            //System.out.println(listasMatrizes[i] + " ");
            for (int j = 0; j < listasMatrizes[i].length; j++) {
                System.out.println(listasMatrizes[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        listasMatrizes[1][1] = 0;

        for (int i = 0; i < listasMatrizes.length; i++) {
            for (int j = 0; j < listasMatrizes[i].length; j++) {
                System.out.println(listasMatrizes[i][j] + " ");
            }
            System.out.println();
        }

        double soma = 0;
        System.out.println("Calculando a media dos alunos");


        for (int i = 0; i < listasMatrizes.length; i++) {
            soma = 0;
            for (int j = 0; j < listasMatrizes[i].length; j++) {
                soma += listasMatrizes[i][j];
            }
            System.out.println("Media do aluno " + i + " é.. " + (soma/2));
        }

    }
}
