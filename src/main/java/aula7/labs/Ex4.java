package aula7.labs;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] VetorA = new double[15];
        double[] VetorB = new double[15];

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("digite o valor");
            VetorA[i] = scanner.nextInt();

            VetorB[i] = Math.sqrt(VetorA[i]);
        }

        System.out.println("valor de A");
        for (int i = 0; i < VetorA.length; i++) {
            System.out.println(VetorA[i]);
        }

        System.out.println("valor de B");
        for (int i = 0; i < VetorB.length; i++) {
            System.out.println(VetorB[i]);
        }
    }
}
