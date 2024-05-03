import java.util.Arrays;
import java.util.Scanner;

public class p03292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] A = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            A[i] = Integer.parseInt(parts[i]);
        }

        int b = Math.abs(A[0] - A[1]) + Math.abs(A[0] - A[2]);

        int c = Math.abs(A[0] - A[1]) + Math.abs(A[1] - A[2]);
        int d = Math.abs(A[0] - A[2]) + Math.abs(A[1] - A[2]);

        System.out.println(Math.min(b, Math.min(c, d)));
    }
}