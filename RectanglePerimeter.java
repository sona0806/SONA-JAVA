//Find the Perimeter of a Rectangle
import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length of Rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter Width of Rectangle: ");
        double width = scanner.nextDouble();
        
        scanner.close();

        double perimeter = 2 * (length + width);

        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}
