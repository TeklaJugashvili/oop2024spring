import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of levels for the triangle: ");
            int levels = scanner.nextInt();

            if (levels <= 0) {
                System.out.println("Number of levels must be a positive integer.");
            } else {
                printTriangle(levels);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer for the number of levels.");
        } finally {
            scanner.close();
        }
    }

    public static void printTriangle(int levels) {
        for (int i = 1; i <= levels; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

