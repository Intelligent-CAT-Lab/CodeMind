import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        // Convert input to integers
        int[] x = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            x[i] = Integer.parseInt(input[i]);
        }

        // Assign a and b
        int a = x[0];
        int b = x[1];

        // Find and print minimum
        System.out.print(Math.min(a, b) + " â–ˆ ");

        // Compute and print the other value
        if (Math.abs(a - b) >= 2) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}