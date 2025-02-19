// Java program to check and display Armstrong numbers between two given integers
import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the lower limit: ");
        int low = scanner.nextInt();
        
        System.out.print("Enter the upper limit: ");
        int high = scanner.nextInt();
        
        System.out.println("Armstrong numbers between " + low + " and " + high + ":");
        for (int i = low; i <= high; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }

    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = 0;
        
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        return sum == num;
    }
}
