import java.util.Scanner;

public class p03609 {
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner scanner = new Scanner(System.in);

        // Read the two integers, x and t
        int x = scanner.nextInt();
        int t = scanner.nextInt();

        // Calculate and print the result
        System.out.println(Math.max(x - t, 0));
    }
}