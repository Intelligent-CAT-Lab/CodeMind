import java.util.Scanner;

public class p02696 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read integers A, B, N from the input
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        // Perform the calculation and print the result
        System.out.println((int) ((long) A * Math.min(B - 1, N) / B));
    }
}