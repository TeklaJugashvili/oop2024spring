import java.util.Scanner;

public class CirclesAreaCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            if (radius <= 0) {
                System.out.println("Radius must be a positive number.");
            } else {
                double area = calculateCircleArea(radius);
                System.out.println("The area of the circle is: " + area);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    
}

}
