// Java program to add two binary strings
import java.util.Scanner;

public class BinaryStringAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first binary string: ");
        String binary1 = scanner.next();
        
        System.out.print("Enter second binary string: ");
        String binary2 = scanner.next();
        
        String sum = Integer.toBinaryString(Integer.parseInt(binary1, 2) + Integer.parseInt(binary2, 2));
        
        System.out.println("Sum: " + sum);
        
        scanner.close();
    }
}
