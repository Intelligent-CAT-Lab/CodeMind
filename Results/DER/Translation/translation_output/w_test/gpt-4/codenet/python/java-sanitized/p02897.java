import java.util.Scanner;

public class p02897 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close(); // close the scanner after we're done using it

        // In Java, we don't have Python's // operator, so we simulate it with
        // (N + 1) / 2 for the ceiling division if N is odd
        double result = ((N % 2 == 0) ? (N / 2) : ((N + 1) / 2)) / (double) N;
        System.out.printf("%.10f\n", result);
    }
}