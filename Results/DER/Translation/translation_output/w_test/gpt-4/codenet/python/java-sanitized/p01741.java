import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        double n = scanner.nextDouble();
        scanner.close();

        // Calculate the output based on the given Python logic
        double result = (n * Math.sqrt(2)) < (Math.floor(n) + 1) ? (Math.floor(n) + 1) : (n * Math.sqrt(2));

        // Output the result formatted to 12 decimal places
        System.out.println(String.format("%.12f", result));
    }
}