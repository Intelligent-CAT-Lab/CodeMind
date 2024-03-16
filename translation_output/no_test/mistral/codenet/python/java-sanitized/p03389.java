import java.util.Arrays;
import java.util.Scanner;

public class p03389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];
        int[] C = new int[3];

        Arrays.fill(A, scanner.nextInt());
        Arrays.fill(B, scanner.nextInt());
        Arrays.fill(C, scanner.nextInt());

        Arrays.sort(A);
        int s = 0;

        for (int i = 0; i < 2; i++) {
            int tmp = A[2] - A[i];
            s += tmp / 2;
            A[i] += tmp / 2 * 2;
        }

        s += Arrays.stream(A).sum() % 3;

        System.out.println(s);
    }
}