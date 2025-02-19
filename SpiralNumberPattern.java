//Spiral Pattern of Numbers

import java.util.Scanner;

public class SpiralNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n = sc.nextInt();
        sc.close();

        int[][] spiral = new int[n][n];
        int value = 1, minRow = 0, maxRow = n - 1, minCol = 0, maxCol = n - 1;

        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value++;
            }
            minRow++;

            for (int i = minRow; i <= maxRow; i++) {
                spiral[i][maxCol] = value++;
            }
            maxCol--;

            for (int i = maxCol; i >= minCol; i--) {
                spiral[maxRow][i] = value++;
            }
            maxRow--;

            for (int i = maxRow; i >= minRow; i--) {
                spiral[i][minCol] = value++;
            }
            minCol++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", spiral[i][j]);
            }
            System.out.println();
        }
    }
}
