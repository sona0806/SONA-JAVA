// Java program to add two complex numbers
import java.util.Scanner;

public class AddComplexNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter real and imaginary part of first complex number: ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        
        System.out.print("Enter real and imaginary part of second complex number: ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        
        double realSum = real1 + real2;
        double imagSum = imag1 + imag2;
        
        System.out.println("Sum: " + realSum + " + " + imagSum + "i");
        
        scanner.close();
    }
}
