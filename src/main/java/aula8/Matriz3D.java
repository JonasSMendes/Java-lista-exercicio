package aula8;

public class Matriz3D {
    public static void main(String[] args) {
        double[][][] matriz = new double[3][3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    matriz[i][j][k] = i + j + k;

                    System.out.println("matrizes3D");
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
        System.out.println();
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    soma += matriz[i][j][k];
                }
            }
        }

        System.out.println(soma);
    }
}
