import java.util.Scanner;

public class p03071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Calculating values
        int maxVal = Math.max(A + B, Math.max(2 * A - 1, 2 * B - 1));

        // Printing the maximum value
        System.out.println(maxVal);

        scanner.close();
    }
}