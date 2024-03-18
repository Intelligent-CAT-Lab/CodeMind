import java.util.Scanner;

public class p02853 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers as input
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Initialize X and Y to 0
        int X = 0;
        int Y = 0;

        // Assign values based on the input for x
        if (x == 3) {
            X = 100000;
        } else if (x == 2) {
            X = 200000;
        } else if (x == 1) {
            X = 300000;
        } else {
            X = 0;
        }

        // Assign values based on the input for y
        if (y == 3) {
            Y = 100000;
        } else if (y == 2) {
            Y = 200000;
        } else if (y == 1) {
            Y = 300000;
        } else {
            Y = 0;
        }

        // Output the result
        if (x == 1 && y == 1) {
            System.out.println(X + Y + 400000);
        } else {
            System.out.println(X + Y);
        }

        // Close the scanner
        scanner.close();
    }
}