//Mirror Lower Star Triangle Pattern

import java.util.*;

public class LowerStarTrianglePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int number=sc.nextInt();
        sc.close();
        int m, n;

        for (m = 1; m <= number; m++) {
            for (n = 1; n < m; n++) {
                System.out.print(" ");
            }
            for (n = m; n <= number; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (m = number - 1; m >= 0; m--) {
            for (n = 0; n < m; n++) {
                System.out.print(" ");
            }
            for (n = m; n <= number - 1; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
