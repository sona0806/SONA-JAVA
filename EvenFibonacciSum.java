// Find Even Sum of Fibonacci Series Till number N

import java.util.*;
public class EvenFibonacciSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        scanner.close();
        
        System.out.println("Sum of even Fibonacci numbers up to " + N + " is: " + evenFibonacciSum(N));
    }

    public static int evenFibonacciSum(int N) {
        int a = 0, b = 1, sum = 0;

        while (b <= N) {
            if (b % 2 == 0) {
                sum += b;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        return sum;
    }
}
