import java.util.Scanner;

public class p03547 {
    public static void main(String[] args) {
        // Define the constants
        final int A = 10;
        final int B = 11;
        final int C = 12;
        final int D = 13;
        final int E = 14;
        final int F = 15;

        // Read input
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String N = input[0];
        String M = input[1];

        // Compare and print result
        if (N.compareTo(M) > 0) {
            System.out.println(">");
        } else if (N.compareTo(M) == 0) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
    }
}