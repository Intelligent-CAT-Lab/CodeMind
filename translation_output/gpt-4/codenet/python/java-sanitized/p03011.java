import java.util.Scanner;

public class p03011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integers from the user
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Calculate the sum of the integers
        int sum = a + b + c;

        // Find the maximum of the three integers
        int max = Math.max(a, Math.max(b, c));

        // Print the sum minus the maximum
        System.out.println(sum - max);

        scanner.close();
    }
}