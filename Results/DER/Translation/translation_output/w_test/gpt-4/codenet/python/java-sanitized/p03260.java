import java.util.Scanner;

public class p03260 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Determine if both numbers are odd
        if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}