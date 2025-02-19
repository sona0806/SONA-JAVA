//Mirror Upper Star Triangle Pattern

import java.util.*;

public class MirrorUpperStarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int size = sc.nextInt();
        sc.close();

        for (int m = size - 1; m >= 0; m--) {
            for (int n = 0; n < m; n++) {
                System.out.print(" ");
            }
            for (int n = m; n <= size - 1; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int m = 1; m <= size; m++) {
            for (int n = 1; n < m; n++) {
                System.out.print(" ");
            }
            for (int n = m; n <= size; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
