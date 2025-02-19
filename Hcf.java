//  Java program to find the HCF
import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int hcf = findHCF(num1, num2);
        
        System.out.println("HCF: " + hcf);
        
        scanner.close();
    }

    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
