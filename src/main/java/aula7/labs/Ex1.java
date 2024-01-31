package aula7.labs;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] b = new int[A.length];

        for (int i = 0; i < A.length; i++){
            System.out.println("entre com o valor da posição " + i);
            A[i] = scanner.nextInt();
            b[i] = A[i];
        }

        System.out.print("vetor A = ");
        for (int i = 0; i < A.length; i++){
            System.out.println(A[i] + "");
        }
        System.out.println();

        System.out.print("vetor B = ");
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i] + "");
        }
        System.out.println();
    }
}
