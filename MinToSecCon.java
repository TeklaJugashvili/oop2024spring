import java.util.Scanner;
public class MinToSecCon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of minutes: ");
            int minutes = scanner.nextInt();

            if (minutes < 0) {
                System.out.println("Minutes must be a non-negative integer.");
            } else {
                int seconds = convertMinutesToSeconds(minutes);
                System.out.println(minutes + " minutes is equal to " + seconds + " seconds.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer for minutes.");
        } finally {
            scanner.close();
        }
    }

    public static int convertMinutesToSeconds(int minutes) {
        return minutes * 60;
    }
}

