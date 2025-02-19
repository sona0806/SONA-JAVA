//Star Pascal’s Triangle

import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int k = scanner.nextInt();
        scanner.close();
        int a, b;

        for (a = 0; a <= k; a++) {
            for (b = 0; b <= k - a; b++) {
                System.out.print(" ");
            }

            int num = 1;
            for (b = 0; b <= a; b++) {
                System.out.print(" " + num);
                num = num * (a - b) / (b + 1);
            }
            System.out.println();
        }
    }
}
