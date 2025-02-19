//Calculate Simple Interest

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal Amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (R): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time in years (T): ");
        double time = scanner.nextDouble();
        
        scanner.close();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + simpleInterest);
    }
}
