//Calculate Compound Interest

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal Amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (R): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time in years (T): ");
        double time = scanner.nextDouble();
        
        scanner.close();

        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest = " + compoundInterest);
    }
}
